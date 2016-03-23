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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
@SuppressWarnings("all")
public class InternalVpspecParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Viewpoint'", "'{'", "'name:'", "'description:'", "'extends'", "','", "'aggregates'", "'uses viewpoint'", "'uses model'", "'uses diagram'", "'uses workspace'", "'uses filesystem'", "'Data'", "'UI'", "'Diagrams'", "'Activity-Explorer'", "'Services'", "'Build'", "'Configuration'", "'}'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalVpspecParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVpspecParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVpspecParser.tokenNames; }
    public String getGrammarFileName() { return "../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g"; }



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



    // $ANTLR start "entryRuleViewpoint"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:74:1: entryRuleViewpoint returns [EObject current=null] : iv_ruleViewpoint= ruleViewpoint EOF ;
    public final EObject entryRuleViewpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewpoint = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:75:2: (iv_ruleViewpoint= ruleViewpoint EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:76:2: iv_ruleViewpoint= ruleViewpoint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getViewpointRule()); 
            }
            pushFollow(FOLLOW_ruleViewpoint_in_entryRuleViewpoint75);
            iv_ruleViewpoint=ruleViewpoint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleViewpoint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewpoint85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewpoint"


    // $ANTLR start "ruleViewpoint"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:83:1: ruleViewpoint returns [EObject current=null] : ( () otherlv_1= 'Viewpoint' ( (lv_shortName_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'name:' ( (lv_name_5_0= RULE_STRING ) ) ) (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'aggregates' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* )? (otherlv_16= 'uses viewpoint' ( ( ruleFQN ) ) (otherlv_18= ',' ( ( ruleFQN ) ) )* )? (otherlv_20= 'uses model' ( (lv_useAnyEMFResource_21_0= ruleEString ) ) (otherlv_22= ',' ( (lv_useAnyEMFResource_23_0= ruleEString ) ) )* )? (otherlv_24= 'uses diagram' ( (lv_useDiagramResource_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_useDiagramResource_27_0= ruleEString ) ) )* )? (otherlv_28= 'uses workspace' ( (lv_useWorkspaceResource_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_useWorkspaceResource_31_0= ruleEString ) ) )* )? (otherlv_32= 'uses filesystem' ( (lv_useFSResource_33_0= ruleEString ) ) (otherlv_34= ',' ( (lv_useFSResource_35_0= ruleEString ) ) )* )? (otherlv_36= 'Data' ( ( ruleFQN ) ) )? ( ( (lv_type_38_0= 'UI' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_40_0= 'Diagrams' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_42_0= 'Activity-Explorer' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_44_0= 'Services' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_46_0= 'Build' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_48_0= 'Configuration' ) ) ( ( ruleFQN ) ) )? otherlv_50= '}' ) ;
    public final EObject ruleViewpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_shortName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token lv_type_38_0=null;
        Token lv_type_40_0=null;
        Token lv_type_42_0=null;
        Token lv_type_44_0=null;
        Token lv_type_46_0=null;
        Token lv_type_48_0=null;
        Token otherlv_50=null;
        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_useAnyEMFResource_21_0 = null;

        AntlrDatatypeRuleToken lv_useAnyEMFResource_23_0 = null;

        AntlrDatatypeRuleToken lv_useDiagramResource_25_0 = null;

        AntlrDatatypeRuleToken lv_useDiagramResource_27_0 = null;

        AntlrDatatypeRuleToken lv_useWorkspaceResource_29_0 = null;

        AntlrDatatypeRuleToken lv_useWorkspaceResource_31_0 = null;

        AntlrDatatypeRuleToken lv_useFSResource_33_0 = null;

        AntlrDatatypeRuleToken lv_useFSResource_35_0 = null;


         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:86:28: ( ( () otherlv_1= 'Viewpoint' ( (lv_shortName_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'name:' ( (lv_name_5_0= RULE_STRING ) ) ) (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'aggregates' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* )? (otherlv_16= 'uses viewpoint' ( ( ruleFQN ) ) (otherlv_18= ',' ( ( ruleFQN ) ) )* )? (otherlv_20= 'uses model' ( (lv_useAnyEMFResource_21_0= ruleEString ) ) (otherlv_22= ',' ( (lv_useAnyEMFResource_23_0= ruleEString ) ) )* )? (otherlv_24= 'uses diagram' ( (lv_useDiagramResource_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_useDiagramResource_27_0= ruleEString ) ) )* )? (otherlv_28= 'uses workspace' ( (lv_useWorkspaceResource_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_useWorkspaceResource_31_0= ruleEString ) ) )* )? (otherlv_32= 'uses filesystem' ( (lv_useFSResource_33_0= ruleEString ) ) (otherlv_34= ',' ( (lv_useFSResource_35_0= ruleEString ) ) )* )? (otherlv_36= 'Data' ( ( ruleFQN ) ) )? ( ( (lv_type_38_0= 'UI' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_40_0= 'Diagrams' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_42_0= 'Activity-Explorer' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_44_0= 'Services' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_46_0= 'Build' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_48_0= 'Configuration' ) ) ( ( ruleFQN ) ) )? otherlv_50= '}' ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:87:1: ( () otherlv_1= 'Viewpoint' ( (lv_shortName_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'name:' ( (lv_name_5_0= RULE_STRING ) ) ) (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'aggregates' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* )? (otherlv_16= 'uses viewpoint' ( ( ruleFQN ) ) (otherlv_18= ',' ( ( ruleFQN ) ) )* )? (otherlv_20= 'uses model' ( (lv_useAnyEMFResource_21_0= ruleEString ) ) (otherlv_22= ',' ( (lv_useAnyEMFResource_23_0= ruleEString ) ) )* )? (otherlv_24= 'uses diagram' ( (lv_useDiagramResource_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_useDiagramResource_27_0= ruleEString ) ) )* )? (otherlv_28= 'uses workspace' ( (lv_useWorkspaceResource_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_useWorkspaceResource_31_0= ruleEString ) ) )* )? (otherlv_32= 'uses filesystem' ( (lv_useFSResource_33_0= ruleEString ) ) (otherlv_34= ',' ( (lv_useFSResource_35_0= ruleEString ) ) )* )? (otherlv_36= 'Data' ( ( ruleFQN ) ) )? ( ( (lv_type_38_0= 'UI' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_40_0= 'Diagrams' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_42_0= 'Activity-Explorer' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_44_0= 'Services' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_46_0= 'Build' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_48_0= 'Configuration' ) ) ( ( ruleFQN ) ) )? otherlv_50= '}' )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:87:1: ( () otherlv_1= 'Viewpoint' ( (lv_shortName_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'name:' ( (lv_name_5_0= RULE_STRING ) ) ) (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'aggregates' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* )? (otherlv_16= 'uses viewpoint' ( ( ruleFQN ) ) (otherlv_18= ',' ( ( ruleFQN ) ) )* )? (otherlv_20= 'uses model' ( (lv_useAnyEMFResource_21_0= ruleEString ) ) (otherlv_22= ',' ( (lv_useAnyEMFResource_23_0= ruleEString ) ) )* )? (otherlv_24= 'uses diagram' ( (lv_useDiagramResource_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_useDiagramResource_27_0= ruleEString ) ) )* )? (otherlv_28= 'uses workspace' ( (lv_useWorkspaceResource_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_useWorkspaceResource_31_0= ruleEString ) ) )* )? (otherlv_32= 'uses filesystem' ( (lv_useFSResource_33_0= ruleEString ) ) (otherlv_34= ',' ( (lv_useFSResource_35_0= ruleEString ) ) )* )? (otherlv_36= 'Data' ( ( ruleFQN ) ) )? ( ( (lv_type_38_0= 'UI' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_40_0= 'Diagrams' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_42_0= 'Activity-Explorer' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_44_0= 'Services' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_46_0= 'Build' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_48_0= 'Configuration' ) ) ( ( ruleFQN ) ) )? otherlv_50= '}' )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:87:2: () otherlv_1= 'Viewpoint' ( (lv_shortName_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'name:' ( (lv_name_5_0= RULE_STRING ) ) ) (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )? (otherlv_12= 'aggregates' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* )? (otherlv_16= 'uses viewpoint' ( ( ruleFQN ) ) (otherlv_18= ',' ( ( ruleFQN ) ) )* )? (otherlv_20= 'uses model' ( (lv_useAnyEMFResource_21_0= ruleEString ) ) (otherlv_22= ',' ( (lv_useAnyEMFResource_23_0= ruleEString ) ) )* )? (otherlv_24= 'uses diagram' ( (lv_useDiagramResource_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_useDiagramResource_27_0= ruleEString ) ) )* )? (otherlv_28= 'uses workspace' ( (lv_useWorkspaceResource_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_useWorkspaceResource_31_0= ruleEString ) ) )* )? (otherlv_32= 'uses filesystem' ( (lv_useFSResource_33_0= ruleEString ) ) (otherlv_34= ',' ( (lv_useFSResource_35_0= ruleEString ) ) )* )? (otherlv_36= 'Data' ( ( ruleFQN ) ) )? ( ( (lv_type_38_0= 'UI' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_40_0= 'Diagrams' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_42_0= 'Activity-Explorer' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_44_0= 'Services' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_46_0= 'Build' ) ) ( ( ruleFQN ) ) )? ( ( (lv_type_48_0= 'Configuration' ) ) ( ( ruleFQN ) ) )? otherlv_50= '}'
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:87:2: ()
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:88:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getViewpointAccess().getViewpointAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleViewpoint131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getViewpointAccess().getViewpointKeyword_1());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:97:1: ( (lv_shortName_2_0= RULE_ID ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:98:1: (lv_shortName_2_0= RULE_ID )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:98:1: (lv_shortName_2_0= RULE_ID )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:99:3: lv_shortName_2_0= RULE_ID
                    {
                    lv_shortName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleViewpoint148); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_shortName_2_0, grammarAccess.getViewpointAccess().getShortNameIDTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"shortName",
                              		lv_shortName_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleViewpoint166); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getViewpointAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:119:1: (otherlv_4= 'name:' ( (lv_name_5_0= RULE_STRING ) ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:119:3: otherlv_4= 'name:' ( (lv_name_5_0= RULE_STRING ) )
            {
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleViewpoint179); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getViewpointAccess().getNameKeyword_4_0());
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:123:1: ( (lv_name_5_0= RULE_STRING ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:124:1: (lv_name_5_0= RULE_STRING )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:124:1: (lv_name_5_0= RULE_STRING )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:125:3: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleViewpoint196); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getViewpointAccess().getNameSTRINGTerminalRuleCall_4_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getViewpointRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:141:3: (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:141:5: otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleViewpoint215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getViewpointAccess().getDescriptionKeyword_5_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:145:1: ( (lv_description_7_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:146:1: (lv_description_7_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:146:1: (lv_description_7_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:147:3: lv_description_7_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleViewpoint236);
                    lv_description_7_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getViewpointRule());
                      	        }
                             		set(
                             			current, 
                             			"description",
                              		lv_description_7_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:163:4: (otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:163:6: otherlv_8= 'extends' ( ( ruleFQN ) ) (otherlv_10= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleViewpoint251); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getViewpointAccess().getExtendsKeyword_6_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:167:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:168:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:168:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:169:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getParentsViewpointCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint274);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:182:2: (otherlv_10= ',' ( ( ruleFQN ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:182:4: otherlv_10= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleViewpoint287); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getViewpointAccess().getCommaKeyword_6_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:186:1: ( ( ruleFQN ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:187:1: ( ruleFQN )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:187:1: ( ruleFQN )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:188:3: ruleFQN
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getViewpointRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getViewpointAccess().getParentsViewpointCrossReference_6_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint310);
                    	    ruleFQN();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:201:6: (otherlv_12= 'aggregates' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:201:8: otherlv_12= 'aggregates' ( ( ruleFQN ) ) (otherlv_14= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleViewpoint327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getViewpointAccess().getAggregatesKeyword_7_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:205:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:206:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:206:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:207:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getDependenciesViewpointCrossReference_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint350);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:220:2: (otherlv_14= ',' ( ( ruleFQN ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:220:4: otherlv_14= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FOLLOW_16_in_ruleViewpoint363); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_14, grammarAccess.getViewpointAccess().getCommaKeyword_7_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:224:1: ( ( ruleFQN ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:225:1: ( ruleFQN )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:225:1: ( ruleFQN )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:226:3: ruleFQN
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getViewpointRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getViewpointAccess().getDependenciesViewpointCrossReference_7_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint386);
                    	    ruleFQN();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:239:6: (otherlv_16= 'uses viewpoint' ( ( ruleFQN ) ) (otherlv_18= ',' ( ( ruleFQN ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:239:8: otherlv_16= 'uses viewpoint' ( ( ruleFQN ) ) (otherlv_18= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_16=(Token)match(input,18,FOLLOW_18_in_ruleViewpoint403); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getViewpointAccess().getUsesViewpointKeyword_8_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:243:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:244:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:244:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:245:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getUseViewpointViewpointCrossReference_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint426);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:258:2: (otherlv_18= ',' ( ( ruleFQN ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:258:4: otherlv_18= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_18=(Token)match(input,16,FOLLOW_16_in_ruleViewpoint439); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_18, grammarAccess.getViewpointAccess().getCommaKeyword_8_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:262:1: ( ( ruleFQN ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:263:1: ( ruleFQN )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:263:1: ( ruleFQN )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:264:3: ruleFQN
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getViewpointRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getViewpointAccess().getUseViewpointViewpointCrossReference_8_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint462);
                    	    ruleFQN();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:277:6: (otherlv_20= 'uses model' ( (lv_useAnyEMFResource_21_0= ruleEString ) ) (otherlv_22= ',' ( (lv_useAnyEMFResource_23_0= ruleEString ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:277:8: otherlv_20= 'uses model' ( (lv_useAnyEMFResource_21_0= ruleEString ) ) (otherlv_22= ',' ( (lv_useAnyEMFResource_23_0= ruleEString ) ) )*
                    {
                    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleViewpoint479); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getViewpointAccess().getUsesModelKeyword_9_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:281:1: ( (lv_useAnyEMFResource_21_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:282:1: (lv_useAnyEMFResource_21_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:282:1: (lv_useAnyEMFResource_21_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:283:3: lv_useAnyEMFResource_21_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getUseAnyEMFResourceEStringParserRuleCall_9_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleViewpoint500);
                    lv_useAnyEMFResource_21_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getViewpointRule());
                      	        }
                             		add(
                             			current, 
                             			"useAnyEMFResource",
                              		lv_useAnyEMFResource_21_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:299:2: (otherlv_22= ',' ( (lv_useAnyEMFResource_23_0= ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:299:4: otherlv_22= ',' ( (lv_useAnyEMFResource_23_0= ruleEString ) )
                    	    {
                    	    otherlv_22=(Token)match(input,16,FOLLOW_16_in_ruleViewpoint513); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_22, grammarAccess.getViewpointAccess().getCommaKeyword_9_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:303:1: ( (lv_useAnyEMFResource_23_0= ruleEString ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:304:1: (lv_useAnyEMFResource_23_0= ruleEString )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:304:1: (lv_useAnyEMFResource_23_0= ruleEString )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:305:3: lv_useAnyEMFResource_23_0= ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getViewpointAccess().getUseAnyEMFResourceEStringParserRuleCall_9_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEString_in_ruleViewpoint534);
                    	    lv_useAnyEMFResource_23_0=ruleEString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getViewpointRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"useAnyEMFResource",
                    	              		lv_useAnyEMFResource_23_0, 
                    	              		"EString");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:321:6: (otherlv_24= 'uses diagram' ( (lv_useDiagramResource_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_useDiagramResource_27_0= ruleEString ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:321:8: otherlv_24= 'uses diagram' ( (lv_useDiagramResource_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_useDiagramResource_27_0= ruleEString ) ) )*
                    {
                    otherlv_24=(Token)match(input,20,FOLLOW_20_in_ruleViewpoint551); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getViewpointAccess().getUsesDiagramKeyword_10_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:325:1: ( (lv_useDiagramResource_25_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:326:1: (lv_useDiagramResource_25_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:326:1: (lv_useDiagramResource_25_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:327:3: lv_useDiagramResource_25_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getUseDiagramResourceEStringParserRuleCall_10_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleViewpoint572);
                    lv_useDiagramResource_25_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getViewpointRule());
                      	        }
                             		add(
                             			current, 
                             			"useDiagramResource",
                              		lv_useDiagramResource_25_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:343:2: (otherlv_26= ',' ( (lv_useDiagramResource_27_0= ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==16) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:343:4: otherlv_26= ',' ( (lv_useDiagramResource_27_0= ruleEString ) )
                    	    {
                    	    otherlv_26=(Token)match(input,16,FOLLOW_16_in_ruleViewpoint585); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_26, grammarAccess.getViewpointAccess().getCommaKeyword_10_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:347:1: ( (lv_useDiagramResource_27_0= ruleEString ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:348:1: (lv_useDiagramResource_27_0= ruleEString )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:348:1: (lv_useDiagramResource_27_0= ruleEString )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:349:3: lv_useDiagramResource_27_0= ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getViewpointAccess().getUseDiagramResourceEStringParserRuleCall_10_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEString_in_ruleViewpoint606);
                    	    lv_useDiagramResource_27_0=ruleEString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getViewpointRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"useDiagramResource",
                    	              		lv_useDiagramResource_27_0, 
                    	              		"EString");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:365:6: (otherlv_28= 'uses workspace' ( (lv_useWorkspaceResource_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_useWorkspaceResource_31_0= ruleEString ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:365:8: otherlv_28= 'uses workspace' ( (lv_useWorkspaceResource_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_useWorkspaceResource_31_0= ruleEString ) ) )*
                    {
                    otherlv_28=(Token)match(input,21,FOLLOW_21_in_ruleViewpoint623); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_28, grammarAccess.getViewpointAccess().getUsesWorkspaceKeyword_11_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:369:1: ( (lv_useWorkspaceResource_29_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:370:1: (lv_useWorkspaceResource_29_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:370:1: (lv_useWorkspaceResource_29_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:371:3: lv_useWorkspaceResource_29_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getUseWorkspaceResourceEStringParserRuleCall_11_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleViewpoint644);
                    lv_useWorkspaceResource_29_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getViewpointRule());
                      	        }
                             		add(
                             			current, 
                             			"useWorkspaceResource",
                              		lv_useWorkspaceResource_29_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:387:2: (otherlv_30= ',' ( (lv_useWorkspaceResource_31_0= ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==16) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:387:4: otherlv_30= ',' ( (lv_useWorkspaceResource_31_0= ruleEString ) )
                    	    {
                    	    otherlv_30=(Token)match(input,16,FOLLOW_16_in_ruleViewpoint657); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_30, grammarAccess.getViewpointAccess().getCommaKeyword_11_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:391:1: ( (lv_useWorkspaceResource_31_0= ruleEString ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:392:1: (lv_useWorkspaceResource_31_0= ruleEString )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:392:1: (lv_useWorkspaceResource_31_0= ruleEString )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:393:3: lv_useWorkspaceResource_31_0= ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getViewpointAccess().getUseWorkspaceResourceEStringParserRuleCall_11_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEString_in_ruleViewpoint678);
                    	    lv_useWorkspaceResource_31_0=ruleEString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getViewpointRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"useWorkspaceResource",
                    	              		lv_useWorkspaceResource_31_0, 
                    	              		"EString");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:409:6: (otherlv_32= 'uses filesystem' ( (lv_useFSResource_33_0= ruleEString ) ) (otherlv_34= ',' ( (lv_useFSResource_35_0= ruleEString ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:409:8: otherlv_32= 'uses filesystem' ( (lv_useFSResource_33_0= ruleEString ) ) (otherlv_34= ',' ( (lv_useFSResource_35_0= ruleEString ) ) )*
                    {
                    otherlv_32=(Token)match(input,22,FOLLOW_22_in_ruleViewpoint695); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getViewpointAccess().getUsesFilesystemKeyword_12_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:413:1: ( (lv_useFSResource_33_0= ruleEString ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:414:1: (lv_useFSResource_33_0= ruleEString )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:414:1: (lv_useFSResource_33_0= ruleEString )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:415:3: lv_useFSResource_33_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getUseFSResourceEStringParserRuleCall_12_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEString_in_ruleViewpoint716);
                    lv_useFSResource_33_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getViewpointRule());
                      	        }
                             		add(
                             			current, 
                             			"useFSResource",
                              		lv_useFSResource_33_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:431:2: (otherlv_34= ',' ( (lv_useFSResource_35_0= ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==16) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:431:4: otherlv_34= ',' ( (lv_useFSResource_35_0= ruleEString ) )
                    	    {
                    	    otherlv_34=(Token)match(input,16,FOLLOW_16_in_ruleViewpoint729); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_34, grammarAccess.getViewpointAccess().getCommaKeyword_12_2_0());
                    	          
                    	    }
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:435:1: ( (lv_useFSResource_35_0= ruleEString ) )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:436:1: (lv_useFSResource_35_0= ruleEString )
                    	    {
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:436:1: (lv_useFSResource_35_0= ruleEString )
                    	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:437:3: lv_useFSResource_35_0= ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getViewpointAccess().getUseFSResourceEStringParserRuleCall_12_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEString_in_ruleViewpoint750);
                    	    lv_useFSResource_35_0=ruleEString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getViewpointRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"useFSResource",
                    	              		lv_useFSResource_35_0, 
                    	              		"EString");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:453:6: (otherlv_36= 'Data' ( ( ruleFQN ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:453:8: otherlv_36= 'Data' ( ( ruleFQN ) )
                    {
                    otherlv_36=(Token)match(input,23,FOLLOW_23_in_ruleViewpoint767); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_36, grammarAccess.getViewpointAccess().getDataKeyword_13_0());
                          
                    }
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:457:1: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:458:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:458:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:459:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_DataDataCrossReference_13_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint790);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:472:4: ( ( (lv_type_38_0= 'UI' ) ) ( ( ruleFQN ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:472:5: ( (lv_type_38_0= 'UI' ) ) ( ( ruleFQN ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:472:5: ( (lv_type_38_0= 'UI' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:473:1: (lv_type_38_0= 'UI' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:473:1: (lv_type_38_0= 'UI' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:474:3: lv_type_38_0= 'UI'
                    {
                    lv_type_38_0=(Token)match(input,24,FOLLOW_24_in_ruleViewpoint811); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_38_0, grammarAccess.getViewpointAccess().getTypeUIKeyword_14_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                             		addWithLastConsumed(current, "type", lv_type_38_0, "UI");
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:487:2: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:488:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:488:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:489:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_AspectsUIDescriptionCrossReference_14_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint847);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:502:4: ( ( (lv_type_40_0= 'Diagrams' ) ) ( ( ruleFQN ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:502:5: ( (lv_type_40_0= 'Diagrams' ) ) ( ( ruleFQN ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:502:5: ( (lv_type_40_0= 'Diagrams' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:503:1: (lv_type_40_0= 'Diagrams' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:503:1: (lv_type_40_0= 'Diagrams' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:504:3: lv_type_40_0= 'Diagrams'
                    {
                    lv_type_40_0=(Token)match(input,25,FOLLOW_25_in_ruleViewpoint868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_40_0, grammarAccess.getViewpointAccess().getTypeDiagramsKeyword_15_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                             		addWithLastConsumed(current, "type", lv_type_40_0, "Diagrams");
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:517:2: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:518:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:518:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:519:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_AspectsDiagramSetCrossReference_15_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint904);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:532:4: ( ( (lv_type_42_0= 'Activity-Explorer' ) ) ( ( ruleFQN ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:532:5: ( (lv_type_42_0= 'Activity-Explorer' ) ) ( ( ruleFQN ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:532:5: ( (lv_type_42_0= 'Activity-Explorer' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:533:1: (lv_type_42_0= 'Activity-Explorer' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:533:1: (lv_type_42_0= 'Activity-Explorer' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:534:3: lv_type_42_0= 'Activity-Explorer'
                    {
                    lv_type_42_0=(Token)match(input,26,FOLLOW_26_in_ruleViewpoint925); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_42_0, grammarAccess.getViewpointAccess().getTypeActivityExplorerKeyword_16_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                             		addWithLastConsumed(current, "type", lv_type_42_0, "Activity-Explorer");
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:547:2: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:548:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:548:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:549:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_AspectsViewpointActivityExplorerCrossReference_16_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint961);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:562:4: ( ( (lv_type_44_0= 'Services' ) ) ( ( ruleFQN ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:562:5: ( (lv_type_44_0= 'Services' ) ) ( ( ruleFQN ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:562:5: ( (lv_type_44_0= 'Services' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:563:1: (lv_type_44_0= 'Services' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:563:1: (lv_type_44_0= 'Services' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:564:3: lv_type_44_0= 'Services'
                    {
                    lv_type_44_0=(Token)match(input,27,FOLLOW_27_in_ruleViewpoint982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_44_0, grammarAccess.getViewpointAccess().getTypeServicesKeyword_17_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                             		addWithLastConsumed(current, "type", lv_type_44_0, "Services");
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:577:2: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:578:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:578:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:579:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_AspectsServiceSetCrossReference_17_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint1018);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:592:4: ( ( (lv_type_46_0= 'Build' ) ) ( ( ruleFQN ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:592:5: ( (lv_type_46_0= 'Build' ) ) ( ( ruleFQN ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:592:5: ( (lv_type_46_0= 'Build' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:593:1: (lv_type_46_0= 'Build' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:593:1: (lv_type_46_0= 'Build' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:594:3: lv_type_46_0= 'Build'
                    {
                    lv_type_46_0=(Token)match(input,28,FOLLOW_28_in_ruleViewpoint1039); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_46_0, grammarAccess.getViewpointAccess().getTypeBuildKeyword_18_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                             		addWithLastConsumed(current, "type", lv_type_46_0, "Build");
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:607:2: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:608:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:608:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:609:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_AspectsBuildCrossReference_18_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint1075);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:622:4: ( ( (lv_type_48_0= 'Configuration' ) ) ( ( ruleFQN ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:622:5: ( (lv_type_48_0= 'Configuration' ) ) ( ( ruleFQN ) )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:622:5: ( (lv_type_48_0= 'Configuration' ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:623:1: (lv_type_48_0= 'Configuration' )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:623:1: (lv_type_48_0= 'Configuration' )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:624:3: lv_type_48_0= 'Configuration'
                    {
                    lv_type_48_0=(Token)match(input,29,FOLLOW_29_in_ruleViewpoint1096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_48_0, grammarAccess.getViewpointAccess().getTypeConfigurationKeyword_19_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                             		addWithLastConsumed(current, "type", lv_type_48_0, "Configuration");
                      	    
                    }

                    }


                    }

                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:637:2: ( ( ruleFQN ) )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:638:1: ( ruleFQN )
                    {
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:638:1: ( ruleFQN )
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:639:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewpointRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewpointAccess().getVP_AspectsConfigurationCrossReference_19_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleViewpoint1132);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_50=(Token)match(input,30,FOLLOW_30_in_ruleViewpoint1146); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_50, grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_20());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewpoint"


    // $ANTLR start "entryRuleEString"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:664:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:665:2: (iv_ruleEString= ruleEString EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:666:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1183);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1194); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:673:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:676:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:677:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:677:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:677:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString1234); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:685:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString1260); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFQN"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:700:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:701:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:702:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1306);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1317); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:709:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:712:28: ( (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* ) )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:713:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            {
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:713:1: (this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )* )
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:713:6: this_ID_0= RULE_ID (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1357); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:720:1: (kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==31) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:721:2: kw= '.' ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    {
            	    kw=(Token)match(input,31,FOLLOW_31_in_ruleFQN1376); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:726:1: ( ( RULE_ID )=>this_ID_2= RULE_ID )
            	    // ../org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.desc/src-gen/org/polarsys/kitalpha/ad/viewpoint/dsl/cs/text/parser/antlr/internal/InternalVpspec.g:726:2: ( RULE_ID )=>this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1397); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleViewpoint_in_entryRuleViewpoint75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewpoint85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleViewpoint131 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleViewpoint148 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleViewpoint166 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleViewpoint179 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleViewpoint196 = new BitSet(new long[]{0x000000007FFEC000L});
    public static final BitSet FOLLOW_14_in_ruleViewpoint215 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleViewpoint236 = new BitSet(new long[]{0x000000007FFE8000L});
    public static final BitSet FOLLOW_15_in_ruleViewpoint251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint274 = new BitSet(new long[]{0x000000007FFF0000L});
    public static final BitSet FOLLOW_16_in_ruleViewpoint287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint310 = new BitSet(new long[]{0x000000007FFF0000L});
    public static final BitSet FOLLOW_17_in_ruleViewpoint327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint350 = new BitSet(new long[]{0x000000007FFD0000L});
    public static final BitSet FOLLOW_16_in_ruleViewpoint363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint386 = new BitSet(new long[]{0x000000007FFD0000L});
    public static final BitSet FOLLOW_18_in_ruleViewpoint403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint426 = new BitSet(new long[]{0x000000007FF90000L});
    public static final BitSet FOLLOW_16_in_ruleViewpoint439 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint462 = new BitSet(new long[]{0x000000007FF90000L});
    public static final BitSet FOLLOW_19_in_ruleViewpoint479 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleViewpoint500 = new BitSet(new long[]{0x000000007FF10000L});
    public static final BitSet FOLLOW_16_in_ruleViewpoint513 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleViewpoint534 = new BitSet(new long[]{0x000000007FF10000L});
    public static final BitSet FOLLOW_20_in_ruleViewpoint551 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleViewpoint572 = new BitSet(new long[]{0x000000007FE10000L});
    public static final BitSet FOLLOW_16_in_ruleViewpoint585 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleViewpoint606 = new BitSet(new long[]{0x000000007FE10000L});
    public static final BitSet FOLLOW_21_in_ruleViewpoint623 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleViewpoint644 = new BitSet(new long[]{0x000000007FC10000L});
    public static final BitSet FOLLOW_16_in_ruleViewpoint657 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleViewpoint678 = new BitSet(new long[]{0x000000007FC10000L});
    public static final BitSet FOLLOW_22_in_ruleViewpoint695 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleViewpoint716 = new BitSet(new long[]{0x000000007F810000L});
    public static final BitSet FOLLOW_16_in_ruleViewpoint729 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleViewpoint750 = new BitSet(new long[]{0x000000007F810000L});
    public static final BitSet FOLLOW_23_in_ruleViewpoint767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint790 = new BitSet(new long[]{0x000000007F000000L});
    public static final BitSet FOLLOW_24_in_ruleViewpoint811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint847 = new BitSet(new long[]{0x000000007E000000L});
    public static final BitSet FOLLOW_25_in_ruleViewpoint868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint904 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_26_in_ruleViewpoint925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint961 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_27_in_ruleViewpoint982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint1018 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_28_in_ruleViewpoint1039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint1075 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleViewpoint1096 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleViewpoint1132 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleViewpoint1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1357 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleFQN1376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1397 = new BitSet(new long[]{0x0000000080000002L});

}