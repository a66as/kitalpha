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
package org.polarsys.kitalpha.emde.egf.l10n;

import org.eclipse.osgi.util.NLS;

/**
 * @author Xavier Maysonnave
 * 
 */
public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.polarsys.kitalpha.emde.egf.l10n.messages";//$NON-NLS-1$  

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	public static String setupManifestMF;

	public static String ExtensionHelper_Relative_URI_Error;

	public static String ExtensionHelper_Resource_Error;

	public static String ExtensionHelper_URI_Error;

}
