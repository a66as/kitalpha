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

package org.polarsys.kitalpha.ad.common;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

/**
 * @author Thomas Guiu
 * 
 */
public class ProjectNature implements IProjectNature {
	public static final String VP_NATURE = "org.polarsys.kitalpha.ad.common.VPnature";
	private IProject project;

	public void configure() throws CoreException {
		// TODO Auto-generated method stub

	}

	public void deconfigure() throws CoreException {
		// TODO Auto-generated method stub

	}

	public IProject getProject() {
		return project;
	}

	public void setProject(IProject project) {
		this.project = project;
	}
}
