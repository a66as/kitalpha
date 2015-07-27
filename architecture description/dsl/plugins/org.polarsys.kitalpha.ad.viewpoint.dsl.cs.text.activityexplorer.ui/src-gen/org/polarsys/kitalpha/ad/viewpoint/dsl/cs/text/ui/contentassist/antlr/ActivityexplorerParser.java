/*
* generated by Xtext
*/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ActivityexplorerGrammarAccess;

public class ActivityexplorerParser extends AbstractContentAssistParser {
	
	@Inject
	private ActivityexplorerGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalActivityexplorerParser createParser() {
		org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalActivityexplorerParser result = new org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalActivityexplorerParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getViewpointActivityExplorerAccess().getGroup_0(), "rule__ViewpointActivityExplorer__Group_0__0");
					put(grammarAccess.getViewpointActivityExplorerAccess().getGroup_2(), "rule__ViewpointActivityExplorer__Group_2__0");
					put(grammarAccess.getPagesAccess().getGroup(), "rule__Pages__Group__0");
					put(grammarAccess.getSectionsAccess().getGroup(), "rule__Sections__Group__0");
					put(grammarAccess.getActivitiesAccess().getGroup(), "rule__Activities__Group__0");
					put(grammarAccess.getPageAccess().getGroup(), "rule__Page__Group__0");
					put(grammarAccess.getPageAccess().getGroup_4(), "rule__Page__Group_4__0");
					put(grammarAccess.getPageAccess().getGroup_5(), "rule__Page__Group_5__0");
					put(grammarAccess.getPageAccess().getGroup_9(), "rule__Page__Group_9__0");
					put(grammarAccess.getPageAccess().getGroup_9_2(), "rule__Page__Group_9_2__0");
					put(grammarAccess.getPageAccess().getGroup_9_3(), "rule__Page__Group_9_3__0");
					put(grammarAccess.getPageAccess().getGroup_10(), "rule__Page__Group_10__0");
					put(grammarAccess.getPageAccess().getGroup_11(), "rule__Page__Group_11__0");
					put(grammarAccess.getPageAccess().getGroup_12(), "rule__Page__Group_12__0");
					put(grammarAccess.getOverviewAccess().getGroup(), "rule__Overview__Group__0");
					put(grammarAccess.getOverviewAccess().getGroup_3(), "rule__Overview__Group_3__0");
					put(grammarAccess.getOverviewAccess().getGroup_4(), "rule__Overview__Group_4__0");
					put(grammarAccess.getOverviewAccess().getGroup_5(), "rule__Overview__Group_5__0");
					put(grammarAccess.getSectionExtensionAccess().getGroup(), "rule__SectionExtension__Group__0");
					put(grammarAccess.getSectionExtensionAccess().getGroup_4(), "rule__SectionExtension__Group_4__0");
					put(grammarAccess.getSectionExtensionAccess().getGroup_10(), "rule__SectionExtension__Group_10__0");
					put(grammarAccess.getSectionExtensionAccess().getGroup_11(), "rule__SectionExtension__Group_11__0");
					put(grammarAccess.getActivityExtensionAccess().getGroup(), "rule__ActivityExtension__Group__0");
					put(grammarAccess.getActivityExtensionAccess().getGroup_4(), "rule__ActivityExtension__Group_4__0");
					put(grammarAccess.getActivityExtensionAccess().getGroup_10(), "rule__ActivityExtension__Group_10__0");
					put(grammarAccess.getActivityExtensionAccess().getGroup_11(), "rule__ActivityExtension__Group_11__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getViewpointActivityExplorerAccess().getNameAssignment_0_2(), "rule__ViewpointActivityExplorer__NameAssignment_0_2");
					put(grammarAccess.getViewpointActivityExplorerAccess().getOwnedNewPagesAssignment_0_4(), "rule__ViewpointActivityExplorer__OwnedNewPagesAssignment_0_4");
					put(grammarAccess.getViewpointActivityExplorerAccess().getOwnedSectionsExtensionAssignment_1(), "rule__ViewpointActivityExplorer__OwnedSectionsExtensionAssignment_1");
					put(grammarAccess.getViewpointActivityExplorerAccess().getOwnedActivitiesExtensionAssignment_2_0(), "rule__ViewpointActivityExplorer__OwnedActivitiesExtensionAssignment_2_0");
					put(grammarAccess.getPagesAccess().getOwnedActivityExplorerPagesAssignment_3(), "rule__Pages__OwnedActivityExplorerPagesAssignment_3");
					put(grammarAccess.getPagesAccess().getOwnedActivityExplorerPagesAssignment_4(), "rule__Pages__OwnedActivityExplorerPagesAssignment_4");
					put(grammarAccess.getSectionsAccess().getOwnedSectionsExtensionsAssignment_3(), "rule__Sections__OwnedSectionsExtensionsAssignment_3");
					put(grammarAccess.getSectionsAccess().getOwnedSectionsExtensionsAssignment_4(), "rule__Sections__OwnedSectionsExtensionsAssignment_4");
					put(grammarAccess.getActivitiesAccess().getOwnedActivitiesExtensionsAssignment_3(), "rule__Activities__OwnedActivitiesExtensionsAssignment_3");
					put(grammarAccess.getActivitiesAccess().getOwnedActivitiesExtensionsAssignment_4(), "rule__Activities__OwnedActivitiesExtensionsAssignment_4");
					put(grammarAccess.getPageAccess().getNameAssignment_2(), "rule__Page__NameAssignment_2");
					put(grammarAccess.getPageAccess().getModelTypeAssignment_4_2(), "rule__Page__ModelTypeAssignment_4_2");
					put(grammarAccess.getPageAccess().getActivityExplorerItemIDAssignment_5_1(), "rule__Page__ActivityExplorerItemIDAssignment_5_1");
					put(grammarAccess.getPageAccess().getIndexAssignment_7(), "rule__Page__IndexAssignment_7");
					put(grammarAccess.getPageAccess().getOwnedOverviewAssignment_8(), "rule__Page__OwnedOverviewAssignment_8");
					put(grammarAccess.getPageAccess().getImagePathOnAssignment_9_2_3(), "rule__Page__ImagePathOnAssignment_9_2_3");
					put(grammarAccess.getPageAccess().getImagePathOffAssignment_9_3_3(), "rule__Page__ImagePathOffAssignment_9_3_3");
					put(grammarAccess.getPageAccess().getTabNameAssignment_10_2(), "rule__Page__TabNameAssignment_10_2");
					put(grammarAccess.getPageAccess().getHasPredicateAssignment_11_2(), "rule__Page__HasPredicateAssignment_11_2");
					put(grammarAccess.getPageAccess().getShowViewerAssignment_12_3(), "rule__Page__ShowViewerAssignment_12_3");
					put(grammarAccess.getOverviewAccess().getDescriptionAssignment_3_1(), "rule__Overview__DescriptionAssignment_3_1");
					put(grammarAccess.getOverviewAccess().getImagePathOnAssignment_4_3(), "rule__Overview__ImagePathOnAssignment_4_3");
					put(grammarAccess.getOverviewAccess().getImagePathOffAssignment_5_3(), "rule__Overview__ImagePathOffAssignment_5_3");
					put(grammarAccess.getSectionExtensionAccess().getNameAssignment_2(), "rule__SectionExtension__NameAssignment_2");
					put(grammarAccess.getSectionExtensionAccess().getActivityExplorerItemIDAssignment_4_1(), "rule__SectionExtension__ActivityExplorerItemIDAssignment_4_1");
					put(grammarAccess.getSectionExtensionAccess().getExtendedPageIDAssignment_7(), "rule__SectionExtension__ExtendedPageIDAssignment_7");
					put(grammarAccess.getSectionExtensionAccess().getIndexAssignment_9(), "rule__SectionExtension__IndexAssignment_9");
					put(grammarAccess.getSectionExtensionAccess().getFilteringAssignment_10_2(), "rule__SectionExtension__FilteringAssignment_10_2");
					put(grammarAccess.getSectionExtensionAccess().getExpandedAssignment_11_2(), "rule__SectionExtension__ExpandedAssignment_11_2");
					put(grammarAccess.getActivityExtensionAccess().getNameAssignment_2(), "rule__ActivityExtension__NameAssignment_2");
					put(grammarAccess.getActivityExtensionAccess().getActivityExplorerItemIDAssignment_4_1(), "rule__ActivityExtension__ActivityExplorerItemIDAssignment_4_1");
					put(grammarAccess.getActivityExtensionAccess().getExtendedSectionIDAssignment_7(), "rule__ActivityExtension__ExtendedSectionIDAssignment_7");
					put(grammarAccess.getActivityExtensionAccess().getIndexAssignment_9(), "rule__ActivityExtension__IndexAssignment_9");
					put(grammarAccess.getActivityExtensionAccess().getHasPredicateAssignment_10_2(), "rule__ActivityExtension__HasPredicateAssignment_10_2");
					put(grammarAccess.getActivityExtensionAccess().getImagePathOffAssignment_11_2(), "rule__ActivityExtension__ImagePathOffAssignment_11_2");
					put(grammarAccess.getViewpointActivityExplorerAccess().getUnorderedGroup(), "rule__ViewpointActivityExplorer__UnorderedGroup");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalActivityexplorerParser typedParser = (org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalActivityexplorerParser) parser;
			typedParser.entryRuleViewpointActivityExplorer();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ActivityexplorerGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ActivityexplorerGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}