/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/ 

package org.polarsys.kitalpha.vp.componentsample.activity.explorer.activity;

import java.util.Collections;

import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage;
import org.polarsys.kitalpha.vp.componentsampleframework.activity.explorer.activity.AbstractComponentsampleHyperLink;

/**
 * 
 * @author Faycal Abka
 *
 */
public class SetModelNameActivity extends AbstractComponentsampleHyperLink {

	@Override
	public void linkActivated(HyperlinkEvent e) {
		Shell activeShell = Display.getCurrent().getActiveShell();
		
		final InputDialog input = new InputDialog(activeShell, 
				"Name of Component Sample Model", "Enter a Name for the Component Sample Model", "Model name", null);
		
		input.create();
		if (input.open() == Window.OK){
			final EObject rootSemanticModel = ActivityExplorerManager.INSTANCE.getRootSemanticModel();
			
			if (rootSemanticModel instanceof ComponentElement){
				String value = input.getValue();
				
				TransactionalEditingDomain transactionalEditingDomain = ActivityExplorerManager.INSTANCE.getSession().getTransactionalEditingDomain();
				TransactionalCommandStack tstack = (TransactionalCommandStack)transactionalEditingDomain.getCommandStack();
				
				Command setName = transactionalEditingDomain.createCommand(SetCommand.class, 
						new CommandParameter(rootSemanticModel, ComponentSamplePackage.Literals.COMPONENT_ELEMENT__NAME, value));
				
				try {
					tstack.execute(setName, Collections.EMPTY_MAP);
					ActivityExplorerManager.INSTANCE.getEditor().updateEditorPages(0);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				} catch (RollbackException e1) {
					e1.printStackTrace();
				}
			}
		}
		
	}

}
