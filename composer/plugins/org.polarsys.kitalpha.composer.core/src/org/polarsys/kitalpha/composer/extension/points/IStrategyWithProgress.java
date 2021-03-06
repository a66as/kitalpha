/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.extension.points;

import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Root;

/**
 * @author Yann Mortier
 * 
 */
public interface IStrategyWithProgress extends IStrategy {

	/**
	 * Method that creates an allocation for a whole model.
	 * 
	 * @param modelRoot_p :
	 *            the root of the model
	 * @param strategyParams_p :
	 *            the parameters of the strategy
	 * @param progressMonitor
	 *            to notify the progression.
	 * @return the allocation instantiated by this strategy
	 */
	public Root allocateModelElements(EObject modelRoot_p,
			Map<String, Parameter> strategyParams_p,
			IProgressMonitor progressMonitor);

	/**
	 * Method that creates an allocation for given elements of a model.
	 * 
	 * @param modelRoot_p :
	 *            the root of the model
	 * @param strategyParams_p :
	 *            the parameters of the strategy
	 * @param modelElementsToGenerate_p :
	 *            the elements that user wants to be generated
	 * @param progressMonitor
	 *            to notify the progression.
	 * @return the allocation instantiated by this strategy
	 */
	public Root allocateModelElements(EObject modelRoot_p,
			Map<String, Parameter> strategyParams_p,
			List<EObject> modelElementsToGenerate_p,
			IProgressMonitor progressMonitor);

}
