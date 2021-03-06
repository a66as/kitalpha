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
package org.polarsys.kitalpha.report.utils;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.kitalpha.report.model.ReportElementFactory;
import org.polarsys.kitalpha.report.model.Severity;
import org.polarsys.kitalpha.report.registry.ReportRegistry;

/**
 * @author Thomas Guiu
 * 
 */
public abstract class AbstractSeverityFactory {

	protected final List<Severity> contributed = new ArrayList<Severity>();

	protected AbstractSeverityFactory() {
		super();
	}

	public void unRegisterSeverities() {
		ReportRegistry.INSTANCE.getSeverities().removeAll(contributed);
	}

	public void registerSeverities() {
		ReportRegistry.INSTANCE.getSeverities().addAll(contributed);
	}

	protected Severity createSeverity(int code, String label) {
		Severity severity = ReportElementFactory.eINSTANCE.createSeverity();
		severity.setCode(code);
		severity.setLabel(label);
		return severity;
	}

}