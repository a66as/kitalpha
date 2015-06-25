/*
 * generated by Xtext
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpdiagramGrammarAccess;

public class VpdiagramParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private VpdiagramGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.parser.antlr.internal.InternalVpdiagramParser createParser(XtextTokenStream stream) {
		return new org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.parser.antlr.internal.InternalVpdiagramParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Diagrams";
	}
	
	public VpdiagramGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(VpdiagramGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
