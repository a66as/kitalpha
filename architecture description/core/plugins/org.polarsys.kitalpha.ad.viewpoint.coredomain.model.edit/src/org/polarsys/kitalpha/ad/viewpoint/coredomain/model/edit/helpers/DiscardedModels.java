/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.coredomain.model.edit.helpers;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;

/**
 * @author Thomas Guiu
 *
 */
public class DiscardedModels {
	private static Collection<String> discardedModels = new ArrayList<>();
	
	static {
		discardedModels.add("platform:/plugin/org.polarsys.kitalpha.report/model/report.ecore");
		discardedModels.add("platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore");
		discardedModels.add("platform:/plugin/org.eclipse.emf.ecore/model/XMLNamespace.ecore");
		discardedModels.add("platform:/plugin/org.eclipse.emf.ecore/model/XMLType.ecore");
		discardedModels.add("platform:/plugin/org.eclipse.emf.edit/model/Tree.ecore");
		discardedModels.add("platform:/plugin/org.eclipse.emf.ecore.change/model/Change.ecore");
		discardedModels.add("platform:/plugin/org.polarsys.kitalpha.ad.metadata/model/metadata.ecore");
		discardedModels.add("platform:/plugin/org.eclipse.emf.validation/model/validation.ecore");
		discardedModels.add("platform:/plugin/org.eclipse.e4.ui.model.workbench/model/UIElements.ecore");
		discardedModels.add("platform:/plugin/org.eclipse.e4.ui.model.workbench/model/ModelFragment.ecore");
		discardedModels.add("platform:/plugin/org.eclipse.sirius/model/contribution.ecore");
		discardedModels.add("platform:/plugin/org.eclipse.sirius/model/viewpoint.ecore");
		discardedModels.add("platform:/plugin/org.eclipse.emf.codegen.ecore/model/GenModel.ecore");
		discardedModels.add("platform:/plugin/org.eclipse.sirius.diagram/model/diagram.ecore");
		discardedModels.add("platform:/plugin/org.eclipse.gmf.runtime.notation/model/notation.ecore");
		discardedModels.add("platform:/plugin/org.eclipse.sirius/model/Environment.odesign");
		discardedModels.add("platform:/plugin/org.eclipse.sirius.diagram/model/DiagramEnvironment.odesign");
	}
	
	public static boolean isFiltered(URI uri) {
		String uriString = uri.toString();
		for (String path : discardedModels)
			if (uriString.endsWith(path))
				return true;
		return false;
	}
}
