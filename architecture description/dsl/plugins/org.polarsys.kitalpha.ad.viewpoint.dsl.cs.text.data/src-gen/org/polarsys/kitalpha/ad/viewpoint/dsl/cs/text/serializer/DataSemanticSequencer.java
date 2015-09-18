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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AnnotatableElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Annotation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Detail;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Enumeration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalClassAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Operation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Parameter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Value;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataSpec;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.ImportNamespace;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.ImportURI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.DataGrammarAccess;

@SuppressWarnings("all")
public class DataSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DataGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DataPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DataPackage.DATA_SPEC:
				sequence_DataSpec(context, (DataSpec) semanticObject); 
				return; 
			case DataPackage.IMPORT_NAMESPACE:
				sequence_ImportNamespace(context, (ImportNamespace) semanticObject); 
				return; 
			case DataPackage.IMPORT_URI:
				sequence_ImportURI(context, (ImportURI) semanticObject); 
				return; 
			}
		else if(semanticObject.eClass().getEPackage() == VpdescPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case VpdescPackage.ANNOTATABLE_ELEMENT:
				sequence_AnnotatableElement(context, (AnnotatableElement) semanticObject); 
				return; 
			case VpdescPackage.ANNOTATION:
				sequence_Annotation(context, (Annotation) semanticObject); 
				return; 
			case VpdescPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case VpdescPackage.CLASS:
				sequence_Class(context, (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class) semanticObject); 
				return; 
			case VpdescPackage.DATA:
				sequence_Data(context, (Data) semanticObject); 
				return; 
			case VpdescPackage.DETAIL:
				sequence_Detail(context, (Detail) semanticObject); 
				return; 
			case VpdescPackage.ENUMERATION:
				sequence_Enumeration(context, (Enumeration) semanticObject); 
				return; 
			case VpdescPackage.EXTERNAL_ATTRIBUTE_TYPE:
				sequence_ExternalAttributeType(context, (ExternalAttributeType) semanticObject); 
				return; 
			case VpdescPackage.EXTERNAL_CLASS_ASSOCIATION:
				sequence_ExternalClassAssociation(context, (ExternalClassAssociation) semanticObject); 
				return; 
			case VpdescPackage.EXTERNAL_SUPER_CLASS:
				sequence_ExternalSuperClass(context, (ExternalSuperClass) semanticObject); 
				return; 
			case VpdescPackage.EXTERNAL_TYPE:
				sequence_ExternalType(context, (ExternalType) semanticObject); 
				return; 
			case VpdescPackage.LOCAL_ATTRIBUTE_TYPE:
				sequence_LocalAttributeType(context, (LocalAttributeType) semanticObject); 
				return; 
			case VpdescPackage.LOCAL_CLASS_ASSOCIATION:
				sequence_LocalClassAssociation(context, (LocalClassAssociation) semanticObject); 
				return; 
			case VpdescPackage.LOCAL_SUPER_CLASS:
				sequence_LocalSuperClass(context, (LocalSuperClass) semanticObject); 
				return; 
			case VpdescPackage.LOCAL_TYPE:
				sequence_LocalType(context, (LocalType) semanticObject); 
				return; 
			case VpdescPackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			case VpdescPackage.PARAMETER:
				sequence_Parameter(context, (Parameter) semanticObject); 
				return; 
			case VpdescPackage.VALUE:
				sequence_Value(context, (Value) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (owned_annotations+=Annotation*)
	 */
	protected void sequence_AnnotatableElement(EObject context, AnnotatableElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (source=EString owned_details+=Detail*)
	 */
	protected void sequence_Annotation(EObject context, Annotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         description=EString? 
	 *         owned_type=AbstractAttributeType 
	 *         cardinality=Cardinalities? 
	 *         isId=EBoolean? 
	 *         changeable=EBoolean? 
	 *         derived=EBoolean? 
	 *         ordered=EBoolean? 
	 *         transient=EBoolean? 
	 *         unique=EBoolean? 
	 *         unsettable=EBoolean? 
	 *         volatile=EBoolean? 
	 *         (owned_values+=Value owned_values+=Value*)? 
	 *         owned_annotations+=Annotation*
	 *     )
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         description=EString? 
	 *         icon=STRING? 
	 *         (extends+=[EClass|FQN] extends+=[EClass|FQN]*)? 
	 *         (Inheritences+=AbstractSuperClass Inheritences+=AbstractSuperClass*)? 
	 *         abstract=EBoolean? 
	 *         owned_annotations+=Annotation* 
	 *         VP_Class_Attributes+=Attribute* 
	 *         VP_Classes_Associations+=AbstractAssociation* 
	 *         VP_Class_Operations+=Operation*
	 *     )
	 */
	protected void sequence_Class(EObject context, org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* data=Data)
	 */
	protected void sequence_DataSpec(EObject context, DataSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=FQN? owned_annotations+=Annotation* description=EString? VP_Classes+=Class* VP_Enumerations+=Enumeration*)
	 */
	protected void sequence_Data(EObject context, Data semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=EString value=EString?)
	 */
	protected void sequence_Detail(EObject context, Detail semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID owned_annotations+=Annotation* ownedValues+=Value ownedValues+=Value*)
	 */
	protected void sequence_Enumeration(EObject context, Enumeration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=[EDataType|FQN]
	 */
	protected void sequence_ExternalAttributeType(EObject context, ExternalAttributeType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VpdescPackage.Literals.EXTERNAL_ATTRIBUTE_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpdescPackage.Literals.EXTERNAL_ATTRIBUTE_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExternalAttributeTypeAccess().getTypeEDataTypeFQNParserRuleCall_2_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         description=EString? 
	 *         type=Association_Types 
	 *         cardinality=Cardinalities 
	 *         ExternalTarget=[EClass|FQN] 
	 *         changeable=EBoolean? 
	 *         derived=EBoolean? 
	 *         ordered=EBoolean? 
	 *         transient=EBoolean? 
	 *         unique=EBoolean? 
	 *         unsettable=EBoolean? 
	 *         volatile=EBoolean? 
	 *         owned_annotations+=Annotation*
	 *     )
	 */
	protected void sequence_ExternalClassAssociation(EObject context, ExternalClassAssociation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     superClass=[EClass|FQN]
	 */
	protected void sequence_ExternalSuperClass(EObject context, ExternalSuperClass semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VpdescPackage.Literals.EXTERNAL_SUPER_CLASS__SUPER_CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpdescPackage.Literals.EXTERNAL_SUPER_CLASS__SUPER_CLASS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExternalSuperClassAccess().getSuperClassEClassFQNParserRuleCall_2_0_1(), semanticObject.getSuperClass());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=[EClassifier|FQN] cardinality=Cardinalities)
	 */
	protected void sequence_ExternalType(EObject context, ExternalType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VpdescPackage.Literals.ABSTRACT_TYPE__CARDINALITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpdescPackage.Literals.ABSTRACT_TYPE__CARDINALITY));
			if(transientValues.isValueTransient(semanticObject, VpdescPackage.Literals.EXTERNAL_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpdescPackage.Literals.EXTERNAL_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExternalTypeAccess().getTypeEClassifierFQNParserRuleCall_2_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getExternalTypeAccess().getCardinalityCardinalitiesEnumRuleCall_3_0(), semanticObject.getCardinality());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=FQN
	 */
	protected void sequence_ImportNamespace(EObject context, ImportNamespace semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DataPackage.Literals.IMPORT_NAMESPACE__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataPackage.Literals.IMPORT_NAMESPACE__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportNamespaceAccess().getImportedNamespaceFQNParserRuleCall_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importURI=EString
	 */
	protected void sequence_ImportURI(EObject context, ImportURI semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DataPackage.Literals.IMPORT_URI__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataPackage.Literals.IMPORT_URI__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportURIAccess().getImportURIEStringParserRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=[Enumeration|FQN]
	 */
	protected void sequence_LocalAttributeType(EObject context, LocalAttributeType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VpdescPackage.Literals.LOCAL_ATTRIBUTE_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpdescPackage.Literals.LOCAL_ATTRIBUTE_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLocalAttributeTypeAccess().getTypeEnumerationFQNParserRuleCall_2_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         description=EString? 
	 *         type=Association_Types 
	 *         cardinality=Cardinalities 
	 *         LocalTarget=[Class|FQN] 
	 *         changeable=EBoolean? 
	 *         derived=EBoolean? 
	 *         ordered=EBoolean? 
	 *         transient=EBoolean? 
	 *         unique=EBoolean? 
	 *         unsettable=EBoolean? 
	 *         volatile=EBoolean? 
	 *         owned_annotations+=Annotation*
	 *     )
	 */
	protected void sequence_LocalClassAssociation(EObject context, LocalClassAssociation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     superClass=[Class|FQN]
	 */
	protected void sequence_LocalSuperClass(EObject context, LocalSuperClass semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VpdescPackage.Literals.LOCAL_SUPER_CLASS__SUPER_CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpdescPackage.Literals.LOCAL_SUPER_CLASS__SUPER_CLASS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLocalSuperClassAccess().getSuperClassClassFQNParserRuleCall_1_0_1(), semanticObject.getSuperClass());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=[ViewpointClassifier|FQN] cardinality=Cardinalities)
	 */
	protected void sequence_LocalType(EObject context, LocalType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VpdescPackage.Literals.ABSTRACT_TYPE__CARDINALITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpdescPackage.Literals.ABSTRACT_TYPE__CARDINALITY));
			if(transientValues.isValueTransient(semanticObject, VpdescPackage.Literals.LOCAL_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpdescPackage.Literals.LOCAL_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLocalTypeAccess().getTypeViewpointClassifierFQNParserRuleCall_1_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getLocalTypeAccess().getCardinalityCardinalitiesEnumRuleCall_2_0(), semanticObject.getCardinality());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (parameters+=Parameter parameters+=Parameter*)? operation_type=AbstractType? owned_annotations+=Annotation*)
	 */
	protected void sequence_Operation(EObject context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameter_type=AbstractType name=EString description=EString? owned_annotations+=Annotation*)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString? literal=EString)
	 */
	protected void sequence_Value(EObject context, Value semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
