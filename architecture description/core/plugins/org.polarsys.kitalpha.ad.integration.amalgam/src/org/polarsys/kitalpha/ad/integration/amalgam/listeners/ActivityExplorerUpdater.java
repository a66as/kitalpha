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

package org.polarsys.kitalpha.ad.integration.amalgam.listeners;

import org.eclipse.amalgam.explorer.activity.ui.api.editor.ActivityExplorerEditor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager.OverallListener;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Thomas Guiu
 * 
 */
public class ActivityExplorerUpdater implements OverallListener {

	public void hasBeenDeactivated(Object ctx, Resource vp) {
		refresh(ctx);
	}

	public void hasBeenActivated(Object ctx, Resource vp) {
		refresh(ctx);
	}

	public void hasBeenFiltered(Object ctx, Resource vp) {
		refresh(ctx);
	}

	public void hasBeenDisplayed(Object ctx, Resource vp) {
		refresh(ctx);
	}

	private void refresh(Object ctx) {

		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			
			@Override
			public void run() {
				IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				if (activePage == null)
					return;
				for (IEditorReference ref : activePage.getEditorReferences()) {
					IEditorPart editor = ref.getEditor(false);
					if (editor != null && editor instanceof ActivityExplorerEditor) {
						ActivityExplorerEditor aeditor = (ActivityExplorerEditor) editor;
						aeditor.updateEditorPages( aeditor.getActivePage());
					}
				}
			}
		});
	}

}
