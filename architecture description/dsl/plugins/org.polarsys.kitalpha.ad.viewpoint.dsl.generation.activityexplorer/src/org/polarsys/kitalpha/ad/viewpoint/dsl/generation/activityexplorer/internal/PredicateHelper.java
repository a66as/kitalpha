/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.activityexplorer.internal;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.PredicateElement;


/**
 * @author Boubekeur Zendagui
 */
public class PredicateHelper {

	public static boolean generatePredicate(PredicateElement element) {
		if (element instanceof Page)
		{
			Page page = (Page) element;
			final String fileExtensions = page.getFileExtensions();
			return  element.isHasPredicate() || (fileExtensions != null && fileExtensions.isEmpty() == false);
		}
		else
			return  element.isHasPredicate();
	}
}
