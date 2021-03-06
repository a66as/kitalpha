/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.doc.gen.business.core.preference.ui;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.polarsys.kitalpha.doc.gen.business.core.preference.Activator;

/**
 * @author Boubekeur Zendagui
 */
public abstract class AbstractDocgenPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	/**
	 * An instance of {@link IPreferenceStore}
	 */
	protected final IPreferenceStore store = Activator.getDefault().getPreferenceStore();
	
	public AbstractDocgenPreferencePage() {
		super(FieldEditorPreferencePage.GRID);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(store);
	}
}
