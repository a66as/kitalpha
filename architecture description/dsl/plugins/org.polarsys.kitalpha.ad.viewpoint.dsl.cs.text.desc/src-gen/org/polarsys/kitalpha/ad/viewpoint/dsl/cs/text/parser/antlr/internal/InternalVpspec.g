/*
* generated by Xtext
*/
grammar InternalVpspec;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpspecGrammarAccess;

}

@parser::members {

 	private VpspecGrammarAccess grammarAccess;
 	
    public InternalVpspecParser(TokenStream input, VpspecGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Viewpoint";	
   	}
   	
   	@Override
   	protected VpspecGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleViewpoint
entryRuleViewpoint returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getViewpointRule()); }
	 iv_ruleViewpoint=ruleViewpoint 
	 { $current=$iv_ruleViewpoint.current; } 
	 EOF 
;

// Rule Viewpoint
ruleViewpoint returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getViewpointAccess().getViewpointAction_0(),
            $current);
    }
)	otherlv_1='Viewpoint' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getViewpointAccess().getViewpointKeyword_1());
    }
(
(
		lv_shortName_2_0=RULE_ID
		{
			newLeafNode(lv_shortName_2_0, grammarAccess.getViewpointAccess().getShortNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewpointRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"shortName",
        		lv_shortName_2_0, 
        		"ID");
	    }

)
)?	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getViewpointAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='name:' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getViewpointAccess().getNameKeyword_4_0());
    }
(
(
		lv_name_5_0=RULE_STRING
		{
			newLeafNode(lv_name_5_0, grammarAccess.getViewpointAccess().getNameSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewpointRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_5_0, 
        		"STRING");
	    }

)
))(	otherlv_6='description:' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getViewpointAccess().getDescriptionKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getViewpointAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
	    }
		lv_description_7_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getViewpointRule());
	        }
       		set(
       			$current, 
       			"description",
        		lv_description_7_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_8='extends' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getViewpointAccess().getExtendsKeyword_6_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewpointRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getViewpointAccess().getParentsViewpointCrossReference_6_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_10=',' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getViewpointAccess().getCommaKeyword_6_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewpointRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getViewpointAccess().getParentsViewpointCrossReference_6_2_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?(	otherlv_12='aggregates' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getViewpointAccess().getAggregatesKeyword_7_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewpointRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getViewpointAccess().getDependenciesViewpointCrossReference_7_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_14=',' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getViewpointAccess().getCommaKeyword_7_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewpointRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getViewpointAccess().getDependenciesViewpointCrossReference_7_2_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?(	otherlv_16='use viewpoint:' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getViewpointAccess().getUseViewpointKeyword_8_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewpointRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getViewpointAccess().getUseViewpointViewpointCrossReference_8_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_18=',' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getViewpointAccess().getCommaKeyword_8_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewpointRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getViewpointAccess().getUseViewpointViewpointCrossReference_8_2_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?(	otherlv_20='use ecore:' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getViewpointAccess().getUseEcoreKeyword_9_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getViewpointAccess().getUseEcoreResourceEStringParserRuleCall_9_1_0()); 
	    }
		lv_useEcoreResource_21_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getViewpointRule());
	        }
       		add(
       			$current, 
       			"useEcoreResource",
        		lv_useEcoreResource_21_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_22=',' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getViewpointAccess().getCommaKeyword_9_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getViewpointAccess().getUseResourceEStringParserRuleCall_9_2_1_0()); 
	    }
		lv_useResource_23_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getViewpointRule());
	        }
       		add(
       			$current, 
       			"useResource",
        		lv_useResource_23_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?(	otherlv_24='use diagram:' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getViewpointAccess().getUseDiagramKeyword_10_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getViewpointAccess().getUseDiagramResourceEStringParserRuleCall_10_1_0()); 
	    }
		lv_useDiagramResource_25_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getViewpointRule());
	        }
       		add(
       			$current, 
       			"useDiagramResource",
        		lv_useDiagramResource_25_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_26=',' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getViewpointAccess().getCommaKeyword_10_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getViewpointAccess().getUseResourceEStringParserRuleCall_10_2_1_0()); 
	    }
		lv_useResource_27_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getViewpointRule());
	        }
       		add(
       			$current, 
       			"useResource",
        		lv_useResource_27_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?(	otherlv_28='use EMF:' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getViewpointAccess().getUseEMFKeyword_11_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getViewpointAccess().getUseEMFResourceEStringParserRuleCall_11_1_0()); 
	    }
		lv_useEMFResource_29_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getViewpointRule());
	        }
       		add(
       			$current, 
       			"useEMFResource",
        		lv_useEMFResource_29_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_30=',' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getViewpointAccess().getCommaKeyword_11_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getViewpointAccess().getUseResourceEStringParserRuleCall_11_2_1_0()); 
	    }
		lv_useResource_31_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getViewpointRule());
	        }
       		add(
       			$current, 
       			"useResource",
        		lv_useResource_31_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?(	otherlv_32='Data' 
    {
    	newLeafNode(otherlv_32, grammarAccess.getViewpointAccess().getDataKeyword_12_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewpointRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_DataDataCrossReference_12_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?((
(
		lv_type_34_0=	'UI' 
    {
        newLeafNode(lv_type_34_0, grammarAccess.getViewpointAccess().getTypeUIKeyword_13_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewpointRule());
	        }
       		addWithLastConsumed($current, "type", lv_type_34_0, "UI");
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewpointRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionCrossReference_13_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?((
(
		lv_type_36_0=	'Diagrams' 
    {
        newLeafNode(lv_type_36_0, grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_14_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewpointRule());
	        }
       		addWithLastConsumed($current, "type", lv_type_36_0, "Diagrams");
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewpointRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetCrossReference_14_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?((
(
		lv_type_38_0=	'Services' 
    {
        newLeafNode(lv_type_38_0, grammarAccess.getViewpointAccess().getTypeServicesKeyword_15_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewpointRule());
	        }
       		addWithLastConsumed($current, "type", lv_type_38_0, "Services");
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewpointRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetCrossReference_15_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?((
(
		lv_type_40_0=	'Build' 
    {
        newLeafNode(lv_type_40_0, grammarAccess.getViewpointAccess().getTypeBuildKeyword_16_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewpointRule());
	        }
       		addWithLastConsumed($current, "type", lv_type_40_0, "Build");
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewpointRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_AspectsBuildCrossReference_16_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?((
(
		lv_type_42_0=	'Configuration' 
    {
        newLeafNode(lv_type_42_0, grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_17_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewpointRule());
	        }
       		addWithLastConsumed($current, "type", lv_type_42_0, "Configuration");
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getViewpointRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationCrossReference_17_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_44='}' 
    {
    	newLeafNode(otherlv_44, grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_18());
    }
)
;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getFQNRule()); } 
	 iv_ruleFQN=ruleFQN 
	 { $current=$iv_ruleFQN.current.getText(); }  
	 EOF 
;

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
    }
(( RULE_ID)=>    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
    }
))*)
    ;









RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


