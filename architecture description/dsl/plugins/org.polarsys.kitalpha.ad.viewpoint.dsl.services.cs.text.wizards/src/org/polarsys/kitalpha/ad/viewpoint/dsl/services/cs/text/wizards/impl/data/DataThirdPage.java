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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.data;

import org.eclipse.jface.viewers.ISelection;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.AbstractThirdPage;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class DataThirdPage extends AbstractThirdPage{
	
	public DataThirdPage(){
		super(Messages.DataFileThirdPage_Title);
	}
	
	public DataThirdPage(ISelection selection){
		super(Messages.DataFileThirdPage_Title);
	}

	@Override
	protected void initializeProperties() {
	}

	@Override
	protected boolean dataChanged() {
		return true;
	}
}
