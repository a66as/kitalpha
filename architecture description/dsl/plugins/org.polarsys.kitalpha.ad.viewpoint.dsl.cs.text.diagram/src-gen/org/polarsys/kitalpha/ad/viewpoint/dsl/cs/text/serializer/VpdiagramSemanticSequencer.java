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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.CommondataPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalAttribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAttribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.DomainElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.Expression;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ExpressionPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.JavaElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.StringElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ActionSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BasicStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BorderedNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Condition;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerChildren;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Create;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Delete;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Diagram;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DomainContainer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Drop;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Edge;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeDomainElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeImport;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ImageStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Label;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.MappingSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeChildren;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDomainElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.OpenAction;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ReconnectEdge;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.DiagramPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.Diagrams;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.ImportGroup;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.ImportNameSpace;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpdiagramGrammarAccess;

@SuppressWarnings("all")
public class VpdiagramSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VpdiagramGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CommondataPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CommondataPackage.EXTERNAL_ASSOCIATION:
				sequence_ExternalAssociation(context, (ExternalAssociation) semanticObject); 
				return; 
			case CommondataPackage.EXTERNAL_ATTRIBUTE:
				sequence_ExternalAttribute(context, (ExternalAttribute) semanticObject); 
				return; 
			case CommondataPackage.EXTERNAL_CLASS:
				sequence_ExternalClass(context, (ExternalClass) semanticObject); 
				return; 
			case CommondataPackage.LOCAL_ASSOCIATION:
				sequence_LocalAssociation(context, (LocalAssociation) semanticObject); 
				return; 
			case CommondataPackage.LOCAL_ATTRIBUTE:
				sequence_LocalAttribute(context, (LocalAttribute) semanticObject); 
				return; 
			case CommondataPackage.LOCAL_CLASS:
				sequence_LocalClass2(context, (LocalClass) semanticObject); 
				return; 
			}
		else if(semanticObject.eClass().getEPackage() == DiagramPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DiagramPackage.DIAGRAMS:
				sequence_Diagrams(context, (Diagrams) semanticObject); 
				return; 
			case DiagramPackage.IMPORT_GROUP:
				sequence_ImportGroup(context, (ImportGroup) semanticObject); 
				return; 
			case DiagramPackage.IMPORT_NAME_SPACE:
				sequence_ImportNameSpace(context, (ImportNameSpace) semanticObject); 
				return; 
			}
		else if(semanticObject.eClass().getEPackage() == ExpressionPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ExpressionPackage.DOMAIN_ELEMENT:
				sequence_DomainElement(context, (DomainElement) semanticObject); 
				return; 
			case ExpressionPackage.EXPRESSION:
				sequence_Expression(context, (Expression) semanticObject); 
				return; 
			case ExpressionPackage.JAVA_ELEMENT:
				sequence_JavaElement(context, (JavaElement) semanticObject); 
				return; 
			case ExpressionPackage.STRING_ELEMENT:
				sequence_StringElement(context, (StringElement) semanticObject); 
				return; 
			}
		else if(semanticObject.eClass().getEPackage() == VpdiagramPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case VpdiagramPackage.ACTION_SET:
				sequence_ActionSet(context, (ActionSet) semanticObject); 
				return; 
			case VpdiagramPackage.BASIC_STYLE:
				sequence_BasicStyle(context, (BasicStyle) semanticObject); 
				return; 
			case VpdiagramPackage.BORDERED_NODE:
				sequence_BorderedNode(context, (BorderedNode) semanticObject); 
				return; 
			case VpdiagramPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case VpdiagramPackage.CONTAINER:
				sequence_Container(context, (Container) semanticObject); 
				return; 
			case VpdiagramPackage.CONTAINER_CHILDREN:
				sequence_ContainerChildren(context, (ContainerChildren) semanticObject); 
				return; 
			case VpdiagramPackage.CONTAINER_DESCRIPTION:
				sequence_ContainerDescription(context, (ContainerDescription) semanticObject); 
				return; 
			case VpdiagramPackage.CREATE:
				sequence_Create(context, (Create) semanticObject); 
				return; 
			case VpdiagramPackage.DELETE:
				sequence_Delete(context, (Delete) semanticObject); 
				return; 
			case VpdiagramPackage.DIAGRAM:
				sequence_Diagram(context, (Diagram) semanticObject); 
				return; 
			case VpdiagramPackage.DIAGRAM_EXTENSION:
				sequence_DiagramExtension(context, (DiagramExtension) semanticObject); 
				return; 
			case VpdiagramPackage.DIAGRAM_SET:
				sequence_DiagramSet(context, (DiagramSet) semanticObject); 
				return; 
			case VpdiagramPackage.DOMAIN_CONTAINER:
				sequence_DomainContainer(context, (DomainContainer) semanticObject); 
				return; 
			case VpdiagramPackage.DROP:
				sequence_Drop(context, (Drop) semanticObject); 
				return; 
			case VpdiagramPackage.EDGE:
				sequence_Edge(context, (Edge) semanticObject); 
				return; 
			case VpdiagramPackage.EDGE_DESCRIPTION:
				sequence_EdgeDescription(context, (EdgeDescription) semanticObject); 
				return; 
			case VpdiagramPackage.EDGE_DOMAIN_ASSOCIATION:
				sequence_EdgeDomainAssociation(context, (EdgeDomainAssociation) semanticObject); 
				return; 
			case VpdiagramPackage.EDGE_DOMAIN_ELEMENT:
				sequence_EdgeDomainElement(context, (EdgeDomainElement) semanticObject); 
				return; 
			case VpdiagramPackage.EDGE_IMPORT:
				sequence_EdgeImport(context, (EdgeImport) semanticObject); 
				return; 
			case VpdiagramPackage.EDGE_STYLE:
				sequence_EdgeStyle(context, (EdgeStyle) semanticObject); 
				return; 
			case VpdiagramPackage.FLAT_STYLE:
				sequence_FlatStyle(context, (FlatStyle) semanticObject); 
				return; 
			case VpdiagramPackage.HISTOGRAM_SECTION:
				sequence_HistogramSection(context, (HistogramSection) semanticObject); 
				return; 
			case VpdiagramPackage.HISTOGRAM_STYLE:
				sequence_HistogramStyle(context, (HistogramStyle) semanticObject); 
				return; 
			case VpdiagramPackage.IMAGE_STYLE:
				sequence_ImageStyle(context, (ImageStyle) semanticObject); 
				return; 
			case VpdiagramPackage.LABEL:
				sequence_Label(context, (Label) semanticObject); 
				return; 
			case VpdiagramPackage.MAPPING_SET:
				sequence_MappingSet(context, (MappingSet) semanticObject); 
				return; 
			case VpdiagramPackage.NODE:
				sequence_Node(context, (Node) semanticObject); 
				return; 
			case VpdiagramPackage.NODE_CHILDREN:
				sequence_NodeChildren(context, (NodeChildren) semanticObject); 
				return; 
			case VpdiagramPackage.NODE_DESCRIPTION:
				sequence_NodeDescription(context, (NodeDescription) semanticObject); 
				return; 
			case VpdiagramPackage.NODE_DOMAIN_ELEMENT:
				sequence_NodeDomainElement(context, (NodeDomainElement) semanticObject); 
				return; 
			case VpdiagramPackage.OPEN_ACTION:
				sequence_OpenAction(context, (OpenAction) semanticObject); 
				return; 
			case VpdiagramPackage.RECONNECT_EDGE:
				sequence_ReconnectEdge(context, (ReconnectEdge) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (actions+=Action* openActions+=OpenAction*)
	 */
	protected void sequence_ActionSet(EObject context, ActionSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (borderColor=SystemColors? backgroundColor=SystemColors? form=Node_Form?)
	 */
	protected void sequence_BasicStyle(EObject context, BasicStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString imports=[NodeMapping|FQN]? the_domain=NodeDomainElement? style+=NodeDescription*)
	 */
	protected void sequence_BorderedNode(EObject context, BorderedNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=ForeignExpressionElement
	 */
	protected void sequence_Condition(EObject context, Condition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VpdiagramPackage.Literals.CONDITION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpdiagramPackage.Literals.CONDITION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConditionAccess().getExpressionForeignExpressionElementParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((reused_nodes+=[AbstractNode|FQN] reused_nodes+=[AbstractNode|FQN]*)? owned_nodes+=AbstractNode*)
	 */
	protected void sequence_ContainerChildren(EObject context, ContainerChildren semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Condition? node_Label=Label? style=AbstractContainerStyle?)
	 */
	protected void sequence_ContainerDescription(EObject context, ContainerDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         imports=[ContainerMapping|FQN]? 
	 *         the_domain=NodeDomainElement? 
	 *         contentLayout=ContainerLayout? 
	 *         style+=ContainerDescription* 
	 *         children=ContainerChildren?
	 *     )
	 */
	protected void sequence_Container(EObject context, Container semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString precondition=EString? label=STRING? tool_For=[DiagramElement|FQN] icon=STRING?)
	 */
	protected void sequence_Create(EObject context, Create semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString precondition=EString? label=STRING? tool_For=[DiagramElement|FQN])
	 */
	protected void sequence_Delete(EObject context, Delete semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING extented_diagram=[DiagramDescription|FQN]? the_MappingSet=MappingSet? the_ActionSet=ActionSet?)
	 */
	protected void sequence_DiagramExtension(EObject context, DiagramExtension semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=FQN diagrams+=DiagramRepresentation*)
	 */
	protected void sequence_DiagramSet(EObject context, DiagramSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING description=STRING? the_domain=DomainContainer the_MappingSet=MappingSet? the_ActionSet=ActionSet?)
	 */
	protected void sequence_Diagram(EObject context, Diagram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=AbstractImport* diagrams=Aspect)
	 */
	protected void sequence_Diagrams(EObject context, Diagrams semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     the_domain=AbstractClass
	 */
	protected void sequence_DomainContainer(EObject context, DomainContainer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VpdiagramPackage.Literals.DOMAIN_CONTAINER__THE_DOMAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VpdiagramPackage.Literals.DOMAIN_CONTAINER__THE_DOMAIN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDomainContainerAccess().getThe_domainAbstractClassParserRuleCall_1_1_0(), semanticObject.getThe_domain());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     attribute=[Attribute|FQN]
	 */
	protected void sequence_DomainElement(EObject context, DomainElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.DOMAIN_ELEMENT__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.DOMAIN_ELEMENT__ATTRIBUTE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDomainElementAccess().getAttributeAttributeFQNParserRuleCall_1_0_1(), semanticObject.getAttribute());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString precondition=EString? label=STRING? tool_For=[DiagramElement|FQN])
	 */
	protected void sequence_Drop(EObject context, Drop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Condition? begin_Label=Label? center_label=Label? end_label=Label? style=EdgeStyle?)
	 */
	protected void sequence_EdgeDescription(EObject context, EdgeDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (target_query=STRING | target_Locator=AbstractAssociation2)
	 */
	protected void sequence_EdgeDomainAssociation(EObject context, EdgeDomainAssociation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         the_Domain=AbstractClass 
	 *         (target_query=STRING | target_Locator=AbstractAssociation2) 
	 *         (source_query=STRING | source_Locator=AbstractAssociation2)
	 *     )
	 */
	protected void sequence_EdgeDomainElement(EObject context, EdgeDomainElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString imports=[EdgeMapping|FQN] e_description+=EdgeDescription*)
	 */
	protected void sequence_EdgeImport(EObject context, EdgeImport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lineStyle=LineStyle? beginDecorator=EdgeArrows? endDecorator=EdgeArrows? color=SystemColors?)
	 */
	protected void sequence_EdgeStyle(EObject context, EdgeStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (the_domain=EdgeDomainAssociation | the_domain=EdgeDomainElement) 
	 *         source+=[DiagramElement|FQN] 
	 *         source+=[DiagramElement|FQN]* 
	 *         target+=[DiagramElement|FQN] 
	 *         target+=[DiagramElement|FQN]* 
	 *         e_description+=EdgeDescription*
	 *     )
	 */
	protected void sequence_Edge(EObject context, Edge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((expressionElements+=ExpressionElement expressionElements+=ExpressionElement*)?)
	 */
	protected void sequence_Expression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     reference=[EReference|FQN]
	 */
	protected void sequence_ExternalAssociation(EObject context, ExternalAssociation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommondataPackage.Literals.EXTERNAL_ASSOCIATION__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommondataPackage.Literals.EXTERNAL_ASSOCIATION__REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExternalAssociationAccess().getReferenceEReferenceFQNParserRuleCall_2_0_1(), semanticObject.getReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     attribute=[EAttribute|FQN]
	 */
	protected void sequence_ExternalAttribute(EObject context, ExternalAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommondataPackage.Literals.EXTERNAL_ATTRIBUTE__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommondataPackage.Literals.EXTERNAL_ATTRIBUTE__ATTRIBUTE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExternalAttributeAccess().getAttributeEAttributeFQNParserRuleCall_2_0_1(), semanticObject.getAttribute());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     class=[EClass|FQN]
	 */
	protected void sequence_ExternalClass(EObject context, ExternalClass semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommondataPackage.Literals.EXTERNAL_CLASS__CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommondataPackage.Literals.EXTERNAL_CLASS__CLASS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExternalClassAccess().getClassEClassFQNParserRuleCall_2_0_1(), semanticObject.getClass_());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (borderColor=SystemColors? (backgroundStyle=BackgroundStyle? backgroundColor=SystemColors)? forgroundColor=SystemColors?)
	 */
	protected void sequence_FlatStyle(EObject context, FlatStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         backgroundColor=SystemColors? 
	 *         forgroundColor=SystemColors? 
	 *         minValue=ForeignExpressionElement? 
	 *         value=ForeignExpressionElement? 
	 *         maxValue=ForeignExpressionElement?
	 *     )
	 */
	protected void sequence_HistogramSection(EObject context, HistogramSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (borderColor=SystemColors? sections+=HistogramSection*)
	 */
	protected void sequence_HistogramStyle(EObject context, HistogramStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (borderColor=SystemColors? imagePath=STRING)
	 */
	protected void sequence_ImageStyle(EObject context, ImageStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedGroup=EString
	 */
	protected void sequence_ImportGroup(EObject context, ImportGroup semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramPackage.Literals.IMPORT_GROUP__IMPORTED_GROUP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramPackage.Literals.IMPORT_GROUP__IMPORTED_GROUP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportGroupAccess().getImportedGroupEStringParserRuleCall_2_0(), semanticObject.getImportedGroup());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=FQN
	 */
	protected void sequence_ImportNameSpace(EObject context, ImportNameSpace semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DiagramPackage.Literals.IMPORT_NAME_SPACE__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DiagramPackage.Literals.IMPORT_NAME_SPACE__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportNameSpaceAccess().getImportedNamespaceFQNParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     method=FQN
	 */
	protected void sequence_JavaElement(EObject context, JavaElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.JAVA_ELEMENT__METHOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.JAVA_ELEMENT__METHOD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getJavaElementAccess().getMethodFQNParserRuleCall_2_0(), semanticObject.getMethod());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=Expression (bold?='bold'? italic?='italic'? color=SystemColors? size=EInt?)?)
	 */
	protected void sequence_Label(EObject context, Label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     reference=[AbstractAssociation|FQN]
	 */
	protected void sequence_LocalAssociation(EObject context, LocalAssociation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommondataPackage.Literals.LOCAL_ASSOCIATION__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommondataPackage.Literals.LOCAL_ASSOCIATION__REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLocalAssociationAccess().getReferenceAbstractAssociationFQNParserRuleCall_1_0_1(), semanticObject.getReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     attribute=[Attribute|FQN]
	 */
	protected void sequence_LocalAttribute(EObject context, LocalAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommondataPackage.Literals.LOCAL_ATTRIBUTE__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommondataPackage.Literals.LOCAL_ATTRIBUTE__ATTRIBUTE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLocalAttributeAccess().getAttributeAttributeFQNParserRuleCall_1_0_1(), semanticObject.getAttribute());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     class=[Class|FQN]
	 */
	protected void sequence_LocalClass2(EObject context, LocalClass semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommondataPackage.Literals.LOCAL_CLASS__CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommondataPackage.Literals.LOCAL_CLASS__CLASS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLocalClass2Access().getClassClassFQNParserRuleCall_1_0_1(), semanticObject.getClass_());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (diagram_Elements+=DiagramChildren*)
	 */
	protected void sequence_MappingSet(EObject context, MappingSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((reused_boderednodes+=[BorderedNode|FQN] reused_boderednodes+=[BorderedNode|FQN]*)? owned_boderednodes+=BorderedNode*)
	 */
	protected void sequence_NodeChildren(EObject context, NodeChildren semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Condition? (node_Label=Label label_position=LabelPosition? label_alignement=LabelAlignment?)? style=AbstractNodeStyle?)
	 */
	protected void sequence_NodeDescription(EObject context, NodeDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (domain_Class=AbstractClass (query=STRING | chlidren_list=AbstractAssociation2)?)
	 */
	protected void sequence_NodeDomainElement(EObject context, NodeDomainElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString imports=[NodeMapping|FQN]? the_domain=NodeDomainElement? style+=NodeDescription* children=NodeChildren?)
	 */
	protected void sequence_Node(EObject context, Node semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString precondition=EString? label=STRING? icon=STRING?)
	 */
	protected void sequence_OpenAction(EObject context, OpenAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString precondition=EString? label=STRING? tool_For=[DiagramElement|FQN])
	 */
	protected void sequence_ReconnectEdge(EObject context, ReconnectEdge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringElement(EObject context, StringElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.STRING_ELEMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.STRING_ELEMENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringElementAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
}
