/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.handlers.runtime;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Representation;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RepresentationElement;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.handlers.IRepresentationHandler;

/**
 * 
 * @author Thomas Guiu
 * 
 */
public class ViewpointRepresentationMetamodelHandler extends ViewpointManager.ElementHandler implements IRepresentationHandler {

	public ViewpointRepresentationMetamodelHandler(Viewpoint viewpoint, ViewpointManager mgr) {
		super(viewpoint, mgr);
	}

	public void removeRepresentations(List<RepresentationElement> elts) {
		if (getResourceManager().isReadOnly())
			throw new IllegalStateException();

		EList<RepresentationElement> models = getViewpoint().getRepresentation().getRepresentations();
		models.removeAll(elts);
		saveModel();
	}

	public void addRepresentations(List<RepresentationElement> elts) {
		if (getResourceManager().isReadOnly())
			throw new IllegalStateException();

		getViewpoint().getRepresentation().getRepresentations().addAll(elts);
		saveModel();
	}

	public List<ViewpointElement> getElements() {
		throw new UnsupportedOperationException();
	}

	public List<ViewpointElement> getElementsFromParents() {
		throw new UnsupportedOperationException();
	}

	public Representation getRepresentation() {
		return getViewpoint().getRepresentation();
	}

}
