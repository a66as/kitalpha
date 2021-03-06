/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.predicate.exceptions;

/**
 * Exception used when a value is not found in Context
 * 
 * @author Faycal Abka
 *
 */
public class ValueNotFoundException extends Exception {

	private static final long serialVersionUID = -4089237994894651498L;
	
	public ValueNotFoundException(String message) {
		super(message);
	}

}
