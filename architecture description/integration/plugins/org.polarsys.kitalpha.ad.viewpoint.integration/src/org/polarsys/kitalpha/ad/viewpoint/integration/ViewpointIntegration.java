/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.integration;

import java.util.ArrayList;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.Integration;
import org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.IntegrationFactory;
import org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.UsedViewpoint;

/**
 * @author Thomas Guiu
 * 
 */
public class ViewpointIntegration {
	public void setUsage(ResourceSet context, String id, boolean usage) {
		Integration integ = getIntegrationStorage(context);
		if (integ == null)
			throw new UnsupportedOperationException("cannot find integration resource");
		TransactionalEditingDomain transactionalEditingDomain = TransactionUtil.getEditingDomain(context);
		if (transactionalEditingDomain != null) {
			transactionalEditingDomain.getCommandStack().execute(new SetViewpointUsageCommand(transactionalEditingDomain, integ, id, usage));
		} else {
			for (UsedViewpoint uv : new ArrayList<UsedViewpoint>(integ.getUsedViewpoints())) {
				if (id.equals(uv.getVpId())) {
					if (usage)
						return; // object is already there, nothing to do
					integ.getUsedViewpoints().remove(uv);
				}
			}
			if (usage) {
				UsedViewpoint uv = IntegrationFactory.eINSTANCE.createUsedViewpoint();
				uv.setFiltered(false);
				uv.setVpId(id);
				integ.getUsedViewpoints().add(uv);
			}

		}
	}

	public void setFilter(ResourceSet context, String id, boolean filter) {
		Integration integ = getIntegrationStorage(context);
		if (integ == null)
			throw new UnsupportedOperationException("cannot find integration resource");
		TransactionalEditingDomain transactionalEditingDomain = TransactionUtil.getEditingDomain(context);
		if (transactionalEditingDomain != null) {
			transactionalEditingDomain.getCommandStack().execute(new SetViewpointFilterCommand(transactionalEditingDomain, integ, id, filter));
		} else {
			for (UsedViewpoint uv : new ArrayList<UsedViewpoint>(integ.getUsedViewpoints())) {
				if (id.equals(uv.getVpId())) {
					uv.setFiltered(filter);
				}
			}
		}
	}

	public boolean isInUse(ResourceSet context, String id) {
		Integration integ = getIntegrationStorage(context);
		if (integ != null) {
			for (UsedViewpoint uv : integ.getUsedViewpoints()) {
				if (id.equals(uv.getVpId()))
					return true;
			}
		}
		return false;
	}

	public boolean isFiltered(ResourceSet context, String id) {
		Integration integ = getIntegrationStorage(context);
		if (integ != null) {
			for (UsedViewpoint uv : integ.getUsedViewpoints()) {
				if (id.equals(uv.getVpId()))
					return uv.isFiltered();
			}
		}
		return false;
	}

	protected Integration getIntegrationStorage(ResourceSet context) {
		// quick & dirty implementation: need a better way to store these
		// information
		ResourceSet resourceSet = context;
		for (Resource res : resourceSet.getResources()) {
			if (res.getURI().toString().endsWith("integration")) {
				Integration integ = (Integration) res.getContents().get(0);
				return integ;
			}
		}
		// URI uri = eResource.getURI();
		// String path = uri.toPlatformString(true);
		// if (path.contains(".")) {
		// int index = path.lastIndexOf('.');
		// path = path.substring(0, index) + ".integration";
		// }
		// Resource resource =
		// resourceSet.getResource(URI.createPlatformResourceURI(path, true),
		// true);
		// if (!resource.getContents().isEmpty()) {
		// resourceSet.getResources().add(resource);
		// return (Integration) resource.getContents().get(0);
		// }
		// return null;
		throw new IllegalStateException("can't find integration resource");
	}
}
