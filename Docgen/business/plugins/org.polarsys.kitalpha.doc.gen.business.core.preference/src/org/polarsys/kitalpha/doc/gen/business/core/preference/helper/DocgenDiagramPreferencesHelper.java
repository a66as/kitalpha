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

package org.polarsys.kitalpha.doc.gen.business.core.preference.helper;

/**
 * @author Boubekeur Zendagui
 */
public class DocgenDiagramPreferencesHelper extends AbstractDocgenPreferencesHelper {
	/**
	 * @return the value of the image alternate text preference
	 */
	public static boolean getExportDiagram(){
		return getCustomizedBooleanValue(DocgenPreferenceConstant.DOCGEN_DIAGRAMS_EXPORT);
	}
	
	/**
	 * Set copyright preference to it default value.
	 */
	public static void restorExportDiagramDefaultValues(){
		STORE.setDefault(DocgenPreferenceConstant.DOCGEN_DIAGRAMS_EXPORT, 
						 DocgenPreferenceConstant.DOCGEN_DIAGRAMS_EXPORT_DEFAULT_VALUE);
	}
}
