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

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.Integration;
import org.polarsys.kitalpha.ad.viewpoint.integrationdomain.integration.UsedViewpoint;

/**
 * @author Thomas Guiu
 * 
 */
public class ViewpointIntegration {
	public void setUsage(TransactionalEditingDomain context, String id, boolean usage) {
		Integration integ = getIntegrationStorage(context);
		if (integ == null)
			throw new UnsupportedOperationException("cannot find integration resource");
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(context);
		editingDomain.getCommandStack().execute(new SetViewpointUsage(editingDomain, integ, id, usage));
	}

	public boolean isInUse(TransactionalEditingDomain context, String id) {
		Integration integ = getIntegrationStorage(context);
		if (integ != null) {
			for (UsedViewpoint uv : integ.getUsedViewpoints()) {
				if (id.equals(uv.getVpId()))
					return true;
			}
		}
		return false;
	}

	protected Integration getIntegrationStorage(TransactionalEditingDomain context) {
		// quick & dirty implementation: need a better way to store these
		// information
		for (Resource res : context.getResourceSet().getResources()) {
			if (res.getURI().toString().endsWith("integration")) {
				Integration integ = (Integration) res.getContents().get(0);
				return integ;
			}
		}
		return null;
	}
}
