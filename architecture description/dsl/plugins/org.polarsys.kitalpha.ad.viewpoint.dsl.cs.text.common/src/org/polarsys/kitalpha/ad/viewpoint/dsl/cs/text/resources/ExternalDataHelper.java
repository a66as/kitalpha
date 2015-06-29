/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.identifiers.MetamodelIDs;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.registry.DataWorkspaceEPackage;

import com.google.common.collect.Lists;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class ExternalDataHelper {
		
	private static final String MetamodelLoader_ExtensionPoint = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.common.externaldataloader";
	private static final String MetamodelLoader_configElement = "externaldataloader";
	private static final String MetamodelLoader_id = "id";
	private static final String NamespacePattern_configElement = "NamespacePattern";
	private static final String NamespacePattern_value = "value";
	
	
	public static final String IMPORTED_EPACKAGE = "ImportedEPackages";
		
	private static Map<String, List<Pattern>> metamodelLoaders;
	
	private static Map<String, URI> packagesInScopeURIs;
	
	private ExternalDataHelper() {}
	
	public static Map<String, URI> getPackagesInScopeURIs() {
		if (packagesInScopeURIs != null && !packagesInScopeURIs.isEmpty()) {
			return packagesInScopeURIs;
		}
		try{
			return lookupPackagesInScopeURis();
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Map<String, List<Pattern>> getAvailableMetamodelLoaders() {
		if (metamodelLoaders != null && !metamodelLoaders.isEmpty()) {
			return metamodelLoaders;
		}
		try {
			return lookupMetamodelLoaders();
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static Map<String, URI> lookupPackagesInScopeURis()  throws CoreException {
		packagesInScopeURIs= Collections.synchronizedMap(new LinkedHashMap<String, URI>());
		metamodelLoaders = getAvailableMetamodelLoaders();
		for (String loader: metamodelLoaders.keySet()) {
			List<Pattern> patternList = metamodelLoaders.get(loader);
			//Delegate finding packages to contributed loaders
			Map<String, URI> packagesFound = findPackagesInScopeURIs(patternList);
			for (Map.Entry<String, URI> candidate : packagesFound.entrySet()) {
				if (!packagesInScopeURIs.containsKey(candidate.getKey())){
					packagesInScopeURIs.put(candidate.getKey(), candidate.getValue());
				}
			}
		}
		return packagesInScopeURIs;
	}
	
	public static Map<String, List<Pattern>> lookupMetamodelLoaders() throws CoreException {
		metamodelLoaders = new HashMap<String, List<Pattern>>();
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(MetamodelLoader_ExtensionPoint);
		if (config.length != 0) {
			for (IConfigurationElement iConfigElement : config){
				if (iConfigElement.getName().toLowerCase().equals(MetamodelLoader_configElement.toLowerCase())) {
					//Get the loader
					String loaderId = iConfigElement.getAttribute(MetamodelLoader_id);
					List<Pattern> availablePatterns = Lists.newArrayList();
					IConfigurationElement[] patterns = iConfigElement.getChildren();
					//Get the patterns
					for (IConfigurationElement candidate : patterns){
						if (candidate.getName().toLowerCase().equals(NamespacePattern_configElement.toLowerCase())) {
							String value = candidate.getAttribute(NamespacePattern_value);
							Pattern namespacePattern = Pattern.compile(value);
							availablePatterns.add(namespacePattern);
						}
					}
					metamodelLoaders.put(loaderId, availablePatterns);
				}
			}
		}
		return metamodelLoaders;
	}
	
//	public static void addNsUriToMetampdelLoaders(String importId, String nsUri){
//		if (metamodelLoaders != null){
//			if (metamodelLoaders.get(importId) != null){
//				metamodelLoaders.get(importId).add(Pattern.compile(nsUri));
//			} else {
//				List<Pattern> importedMetamodels = Lists.newArrayList();
//				importedMetamodels.add(Pattern.compile(nsUri));
//				metamodelLoaders.put(IMPORTED_EPACKAGE, importedMetamodels);				
//			}
//		} else {
//			metamodelLoaders = getAvailableMetamodelLoaders();
//			addNsUriToMetampdelLoaders(importId, nsUri);
//		}
//	}
	
	public static boolean isPackageInScopeURIs(EPackage ePackage) {
		metamodelLoaders = getAvailableMetamodelLoaders();
		for (Map.Entry<String, URI> candidatePackage : getPackagesFromRegistry().entrySet()) {	
			for (String loader: metamodelLoaders.keySet()) {
				List<Pattern> patternList = metamodelLoaders.get(loader);
				for (Pattern candidate : patternList) {
					if (candidate.matcher(candidatePackage.getKey()).matches()) {
						return true;
					}
				}
			}
			if (MetamodelIDs.VPDSL_NAMESPACE_PATTERN.matcher(candidatePackage.getKey()).matches()) {
				return true;
			}
		}
		return false;
	}
	
	public static Map<String, URI> findPackagesInScopeURIs(List<Pattern> namespacePatterns) {
		 Map<String, URI> packagesInScopeURIs = Collections.synchronizedMap(new LinkedHashMap<String, URI>());
		 for (Map.Entry<String, URI> entry : getPackagesFromRegistry().entrySet()) {
			 for (Pattern candidate: namespacePatterns) {
				if (candidate.matcher(entry.getKey()).matches()) {
					packagesInScopeURIs.put(entry.getKey(), entry.getValue());
				}
			}
		 }
		return packagesInScopeURIs;
	}
	
	public static Map<String, URI> getPackagesFromRegistry() {
		Map<String, URI> ePackageNsURItoGenModelLocationMap = EcorePlugin.getEPackageNsURIToGenModelLocationMap();
		return ePackageNsURItoGenModelLocationMap;
	}
	
	public static EPackage loadEPackage(String resourceOrNsURI, ResourceSet resourceSet) {
		if (resourceSet.getPackageRegistry().containsKey(resourceOrNsURI))
			return resourceSet.getPackageRegistry().getEPackage(resourceOrNsURI);
		URI uri = URI.createURI(resourceOrNsURI);
		try {
			if ("http".equalsIgnoreCase(uri.scheme())){
				DataWorkspaceEPackage.INSTANCE.initializeDataWorkspaceRegistry(ResourcesPlugin.getWorkspace());
				EPackage ecoreModel = DataWorkspaceEPackage.INSTANCE.getEPackage(uri.toString());

				if (ecoreModel != null){
					EcoreUtil.resolveAll(ecoreModel);
					//resourceSet.getResources().add(ecoreModel.eResource());
					return ecoreModel;
				}
			}
			if (uri.fragment() == null) {
				Resource resource = resourceSet.getResource(uri, true);
				if (resource.getContents().isEmpty())
					return null;
				EPackage result = (EPackage) resource.getContents().get(0);
				return result;
			}
			EPackage result = (EPackage) resourceSet.getEObject(uri, true);
			return result;
		} catch (RuntimeException ex) {
			if (uri.isPlatformResource()) {
				String platformString = uri.toPlatformString(true);
				URI platformPluginURI = ResourceHelper.URIFix.createPlatformPluginURI(platformString, true);
				return loadEPackage(platformPluginURI.toString(), resourceSet);
			}
			return null;
		}
	}
}
