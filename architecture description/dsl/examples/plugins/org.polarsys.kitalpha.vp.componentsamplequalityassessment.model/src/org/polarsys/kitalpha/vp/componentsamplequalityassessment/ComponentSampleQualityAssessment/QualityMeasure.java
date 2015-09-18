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
package org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment;

import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityMeasure#getCriterion <em>Criterion</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityMeasure#getMeasureValue <em>Measure Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.ComponentSampleQualityAssessmentPackage#getQualityMeasure()
 * @model
 * @generated
 */

public interface QualityMeasure extends ComponentElement {

	/**
	 * Returns the value of the '<em><b>Criterion</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criterion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criterion</em>' attribute.
	 * @see #setCriterion(String)
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.ComponentSampleQualityAssessmentPackage#getQualityMeasure_Criterion()
	 * @model
	 * @generated
	 */

	String getCriterion();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityMeasure#getCriterion <em>Criterion</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criterion</em>' attribute.
	 * @see #getCriterion()
	 * @generated
	 */

	void setCriterion(String value);

	/**
	 * Returns the value of the '<em><b>Measure Value</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Value</em>' attribute.
	 * @see #setMeasureValue(int)
	 * @see org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.ComponentSampleQualityAssessmentPackage#getQualityMeasure_MeasureValue()
	 * @model
	 * @generated
	 */

	int getMeasureValue();

	/**
	 * Sets the value of the '{@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityMeasure#getMeasureValue <em>Measure Value</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Value</em>' attribute.
	 * @see #getMeasureValue()
	 * @generated
	 */

	void setMeasureValue(int value);

} // QualityMeasure
