//Generated with EGF 1.5.0.v20170706-0846
package org.polarsys.kitalpha.emde.egf.editor;

import org.polarsys.kitalpha.emde.egf.utils.*;
import org.polarsys.kitalpha.emde.egf.helper.*;
import org.eclipse.egf.emf.pattern.base.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.emf.codegen.ecore.genmodel.impl.*;
import org.eclipse.emf.codegen.ecore.genmodel.generator.*;
import org.eclipse.emf.codegen.util.*;
import org.eclipse.emf.ecore.util.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

public class ActionBarContributor extends org.eclipse.egf.emf.pattern.editor.ActionBarContributor {
	protected static String nl;

	public static synchronized ActionBarContributor create(String lineSeparator) {
		nl = lineSeparator;
		ActionBarContributor result = new ActionBarContributor();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "";
	protected final String TEXT_2 = NL + "package ";
	protected final String TEXT_3 = ";" + NL;
	protected final String TEXT_4 = NL + NL + "/**" + NL + " * This is the action bar contributor for the ";
	protected final String TEXT_5 = " model editor." + NL + " * <!-- begin-user-doc -->";
	protected final String TEXT_6 = NL + " * @implements IPropertyChangeListener";
	protected final String TEXT_7 = NL + " * <!-- end-user-doc -->" + NL + " * @generated" + NL + " */" + NL
			+ "public class ";
	protected final String TEXT_8 = NL + "\textends ";
	protected final String TEXT_9 = NL + "\timplements ";
	protected final String TEXT_10 = ", ";
	protected final String TEXT_11 = NL + "{" + NL + "" + NL
			+ "\tprivate final class SchemeLoadResourceAction extends Action {" + NL + "" + NL
			+ "\t\tpublic SchemeLoadResourceAction() {" + NL + "\t\t\tsuper(\"Load Reusable Resource...\");" + NL
			+ "\t\t\t";
	protected final String TEXT_12 = " uri = URI.createURI(\"platform:/plugin/org.polarsys.kitalpha.resourcereuse.emfscheme.ui/icons/searchView.gif\");"
			+ NL + "\t\t\tsetImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(uri));" + NL + "\t\t}"
			+ NL + "\t\t";
	protected final String TEXT_13 = NL + "\t\t\t@Override";
	protected final String TEXT_14 = NL + "\t\tpublic void run() {" + NL
			+ "\t\t\tif (activeEditorPart instanceof IViewerProvider) {" + NL
			+ "\t\t\t\tViewer viewer = ((IViewerProvider) activeEditorPart).getViewer();" + NL
			+ "\t\t\t\tif (viewer == null) " + NL + "\t\t\t\t\treturn ;" + NL + "\t\t\t\t";
	protected final String TEXT_15 = " dialog = new ResourceReuseSelectionDialog(activeEditor.getSite().getShell());"
			+ NL + "\t\t\t\t" + NL + "\t\t\t\tif (dialog.open() == ";
	protected final String TEXT_16 = ".OK) {" + NL
			+ "\t\t\t\t\tEObject selection = currentResource.getContents().get(0);" + NL + "\t\t\t\t\t";
	protected final String TEXT_17 = " criteria = dialog.getCriteria();" + NL + "\t\t\t\t\tURI modelToLoad = ";
	protected final String TEXT_18 = ".createModelReuseURI(criteria);" + NL + "\t\t\t\t\ttry {" + NL
			+ "\t\t\t\t\t\tResource res = ";
	protected final String TEXT_19 = ".loadResourceForCurrentResourceSet(selection, modelToLoad);" + NL
			+ "\t\t\t\t\t\tif (res != null)" + NL
			+ "\t\t\t\t\t\t\tLibraryHelper.add(currentResource.getResourceSet(), currentResource.getURI(), modelToLoad);"
			+ NL + "\t\t\t\t\t} catch (Exception e) {" + NL + "\t\t\t\t\t\t";
	protected final String TEXT_20 = ".INSTANCE.log(e);" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL
			+ "\t\t}" + NL + "\t}" + NL + "\tprivate final class RefreshViewerAction extends ";
	protected final String TEXT_21 = " {" + NL + "\t\tprivate RefreshViewerAction() {" + NL + "\t\t\tsuper(";
	protected final String TEXT_22 = ".INSTANCE.getString(\"_UI_RefreshViewer_menu_item\"));";
	protected final String TEXT_23 = NL + "\t\t}" + NL;
	protected final String TEXT_24 = NL + "\t\t\t@Override";
	protected final String TEXT_25 = NL + "\t\tpublic boolean isEnabled() {" + NL
			+ "\t\t\treturn activeEditorPart instanceof ";
	protected final String TEXT_26 = ";" + NL + "\t\t}" + NL;
	protected final String TEXT_27 = NL + "\t\t\t@Override";
	protected final String TEXT_28 = NL + "\t\tpublic void run() {" + NL + "\t\t\tif (activeEditorPart instanceof ";
	protected final String TEXT_29 = ") {" + NL + "\t\t\t\t";
	protected final String TEXT_30 = " viewer = ((";
	protected final String TEXT_31 = ") activeEditorPart)" + NL + "\t\t\t\t\t\t.getViewer();" + NL
			+ "\t\t\t\tif (viewer != null) {" + NL + "\t\t\t\t\tviewer.refresh();" + NL + "\t\t\t\t}" + NL + "\t\t\t}"
			+ NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\tprivate final class ShowPropertiesViewAction extends ";
	protected final String TEXT_32 = " {" + NL + "\t\tprivate ShowPropertiesViewAction() {" + NL + "\t\t\tsuper(";
	protected final String TEXT_33 = ".INSTANCE.getString(\"_UI_ShowPropertiesView_menu_item\"));";
	protected final String TEXT_34 = NL + "\t\t}" + NL;
	protected final String TEXT_35 = NL + "\t\t\t@Override";
	protected final String TEXT_36 = NL + "\t\tpublic void run() {" + NL + "\t\t\ttry {" + NL
			+ "\t\t\t\tgetPage().showView(\"org.eclipse.ui.views.PropertySheet\"); ";
	protected final String TEXT_37 = NL + "\t\t\t} catch (";
	protected final String TEXT_38 = " exception) {" + NL + "\t\t\t\t";
	protected final String TEXT_39 = ".INSTANCE.log(exception);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t}" + NL + NL;
	protected final String TEXT_40 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL
			+ "\tpublic static final String copyright = ";
	protected final String TEXT_41 = ";";
	protected final String TEXT_42 = NL;
	protected final String TEXT_43 = NL + "\t/**" + NL + "\t * ExtendedLoadResourceAction." + NL
			+ "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */"
			+ NL + "\tpublic static class ExtendedLoadResourceAction extends ";
	protected final String TEXT_44 = " {" + NL + "\t\t/**" + NL + "\t \t * <!-- begin-user-doc -->" + NL
			+ "\t \t * <!-- end-user-doc -->" + NL + "\t \t * @generated" + NL + "\t \t */\t";
	protected final String TEXT_45 = NL + "\t\t@Override";
	protected final String TEXT_46 = NL + "\t\tpublic void run() {" + NL
			+ "\t\t\tExtendedLoadResourceDialog loadResourceDialog = new ExtendedLoadResourceDialog(" + NL + "\t\t\t\t";
	protected final String TEXT_47 = ".getWorkbench().getActiveWorkbenchWindow().getShell(), domain" + NL
			+ "\t\t\t);    " + NL + "\t\t\tloadResourceDialog.open();" + NL + "\t\t} " + NL + "\t\t   " + NL + "\t\t/**"
			+ NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t \t * <!-- end-user-doc -->" + NL + "\t \t * @generated"
			+ NL + "\t \t */    " + NL + "\t\tpublic static class ExtendedLoadResourceDialog extends ";
	protected final String TEXT_48 = " {" + NL + "\t\t\t/**" + NL + "\t \t\t * <!-- begin-user-doc -->" + NL
			+ "\t \t\t * <!-- end-user-doc -->" + NL + "\t \t\t * @generated" + NL + "\t \t\t */\t\t\t\t" + NL
			+ "\t\t\tpublic ExtendedLoadResourceDialog(";
	protected final String TEXT_49 = " parent, EditingDomain domain) {" + NL + "\t\t\t\tsuper(parent, domain);" + NL
			+ "\t\t\t}" + NL + "\t\t\t" + NL + "\t\t\t/**" + NL + "\t \t\t * <!-- begin-user-doc -->" + NL
			+ "\t \t\t * <!-- end-user-doc -->" + NL + "\t \t\t * @generated" + NL + "\t \t\t */";
	protected final String TEXT_50 = NL + "\t\t\t@Override";
	protected final String TEXT_51 = "      \t\t      \t\t" + NL
			+ "\t\t\tprotected boolean processResource(Resource resource)" + NL + "\t\t    {" + NL + "\t\t    \t";
	protected final String TEXT_52 = " resourceSet = domain.getResourceSet();" + NL + "\t\t\t\t";
	protected final String TEXT_53 = ".add(resourceSet, resourceSet.getResources().get(0).getURI(), resource.getURI());"
			+ NL + "\t\t      return true;" + NL + "\t\t    }" + NL + "\t\t}" + NL + "    " + NL + "\t\t/**" + NL
			+ "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL
			+ "\t\t */    " + NL + "\t\tpublic static class RegisteredPackageDialog extends ";
	protected final String TEXT_54 = " {" + NL + "\t\t\t/**" + NL + "\t \t\t * <!-- begin-user-doc -->" + NL
			+ "\t \t\t * <!-- end-user-doc -->" + NL + "\t \t\t * @generated" + NL + "\t \t\t */\t\t\t\t\t\t\t\t" + NL
			+ "\t\t\tpublic RegisteredPackageDialog(Shell parent) {" + NL + "\t\t\t\tsuper(" + NL + "\t\t\t\t\tparent, "
			+ NL + "\t\t\t\t\tnew ";
	protected final String TEXT_55 = "() {" + NL + "\t\t\t\t\t\t@Override" + NL + "\t\t\t\t\t\tpublic ";
	protected final String TEXT_56 = " getImage(Object element) {" + NL + "\t\t\t\t\t\t\treturn ";
	protected final String TEXT_57 = ".getInstance().getImage(";
	protected final String TEXT_58 = ".INSTANCE.getImage(\"full/obj16/EPackage\"));";
	protected final String TEXT_59 = NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t);        " + NL
			+ "\t\t\t\tsetMultipleSelection(true);" + NL + "\t\t\t\tsetMessage(";
	protected final String TEXT_60 = ".INSTANCE.getString(\"_UI_SelectRegisteredPackageURI\"));";
	protected final String TEXT_61 = NL + "\t\t\t\tsetFilter(\"*\");" + NL + "\t\t\t\t";
	protected final String TEXT_62 = "<String, ";
	protected final String TEXT_63 = "> ePackageNsURItoGenModelLocationMap = ";
	protected final String TEXT_64 = ".getEPackageNsURIToGenModelLocationMap();" + NL
			+ "\t\t\t\tObject [] result = ePackageNsURItoGenModelLocationMap.keySet().toArray(new Object[ePackageNsURItoGenModelLocationMap.size()]);"
			+ NL + "\t\t\t\t";
	protected final String TEXT_65 = ".sort(result);" + NL + "\t\t\t\tsetElements(result);" + NL
			+ "\t\t\t\tsetTitle(EcoreEditorPlugin.INSTANCE.getString(\"_UI_PackageSelection_label\"));";
	protected final String TEXT_66 = NL + "\t\t\t}" + NL + "\t\t}" + NL + "    " + NL + "\t}" + NL;
	protected final String TEXT_67 = NL + "\t/**" + NL + "\t * Action to create objects from the ";
	protected final String TEXT_68 = " model." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->"
			+ NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static class NewAction extends ";
	protected final String TEXT_69 = NL + "\t{" + NL + "\t\t/**" + NL
			+ "\t\t * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)" + NL
			+ "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL
			+ "\t\t */" + NL + "\t\tpublic void run(";
	protected final String TEXT_70 = " action)" + NL + "\t\t{" + NL + "\t\t\t";
	protected final String TEXT_71 = " wizard = new ";
	protected final String TEXT_72 = "();" + NL + "\t\t\twizard.init(getWindow().getWorkbench(), ";
	protected final String TEXT_73 = ".EMPTY);" + NL + "\t\t\t";
	protected final String TEXT_74 = " wizardDialog = new ";
	protected final String TEXT_75 = "(getWindow().getShell(), wizard);" + NL + "\t\t\twizardDialog.open();" + NL
			+ "\t\t}" + NL + "\t}" + NL;
	protected final String TEXT_76 = NL + "\t/**" + NL + "\t * This keeps track of the active editor." + NL
			+ "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */"
			+ NL + "\tprotected ";
	protected final String TEXT_77 = " activeEditorPart;" + NL + "" + NL + "\t/**" + NL
			+ "\t * This keeps track of the current selection provider." + NL + "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
	protected final String TEXT_78 = " selectionProvider;" + NL + "" + NL + "\t/**" + NL
			+ "\t * This action opens the Properties view." + NL + "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
	protected final String TEXT_79 = " showPropertiesViewAction = new ShowPropertiesViewAction();" + NL + "\t" + NL
			+ "\t/**" + NL + "\t * This action refreshes the viewer of the current editor if the editor" + NL
			+ "\t * implements {@link org.eclipse.emf.common.ui.viewer.IViewerProvider}." + NL
			+ "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */"
			+ NL + "\tprotected ";
	protected final String TEXT_80 = " refreshViewerAction = new RefreshViewerAction();" + NL + "\t" + NL + "\t/**" + NL
			+ "\t * This action load resource from resourcereuse/emfscheme" + NL + "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
	protected final String TEXT_81 = " schemeLoadResourceAction = new SchemeLoadResourceAction();" + NL + "\t";
	protected final String TEXT_82 = NL + "\t/**" + NL
			+ "\t * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateChildAction} corresponding to each descriptor"
			+ NL + "\t * generated for the current selection by the item provider." + NL
			+ "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */"
			+ NL + "\tprotected ";
	protected final String TEXT_83 = " createChildActions;" + NL;
	protected final String TEXT_84 = NL + "\t/**" + NL
			+ "\t * This will contain a map of {@link org.eclipse.emf.edit.ui.action.CreateChildAction}s, keyed by sub-menu text."
			+ NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */" + NL + "\tprotected ";
	protected final String TEXT_85 = " createChildSubmenuActions;" + NL;
	protected final String TEXT_86 = NL + "\t/**" + NL
			+ "\t * This is the menu manager into which menu contribution items should be added for CreateChild actions."
			+ NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */" + NL + "\tprotected ";
	protected final String TEXT_87 = " createChildMenuManager;" + NL + "" + NL + "\t/**" + NL
			+ "\t * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} corresponding to each descriptor"
			+ NL + "\t * generated for the current selection by the item provider." + NL
			+ "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */"
			+ NL + "\tprotected ";
	protected final String TEXT_88 = " createSiblingActions;" + NL;
	protected final String TEXT_89 = NL + "\t/**" + NL
			+ "\t * This will contain a map of {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction}s, keyed by submenu text."
			+ NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */" + NL + "\tprotected ";
	protected final String TEXT_90 = " createSiblingSubmenuActions;" + NL;
	protected final String TEXT_91 = NL + "\t/**" + NL
			+ "\t * This is the menu manager into which menu contribution items should be added for CreateSibling actions."
			+ NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */" + NL + "\tprotected ";
	protected final String TEXT_92 = " createSiblingMenuManager;" + NL;
	protected final String TEXT_93 = "\t" + NL + "\t/**" + NL
			+ "\t * This will contain a collection {@link org.polarsys.kitalpha.emde.ui.actions.EmdeViewerFilterAction} applicable"
			+ NL + "\t * to the current loaded Resource." + NL + "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
	protected final String TEXT_94 = "<";
	protected final String TEXT_95 = "> currentResourceEmdeViewerFilterActions;\t" + NL + "\t" + NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */    " + NL + "\tprotected ";
	protected final String TEXT_96 = " extensionViewerFilterMenuManager;\t" + NL + "  " + NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */    " + NL + "\tprotected ";
	protected final String TEXT_97 = " currentResource;" + NL + "\t";
	protected final String TEXT_98 = NL + "\t/**" + NL + "\t * This creates an instance of the contributor." + NL
			+ "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */"
			+ NL + "\tpublic ";
	protected final String TEXT_99 = "()" + NL + "\t{" + NL + "\t\tsuper(ADDITIONS_LAST_STYLE);" + NL
			+ "\t\tloadResourceAction = new ExtendedLoadResourceAction();" + NL + "\t\tvalidateAction = new ";
	protected final String TEXT_100 = "();" + NL + "\t\tcontrolAction = new ";
	protected final String TEXT_101 = "();" + NL + "\t}" + NL;
	protected final String TEXT_102 = "\t" + NL + "\t/**" + NL
			+ "\t * @see org.eclipse.jface.util.IPropertyChangeListener#propertyChange(org.eclipse.jface.util.PropertyChangeEvent) "
			+ NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */\t" + NL + "\tpublic void propertyChange(";
	protected final String TEXT_103 = " event) {" + NL + "\t\tif (event.getSource() instanceof ";
	protected final String TEXT_104 = ") {" + NL + "\t\t\t// Fake a selection changed event to update the menus." + NL
			+ "\t\t\tif (selectionProvider.getSelection() != null) {" + NL
			+ "\t\t\t\tselectionChanged(new SelectionChangedEvent(selectionProvider, selectionProvider.getSelection()));"
			+ NL + "\t\t\t}\t    " + NL + "\t\t}\t  " + NL + "\t}\t" + NL + " ";
	protected final String TEXT_105 = NL + "\t/**" + NL
			+ "\t * This adds Separators for editor additions to the tool bar." + NL + "\t * <!-- begin-user-doc -->"
			+ NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
	protected final String TEXT_106 = NL + "\t@Override";
	protected final String TEXT_107 = NL + "\tpublic void contributeToToolBar(";
	protected final String TEXT_108 = " toolBarManager)" + NL + "\t{" + NL + "\t\ttoolBarManager.add(new ";
	protected final String TEXT_109 = "(\"";
	protected final String TEXT_110 = "-settings\"));";
	protected final String TEXT_111 = NL + "\t\ttoolBarManager.add(new ";
	protected final String TEXT_112 = "(\"";
	protected final String TEXT_113 = "-additions\"));";
	protected final String TEXT_114 = NL + "\t}" + NL + "" + NL + "\t/**" + NL
			+ "\t * This adds to the menu bar a menu and some separators for editor additions," + NL
			+ "\t * as well as the sub-menus for object creation items." + NL + "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
	protected final String TEXT_115 = NL + "\t@Override";
	protected final String TEXT_116 = NL + "\tpublic void contributeToMenu(";
	protected final String TEXT_117 = " menuManager)" + NL + "\t{" + NL + "\t\tsuper.contributeToMenu(menuManager);"
			+ NL + "" + NL + "\t\t";
	protected final String TEXT_118 = " submenuManager = new ";
	protected final String TEXT_119 = "(";
	protected final String TEXT_120 = ".INSTANCE.getString(\"_UI_";
	protected final String TEXT_121 = "_menu\"), \"";
	protected final String TEXT_122 = "MenuID\");";
	protected final String TEXT_123 = NL + "\t\tmenuManager.insertAfter(\"additions\", submenuManager);";
	protected final String TEXT_124 = NL + "\t\tsubmenuManager.add(new ";
	protected final String TEXT_125 = "(\"settings\"));";
	protected final String TEXT_126 = NL + "\t\tsubmenuManager.add(new ";
	protected final String TEXT_127 = "(\"actions\"));";
	protected final String TEXT_128 = NL + "\t\tsubmenuManager.add(new ";
	protected final String TEXT_129 = "(\"additions\"));";
	protected final String TEXT_130 = NL + "\t\tsubmenuManager.add(new ";
	protected final String TEXT_131 = "(\"additions-end\"));";
	protected final String TEXT_132 = NL + "\t\t";
	protected final String TEXT_133 = NL + "\t\t// Prepare Model Extension Menu Manager" + NL
			+ "\t\textensionViewerFilterMenuManager = new MenuManager(";
	protected final String TEXT_134 = "._UI_Model_Extensions);" + NL
			+ "\t\tsubmenuManager.insertBefore(\"additions-end\", extensionViewerFilterMenuManager);";
	protected final String TEXT_135 = NL + "\t\tsubmenuManager.insertBefore(\"additions-end\", new ";
	protected final String TEXT_136 = "());";
	protected final String TEXT_137 = NL + "\t\t    ";
	protected final String TEXT_138 = "\t\t";
	protected final String TEXT_139 = NL + "\t\t// Prepare for CreateChild item addition or removal." + NL + "\t\t//"
			+ NL + "\t\tcreateChildMenuManager = new ";
	protected final String TEXT_140 = "(";
	protected final String TEXT_141 = ".INSTANCE.getString(\"_UI_CreateChild_menu_item\"));";
	protected final String TEXT_142 = NL + "\t\tsubmenuManager.insertBefore(\"additions\", createChildMenuManager);";
	protected final String TEXT_143 = NL + NL + "\t\t// Prepare for CreateSibling item addition or removal." + NL
			+ "\t\t//" + NL + "\t\tcreateSiblingMenuManager = new ";
	protected final String TEXT_144 = "(";
	protected final String TEXT_145 = ".INSTANCE.getString(\"_UI_CreateSibling_menu_item\"));";
	protected final String TEXT_146 = NL + "\t\tsubmenuManager.insertBefore(\"additions\", createSiblingMenuManager);";
	protected final String TEXT_147 = NL + NL + "\t\t// Force an update because Eclipse hides empty menus now." + NL
			+ "\t\t//" + NL + "\t\tsubmenuManager.addMenuListener" + NL + "\t\t\t(new ";
	protected final String TEXT_148 = "()" + NL + "\t\t\t {" + NL + "\t\t\t\t public void menuAboutToShow(";
	protected final String TEXT_149 = " menuManager)" + NL + "\t\t\t\t {" + NL
			+ "\t\t\t\t\t menuManager.updateAll(true);" + NL + "\t\t\t\t }" + NL + "\t\t\t });" + NL;
	protected final String TEXT_150 = NL + "\t\t// Add your contributions." + NL
			+ "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL;
	protected final String TEXT_151 = NL + "\t\taddGlobalActions(submenuManager);" + NL + "\t}" + NL + "" + NL + "\t/**"
			+ NL
			+ "\t * When the active editor changes, this remembers the change and registers with it as a selection provider."
			+ NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */";
	protected final String TEXT_152 = NL + "\t@Override";
	protected final String TEXT_153 = NL + "\tpublic void setActiveEditor(";
	protected final String TEXT_154 = " part)" + NL + "\t{" + NL + "\t\tsuper.setActiveEditor(part);" + NL
			+ "\t\tactiveEditorPart = part;" + NL;
	protected final String TEXT_155 = NL + NL + "\t\tif (part instanceof ";
	protected final String TEXT_156 = " == false) {" + NL
			+ "\t\t\tif (currentResourceEmdeViewerFilterActions != null) {" + NL + "\t\t\t\tfor (";
	protected final String TEXT_157 = " filterAction : currentResourceEmdeViewerFilterActions) {      " + NL
			+ "\t\t\t\t\tfilterAction.setEnabled(false);" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t}";
	protected final String TEXT_158 = NL + NL + "\t\t// Switch to the new selection provider." + NL + "\t\t//" + NL
			+ "\t\tif (selectionProvider != null)" + NL + "\t\t{" + NL
			+ "\t\t\tselectionProvider.removeSelectionChangedListener(this);" + NL + "\t\t}" + NL
			+ "\t\tif (part == null)" + NL + "\t\t{" + NL + "\t\t\tselectionProvider = null;" + NL + "\t\t}" + NL
			+ "\t\telse" + NL + "\t\t{" + NL + "\t\t\tselectionProvider = part.getSite().getSelectionProvider();" + NL
			+ "\t\t\tselectionProvider.addSelectionChangedListener(this);" + NL + "" + NL
			+ "\t\t\t// Fake a selection changed event to update the menus." + NL + "\t\t\t//" + NL
			+ "\t\t\tif (selectionProvider.getSelection() != null)" + NL + "\t\t\t{" + NL
			+ "\t\t\t\tselectionChanged(new ";
	protected final String TEXT_159 = "(selectionProvider, selectionProvider.getSelection()));" + NL + "\t\t\t}" + NL
			+ "\t\t}" + NL + "\t}";
	protected final String TEXT_160 = NL + NL + "\t/**" + NL
			+ "\t * @see org.eclipse.ui.part.EditorActionBarContributor#dispose()" + NL + "\t * @generated" + NL
			+ "\t */";
	protected final String TEXT_161 = NL + "\t@Override";
	protected final String TEXT_162 = NL + "\tpublic void dispose() {" + NL + "\t\tsuper.dispose();";
	protected final String TEXT_163 = NL + "\t\tif (currentResourceEmdeViewerFilterActions != null) {" + NL
			+ "\t\t\tcurrentResourceEmdeViewerFilterActions.clear();" + NL
			+ "\t\t\tcurrentResourceEmdeViewerFilterActions = null;" + NL + "\t\t}" + NL
			+ "\t\tif (extensionViewerFilterMenuManager != null) {" + NL
			+ "\t\t\textensionViewerFilterMenuManager.dispose();" + NL
			+ "\t\t\textensionViewerFilterMenuManager = null;" + NL + "\t\t}";
	protected final String TEXT_164 = NL + "\t}\t";
	protected final String TEXT_165 = NL + NL + "\t/**" + NL
			+ "\t * This implements {@link org.eclipse.jface.viewers.ISelectionChangedListener}," + NL
			+ "\t * handling {@link org.eclipse.jface.viewers.SelectionChangedEvent}s by querying for the children and siblings"
			+ NL + "\t * that can be added to the selected object and updating the menus accordingly." + NL
			+ "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */"
			+ NL + "\tpublic void selectionChanged(";
	protected final String TEXT_166 = " event)" + NL + "\t{" + NL + "\t\t// Current Selection" + NL + "\t\t";
	protected final String TEXT_167 = " selection = event.getSelection();" + NL + "\t\tObject selectedObject = null;"
			+ NL + "\t\tif (selection instanceof ";
	protected final String TEXT_168 = " && ((IStructuredSelection) selection).size() == 1) {" + NL
			+ "\t\t\tselectedObject = ((";
	protected final String TEXT_169 = ") selection).getFirstElement();" + NL + "\t\t}" + NL + "\t\t\t";
	protected final String TEXT_170 = NL + "\t\t";
	protected final String TEXT_171 = " resource = null;" + NL + "\t\tif (selectedObject instanceof ";
	protected final String TEXT_172 = ") {" + NL + "\t\t\tresource = ((";
	protected final String TEXT_173 = ") selectedObject).eResource();" + NL
			+ "\t\t} else if (selectedObject instanceof ";
	protected final String TEXT_174 = ") {" + NL + "\t\t\tresource = (";
	protected final String TEXT_175 = ") selectedObject;" + NL + "\t\t}" + NL + "\t\tif (resource != null) {" + NL
			+ "\t\t\tif (resource.equals(currentResource) == false) {" + NL + "\t\t\t\tif (currentResource != null) {"
			+ NL + "\t\t\t\t\tif (extensionViewerFilterMenuManager != null) {" + NL
			+ "\t\t\t\t\t\tdepopulateManager(extensionViewerFilterMenuManager, currentResourceEmdeViewerFilterActions);"
			+ NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\tcurrentResourceEmdeViewerFilterActions = null;" + NL + "\t\t\t\t}"
			+ NL + "\t\t\t\tcurrentResource = resource;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "    ";
	protected final String TEXT_176 = "\t\t";
	protected final String TEXT_177 = NL + "\t\t// Remove any menu items for old selection." + NL + "\t\t//" + NL
			+ "\t\tif (createChildMenuManager != null)" + NL + "\t\t{";
	protected final String TEXT_178 = NL
			+ "\t\t\tdepopulateManager(createChildMenuManager, createChildSubmenuActions);";
	protected final String TEXT_179 = NL + "\t\t\tdepopulateManager(createChildMenuManager, createChildActions);" + NL
			+ "\t\t}" + NL + "\t\tif (createSiblingMenuManager != null)" + NL + "\t\t{";
	protected final String TEXT_180 = NL
			+ "\t\t\tdepopulateManager(createSiblingMenuManager, createSiblingSubmenuActions);";
	protected final String TEXT_181 = NL + "\t\t\tdepopulateManager(createSiblingMenuManager, createSiblingActions);"
			+ NL + "\t\t}";
	protected final String TEXT_182 = NL + NL + "\t\t// Populate EmdeViewerFilterActions if necessary" + NL
			+ "\t\tif (currentResourceEmdeViewerFilterActions == null) {" + NL
			+ "\t\t\tcurrentResourceEmdeViewerFilterActions = ((";
	protected final String TEXT_183 = ") activeEditorPart).getEmdeViewerFilterActions(currentResource);" + NL
			+ "\t\t\tif (extensionViewerFilterMenuManager != null) {" + NL
			+ "\t\t\t\tpopulateManager(extensionViewerFilterMenuManager, currentResourceEmdeViewerFilterActions, null);"
			+ NL + "\t\t\t\textensionViewerFilterMenuManager.update(true);" + NL + "\t\t\t}\t\t  " + NL + "\t\t}";
	protected final String TEXT_184 = "\t\t" + NL + "" + NL
			+ "\t\t// Query the new selection for appropriate new child/sibling descriptors" + NL + "\t\t//" + NL
			+ "\t\t";
	protected final String TEXT_185 = " newChildDescriptors = null;" + NL + "\t\t";
	protected final String TEXT_186 = " newSiblingDescriptors = null;" + NL + "" + NL
			+ "\t\tif (selectedObject != null)" + NL + "\t\t{" + NL + "\t\t\t";
	protected final String TEXT_187 = " domain = ((";
	protected final String TEXT_188 = ")activeEditorPart).getEditingDomain();" + NL + "" + NL
			+ "\t\t\tnewChildDescriptors = domain.getNewChildDescriptors(selectedObject, null);" + NL
			+ "\t\t\tnewSiblingDescriptors = domain.getNewChildDescriptors(null, selectedObject);" + NL + "\t\t}" + NL
			+ "" + NL + "\t\t// Generate actions for selection; populate and redraw the menus." + NL + "\t\t//" + NL
			+ "\t\tcreateChildActions = generateCreateChildActions(newChildDescriptors, selection);";
	protected final String TEXT_189 = NL + "\t\tcreateChildSubmenuActions = extractSubmenuActions(createChildActions);";
	protected final String TEXT_190 = NL
			+ "\t\tcreateSiblingActions = generateCreateSiblingActions(newSiblingDescriptors, selection);";
	protected final String TEXT_191 = NL
			+ "\t\tcreateSiblingSubmenuActions = extractSubmenuActions(createSiblingActions);";
	protected final String TEXT_192 = NL + NL + "\t\tif (createChildMenuManager != null)" + NL + "\t\t{";
	protected final String TEXT_193 = NL
			+ "\t\t\tpopulateManager(createChildMenuManager, createChildSubmenuActions, null);";
	protected final String TEXT_194 = NL + "\t\t\tpopulateManager(createChildMenuManager, createChildActions, null);"
			+ NL + "\t\t\tcreateChildMenuManager.update(true);" + NL + "\t\t}" + NL
			+ "\t\tif (createSiblingMenuManager != null)" + NL + "\t\t{";
	protected final String TEXT_195 = NL
			+ "\t\t\tpopulateManager(createSiblingMenuManager, createSiblingSubmenuActions, null);";
	protected final String TEXT_196 = NL
			+ "\t\t\tpopulateManager(createSiblingMenuManager, createSiblingActions, null);" + NL
			+ "\t\t\tcreateSiblingMenuManager.update(true);" + NL + "\t\t}";
	protected final String TEXT_197 = NL + "\t\t// Add your contributions." + NL
			+ "\t\t// Ensure that you remove @generated or mark it @generated NOT";
	protected final String TEXT_198 = NL + "\t}" + NL;
	protected final String TEXT_199 = NL + "\t/**" + NL
			+ "\t * This generates a {@link org.eclipse.emf.edit.ui.action.CreateChildAction} for each object in <code>descriptors</code>,"
			+ NL + "\t * and returns the collection of these actions." + NL + "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
	protected final String TEXT_200 = " generateCreateChildActions(";
	protected final String TEXT_201 = " descriptors, ";
	protected final String TEXT_202 = " selection)" + NL + "\t{" + NL + "\t\t";
	protected final String TEXT_203 = " actions = new ";
	protected final String TEXT_204 = "();" + NL + "\t\tif (descriptors != null)" + NL + "\t\t{";
	protected final String TEXT_205 = NL + "\t\t\tfor (";
	protected final String TEXT_206 = " descriptor : descriptors)";
	protected final String TEXT_207 = NL + "\t\t\tfor (";
	protected final String TEXT_208 = " i = descriptors.iterator(); i.hasNext(); )";
	protected final String TEXT_209 = NL + "\t\t\t{" + NL + "\t\t\t\tactions.add(new ";
	protected final String TEXT_210 = "(activeEditorPart, selection, ";
	protected final String TEXT_211 = "descriptor";
	protected final String TEXT_212 = "i.next()";
	protected final String TEXT_213 = "));" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn actions;" + NL + "\t}"
			+ NL + "" + NL + "\t/**" + NL
			+ "\t * This generates a {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} for each object in <code>descriptors</code>,"
			+ NL + "\t * and returns the collection of these actions." + NL + "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
	protected final String TEXT_214 = " generateCreateSiblingActions(";
	protected final String TEXT_215 = " descriptors, ";
	protected final String TEXT_216 = " selection)" + NL + "\t{" + NL + "\t\t";
	protected final String TEXT_217 = " actions = new ";
	protected final String TEXT_218 = "();" + NL + "\t\tif (descriptors != null)" + NL + "\t\t{";
	protected final String TEXT_219 = NL + "\t\t\tfor (";
	protected final String TEXT_220 = " descriptor : descriptors)";
	protected final String TEXT_221 = NL + "\t\t\tfor (";
	protected final String TEXT_222 = " i = descriptors.iterator(); i.hasNext(); )";
	protected final String TEXT_223 = NL + "\t\t\t{" + NL + "\t\t\t\tactions.add(new ";
	protected final String TEXT_224 = "(activeEditorPart, selection, ";
	protected final String TEXT_225 = "descriptor";
	protected final String TEXT_226 = "i.next()";
	protected final String TEXT_227 = "));" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn actions;" + NL + "\t}"
			+ NL + "" + NL + "\t/**" + NL
			+ "\t * This populates the specified <code>manager</code> with {@link org.eclipse.jface.action.ActionContributionItem}s"
			+ NL
			+ "\t * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection,"
			+ NL + "\t * by inserting them before the specified contribution item <code>contributionID</code>." + NL
			+ "\t * If <code>contributionID</code> is <code>null</code>, they are simply added." + NL
			+ "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */"
			+ NL + "\tprotected void populateManager(";
	protected final String TEXT_228 = " manager, ";
	protected final String TEXT_229 = " actions, String contributionID)" + NL + "\t{" + NL + "\t\tif (actions != null)"
			+ NL + "\t\t{";
	protected final String TEXT_230 = NL + "\t\t\tfor (";
	protected final String TEXT_231 = " action : actions)";
	protected final String TEXT_232 = NL + "\t\t\tfor (";
	protected final String TEXT_233 = " i = actions.iterator(); i.hasNext(); )";
	protected final String TEXT_234 = NL + "\t\t\t{";
	protected final String TEXT_235 = NL + "\t\t\t\t";
	protected final String TEXT_236 = " action = (IAction)i.next();";
	protected final String TEXT_237 = NL + "\t\t\t\tif (contributionID != null)" + NL + "\t\t\t\t{" + NL
			+ "\t\t\t\t\tmanager.insertBefore(contributionID, action);" + NL + "\t\t\t\t}" + NL + "\t\t\t\telse" + NL
			+ "\t\t\t\t{" + NL + "\t\t\t\t\tmanager.add(action);" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t}"
			+ NL + "\t}" + NL + "\t\t" + NL + "\t/**" + NL
			+ "\t * This removes from the specified <code>manager</code> all {@link org.eclipse.jface.action.ActionContributionItem}s"
			+ NL
			+ "\t * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection."
			+ NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */" + NL + "\tprotected void depopulateManager(";
	protected final String TEXT_238 = " manager, ";
	protected final String TEXT_239 = " actions)" + NL + "\t{" + NL + "\t\tif (actions != null)" + NL + "\t\t{" + NL
			+ "\t\t\t";
	protected final String TEXT_240 = "[] items = manager.getItems();" + NL
			+ "\t\t\tfor (int i = 0; i < items.length; i++)" + NL + "\t\t\t{" + NL
			+ "\t\t\t\t// Look into SubContributionItems" + NL + "\t\t\t\t//" + NL + "\t\t\t\t";
	protected final String TEXT_241 = " contributionItem = items[i];" + NL
			+ "\t\t\t\twhile (contributionItem instanceof ";
	protected final String TEXT_242 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tcontributionItem = ((";
	protected final String TEXT_243 = ")contributionItem).getInnerItem();" + NL + "\t\t\t\t}" + NL + "" + NL
			+ "\t\t\t\t// Delete the ActionContributionItems with matching action." + NL + "\t\t\t\t//" + NL
			+ "\t\t\t\tif (contributionItem instanceof ";
	protected final String TEXT_244 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
	protected final String TEXT_245 = " action = ((";
	protected final String TEXT_246 = ")contributionItem).getAction();" + NL + "\t\t\t\t\tif (actions.contains(action))"
			+ NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\tmanager.remove(contributionItem);" + NL + "\t\t\t\t\t}" + NL
			+ "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t}" + NL;
	protected final String TEXT_247 = NL + "\t/**" + NL
			+ "\t * This extracts those actions in the <code>submenuActions</code> collection whose text is qualified and returns"
			+ NL + "\t * a map of these actions, keyed by submenu text." + NL + "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
	protected final String TEXT_248 = " extractSubmenuActions(";
	protected final String TEXT_249 = " createActions)" + NL + "\t{" + NL + "\t\t";
	protected final String TEXT_250 = " createSubmenuActions = new ";
	protected final String TEXT_251 = "();" + NL + "\t\tif (createActions != null)" + NL + "\t\t{" + NL + "\t\t\tfor (";
	protected final String TEXT_252 = " actions = createActions.iterator(); actions.hasNext(); )" + NL + "\t\t\t{" + NL
			+ "\t\t\t\t";
	protected final String TEXT_253 = " action = ";
	protected final String TEXT_254 = "(";
	protected final String TEXT_255 = ")";
	protected final String TEXT_256 = "actions.next();" + NL + "\t\t\t\t";
	protected final String TEXT_257 = " st = new ";
	protected final String TEXT_258 = "(action.getText(), \"|\");";
	protected final String TEXT_259 = NL + "\t\t\t\tif (st.countTokens() == 2)" + NL + "\t\t\t\t{" + NL
			+ "\t\t\t\t\tString text = st.nextToken().trim();" + NL + "\t\t\t\t\t";
	protected final String TEXT_260 = " submenuActions = ";
	protected final String TEXT_261 = "(";
	protected final String TEXT_262 = ")";
	protected final String TEXT_263 = "createSubmenuActions.get(text);" + NL + "\t\t\t\t\tif (submenuActions == null)"
			+ NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\tcreateSubmenuActions.put(text, submenuActions = new ";
	protected final String TEXT_264 = "());" + NL + "\t\t\t\t\t}" + NL
			+ "\t\t\t\t\taction.setText(st.nextToken().trim());" + NL + "\t\t\t\t\tsubmenuActions.add(action);" + NL
			+ "\t\t\t\t\tactions.remove();" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t}" + NL
			+ "\t\treturn createSubmenuActions;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL
			+ "\t * This populates the specified <code>manager</code> with {@link org.eclipse.jface.action.MenuManager}s containing"
			+ NL
			+ "\t * {@link org.eclipse.jface.action.ActionContributionItem}s based on the {@link org.eclipse.jface.action.IAction}s"
			+ NL
			+ "\t * contained in the <code>submenuActions</code> collection, by inserting them before the specified contribution"
			+ NL + "\t * item <code>contributionID</code>." + NL
			+ "\t * If <code>contributionID</code> is <code>null</code>, they are simply added." + NL
			+ "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */"
			+ NL + "\tprotected void populateManager(";
	protected final String TEXT_265 = " manager, ";
	protected final String TEXT_266 = " submenuActions, String contributionID)" + NL + "\t{" + NL
			+ "\t\tif (submenuActions != null)" + NL + "\t\t{";
	protected final String TEXT_267 = NL + "\t\t\tfor (";
	protected final String TEXT_268 = " entry : submenuActions.entrySet())" + NL + "\t\t\t{";
	protected final String TEXT_269 = NL + "\t\t\tfor (";
	protected final String TEXT_270 = " entries = submenuActions.entrySet().iterator(); entries.hasNext();)" + NL
			+ "\t\t\t{" + NL + "\t\t\t\t";
	protected final String TEXT_271 = " entry = (";
	protected final String TEXT_272 = ")entries.next();";
	protected final String TEXT_273 = NL + "\t\t\t\t";
	protected final String TEXT_274 = " submenuManager = new ";
	protected final String TEXT_275 = "(";
	protected final String TEXT_276 = "(String)";
	protected final String TEXT_277 = "entry.getKey());" + NL + "\t\t\t\tif (contributionID != null)" + NL + "\t\t\t\t{"
			+ NL + "\t\t\t\t\tmanager.insertBefore(contributionID, submenuManager);" + NL + "\t\t\t\t}" + NL
			+ "\t\t\t\telse" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tmanager.add(submenuManager);" + NL + "\t\t\t\t}" + NL
			+ "\t\t\t\tpopulateManager(submenuManager, ";
	protected final String TEXT_278 = "(";
	protected final String TEXT_279 = ")";
	protected final String TEXT_280 = "entry.getValue(), null);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t}" + NL + ""
			+ NL + "\t/**" + NL
			+ "\t * This removes from the specified <code>manager</code> all {@link org.eclipse.jface.action.MenuManager}s and their"
			+ NL
			+ "\t * {@link org.eclipse.jface.action.ActionContributionItem}s based on the {@link org.eclipse.jface.action.IAction}s"
			+ NL + "\t * contained in the <code>submenuActions</code> map." + NL + "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL
			+ "\tprotected void depopulateManager(";
	protected final String TEXT_281 = " manager, ";
	protected final String TEXT_282 = " submenuActions)" + NL + "\t{" + NL + "\t\tif (submenuActions != null)" + NL
			+ "\t\t{" + NL + "\t\t\t";
	protected final String TEXT_283 = "[] items = manager.getItems();" + NL
			+ "\t\t\tfor (int i = 0; i < items.length; i++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
	protected final String TEXT_284 = " contributionItem = items[i];" + NL + "\t\t\t\tif (contributionItem instanceof ";
	protected final String TEXT_285 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
	protected final String TEXT_286 = " submenuManager = (";
	protected final String TEXT_287 = ")contributionItem;" + NL
			+ "\t\t\t\t\tif (submenuActions.containsKey(submenuManager.getMenuText()))" + NL + "\t\t\t\t\t{" + NL
			+ "\t\t\t\t\t\tdepopulateManager(submenuManager, ";
	protected final String TEXT_288 = "(";
	protected final String TEXT_289 = ")";
	protected final String TEXT_290 = "submenuActions.get(contributionItem));" + NL
			+ "\t\t\t\t\t\tmanager.remove(contributionItem);" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t}"
			+ NL + "\t\t}" + NL + "\t}" + NL;
	protected final String TEXT_291 = NL + "\t/**" + NL + "\t * This populates the pop-up menu before it appears." + NL
			+ "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */";
	protected final String TEXT_292 = NL + "\t@Override";
	protected final String TEXT_293 = NL + "\tpublic void menuAboutToShow(";
	protected final String TEXT_294 = " menuManager)" + NL + "\t{" + NL + "\t\tsuper.menuAboutToShow(menuManager);";
	protected final String TEXT_295 = NL + "\t\t";
	protected final String TEXT_296 = " submenuManager = null;" + NL + "" + NL + "\t\tsubmenuManager = new ";
	protected final String TEXT_297 = "(";
	protected final String TEXT_298 = ".INSTANCE.getString(\"_UI_CreateChild_menu_item\"));";
	protected final String TEXT_299 = NL + "\t\tpopulateManager(submenuManager, createChildSubmenuActions, null);";
	protected final String TEXT_300 = NL + "\t\tpopulateManager(submenuManager, createChildActions, null);" + NL
			+ "\t\tmenuManager.insertBefore(\"edit\", submenuManager);";
	protected final String TEXT_301 = NL + NL + "\t\tsubmenuManager = new ";
	protected final String TEXT_302 = "(";
	protected final String TEXT_303 = ".INSTANCE.getString(\"_UI_CreateSibling_menu_item\"));";
	protected final String TEXT_304 = NL + "\t\tpopulateManager(submenuManager, createSiblingSubmenuActions, null);";
	protected final String TEXT_305 = NL + "\t\tpopulateManager(submenuManager, createSiblingActions, null);" + NL
			+ "\t\tmenuManager.insertBefore(\"edit\", submenuManager);";
	protected final String TEXT_306 = NL + NL + "\t\t";
	protected final String TEXT_307 = " extensionMenuManager = new ";
	protected final String TEXT_308 = "(";
	protected final String TEXT_309 = "._UI_Model_Extensions);" + NL
			+ "\t\tpopulateManager(extensionMenuManager, currentResourceEmdeViewerFilterActions, null);" + NL
			+ "\t\tmenuManager.insertAfter(\"additions\", extensionMenuManager);";
	protected final String TEXT_310 = "\t\t" + NL + "\t\tmenuManager.insertAfter(\"additions\", new Separator());";
	protected final String TEXT_311 = "    ";
	protected final String TEXT_312 = NL + "\t}" + NL + "" + NL + "\t/**" + NL
			+ "\t * This inserts global actions before the \"additions-end\" separator." + NL
			+ "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */";
	protected final String TEXT_313 = NL + "\t@Override";
	protected final String TEXT_314 = NL + "\tprotected void addGlobalActions(";
	protected final String TEXT_315 = " menuManager)" + NL + "\t{" + NL
			+ "\t\tmenuManager.insertAfter(\"additions-end\", new ";
	protected final String TEXT_316 = "(\"ui-actions\"));";
	protected final String TEXT_317 = NL + "\t\tmenuManager.insertAfter(\"ui-actions\", showPropertiesViewAction);";
	protected final String TEXT_318 = NL + "\t\tmenuManager.insertBefore(\"additions-end\", schemeLoadResourceAction);";
	protected final String TEXT_319 = NL + "\t\tmenuManager.insertAfter(\"ui-actions\", refreshViewerAction);";
	protected final String TEXT_320 = NL + NL + "\t\tsuper.addGlobalActions(menuManager);" + NL + "\t}" + NL + "" + NL
			+ "\t/**" + NL + "\t * This ensures that a delete action will clean up all references to deleted objects."
			+ NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */";
	protected final String TEXT_321 = NL + "\t@Override";
	protected final String TEXT_322 = NL + "\tprotected boolean removeAllReferencesOnDelete()" + NL + "\t{" + NL
			+ "\t\treturn true;" + NL + "\t}" + NL + "" + NL + "}";
	protected final String TEXT_323 = NL;
	protected final String TEXT_324 = NL;

	public ActionBarContributor() {
		//Here is the constructor
		StringBuffer stringBuffer = new StringBuffer();

		// add initialisation of the pattern variables (declaration has been already done).

	}

	public String generate(Object argument) throws Exception {
		final StringBuffer stringBuffer = new StringBuffer();

		InternalPatternContext ctx = (InternalPatternContext) argument;
		Map<String, String> queryCtx = null;
		IQuery.ParameterDescription paramDesc = null;
		Node.Container currentNode = ctx.getNode();

		List<Object> parameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object parameterParameter : parameterList) {

			this.parameter = (org.eclipse.emf.codegen.ecore.genmodel.GenPackage) parameterParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_323);
		stringBuffer.append(TEXT_324);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		super.orchestration(new SuperOrchestrationContext(ictx));

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("parameter", this.parameter);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

	protected void method_doGenerate(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		/**
		 * Copyright (c) 2002-2007 IBM Corporation and others.
		 * All rights reserved.   This program and the accompanying materials
		 * are made available under the terms of the Eclipse Public License v1.0
		 * which accompanies this distribution, and is available at
		 * http://www.eclipse.org/legal/epl-v10.html
		 *
		 * Contributors:
		 *   IBM - Initial API and implementation
		 */

		GenPackage genPackage = (GenPackage) argument;
		GenModel genModel = genPackage.getGenModel();

		String _CollectionOfAnything = null;
		String _CollectionOfIAction = null;
		String _ArrayListOfIAction = null;
		String _CollectionOfExtendsIAction = null;
		String _IteratorOfIAction = null;
		String _MapOfStringToCollectionOfIAction = null;
		String _MapEntryOfStringToCollectionOfIAction = null;
		String _LinkedHashMapOfStringToCollectionOfIAction = null;
		if (genModel.isCreationCommands()) {
			_CollectionOfAnything = genModel.getImportedName("Collection" + (genModel.useGenerics() ? "<?>" : ""));
			_CollectionOfIAction = genModel.getImportedName(genModel.useGenerics()
					? "java.util.Collection<org.eclipse.jface.action.IAction>" : "java.util.Collection");
			_ArrayListOfIAction = genModel.getImportedName(genModel.useGenerics()
					? "java.util.ArrayList<org.eclipse.jface.action.IAction>" : "java.util.ArrayList");
			_CollectionOfExtendsIAction = genModel.getImportedName(genModel.useGenerics()
					? "java.util.Collection<? extends org.eclipse.jface.action.IAction>" : "java.util.Collection");
			if (genModel.isCreationSubmenus()) {
				_IteratorOfIAction = genModel.getImportedName(genModel.useGenerics()
						? "java.util.Iterator<org.eclipse.jface.action.IAction>" : "java.util.Iterator");
				_MapOfStringToCollectionOfIAction = genModel.getImportedName("java.util.Map")
						+ (genModel.useGenerics() ? ("<String, " + _CollectionOfIAction + ">") : "");
				_MapEntryOfStringToCollectionOfIAction = genModel.getImportedName("java.util.Map") + ".Entry"
						+ (genModel.useGenerics() ? ("<String, " + _CollectionOfIAction + ">") : "");
				_LinkedHashMapOfStringToCollectionOfIAction = genModel.getImportedName("java.util.LinkedHashMap")
						+ (genModel.useGenerics() ? ("<String, " + _CollectionOfIAction + ">") : "");
			}
		}

		stringBuffer.append(TEXT_1);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.eclipse.egf.emf.pattern.base/egf/EMF_Pattern_Base.fcore#LogicalName=org.eclipse.egf.emf.pattern.base.HeaderJava" args="parameter:argument"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("argument", parameter);
			CallHelper.executeWithParameterInjection(
					"platform:/plugin/org.eclipse.egf.emf.pattern.base/egf/EMF_Pattern_Base.fcore#_XHLrsCwtEd-jc5T-XaRJlg",
					new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(genPackage.getPresentationPackageName());
		stringBuffer.append(TEXT_3);
		genModel.markImportLocation(stringBuffer);
		stringBuffer.append(TEXT_4);
		stringBuffer.append(genPackage.getPrefix());
		stringBuffer.append(TEXT_5);
		if (genPackage.isExtensibleProviderFactory()) {
			stringBuffer.append(TEXT_6);
		}
		stringBuffer.append(TEXT_7);
		stringBuffer.append(genPackage.getActionBarContributorClassName());
		stringBuffer.append(TEXT_8);
		stringBuffer
				.append(genModel.getImportedName("org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor"));
		stringBuffer.append(TEXT_9);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.viewers.ISelectionChangedListener"));
		if (genPackage.isExtensibleProviderFactory()) {
			stringBuffer.append(TEXT_10);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.util.IPropertyChangeListener"));
		}
		stringBuffer.append(TEXT_11);
		stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.URI"));
		stringBuffer.append(TEXT_12);
		if (genModel.useClassOverrideAnnotation()) {
			stringBuffer.append(TEXT_13);
		}
		stringBuffer.append(TEXT_14);
		stringBuffer.append(
				genModel.getImportedName("org.polarsys.kitalpha.resourcereuse.ui.dialog.ResourceReuseSelectionDialog"));
		stringBuffer.append(TEXT_15);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.window.Window"));
		stringBuffer.append(TEXT_16);
		stringBuffer.append(genModel.getImportedName("org.polarsys.kitalpha.resourcereuse.model.SearchCriteria"));
		stringBuffer.append(TEXT_17);
		stringBuffer.append(
				genModel.getImportedName("org.polarsys.kitalpha.resourcereuse.emfscheme.helpers.ModelReuseHelper"));
		stringBuffer.append(TEXT_18);
		stringBuffer.append(genModel.getImportedName(
				"org.polarsys.kitalpha.resourcereuse.emfscheme.utils.services.ResourceSetLoaderServices"));
		stringBuffer.append(TEXT_19);
		stringBuffer.append(genPackage.getImportedEditorPluginClassName());
		stringBuffer.append(TEXT_20);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.Action"));
		stringBuffer.append(TEXT_21);
		stringBuffer.append(genPackage.getImportedEditorPluginClassName());
		stringBuffer.append(TEXT_22);
		stringBuffer.append(genModel.getNonNLS());
		stringBuffer.append(TEXT_23);
		if (genModel.useClassOverrideAnnotation()) {
			stringBuffer.append(TEXT_24);
		}
		stringBuffer.append(TEXT_25);
		stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.ui.viewer.IViewerProvider"));
		stringBuffer.append(TEXT_26);
		if (genModel.useClassOverrideAnnotation()) {
			stringBuffer.append(TEXT_27);
		}
		stringBuffer.append(TEXT_28);
		stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.ui.viewer.IViewerProvider"));
		stringBuffer.append(TEXT_29);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.viewers.Viewer"));
		stringBuffer.append(TEXT_30);
		stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.ui.viewer.IViewerProvider"));
		stringBuffer.append(TEXT_31);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.Action"));
		stringBuffer.append(TEXT_32);
		stringBuffer.append(genPackage.getImportedEditorPluginClassName());
		stringBuffer.append(TEXT_33);
		stringBuffer.append(genModel.getNonNLS());
		stringBuffer.append(TEXT_34);
		if (genModel.useClassOverrideAnnotation()) {
			stringBuffer.append(TEXT_35);
		}
		stringBuffer.append(TEXT_36);
		stringBuffer.append(genModel.getNonNLS());
		stringBuffer.append(TEXT_37);
		stringBuffer.append(genModel.getImportedName("org.eclipse.ui.PartInitException"));
		stringBuffer.append(TEXT_38);
		stringBuffer.append(genPackage.getImportedEditorPluginClassName());
		stringBuffer.append(TEXT_39);
		if (genModel.hasCopyrightField()) {
			stringBuffer.append(TEXT_40);
			stringBuffer.append(genModel.getCopyrightFieldLiteral());
			stringBuffer.append(TEXT_41);
			stringBuffer.append(genModel.getNonNLS());
			stringBuffer.append(TEXT_42);
		}
		stringBuffer.append(TEXT_43);
		stringBuffer.append(genModel.getImportedName("org.eclipse.emf.edit.ui.action.LoadResourceAction"));
		stringBuffer.append(TEXT_44);
		if (genModel.useClassOverrideAnnotation()) {
			stringBuffer.append(TEXT_45);
		}
		stringBuffer.append(TEXT_46);
		stringBuffer.append(genModel.getImportedName("org.eclipse.ui.PlatformUI"));
		stringBuffer.append(TEXT_47);
		stringBuffer.append(
				genModel.getImportedName("org.eclipse.emf.edit.ui.action.LoadResourceAction$LoadResourceDialog"));
		stringBuffer.append(TEXT_48);
		stringBuffer.append(genModel.getImportedName("org.eclipse.swt.widgets.Shell"));
		stringBuffer.append(TEXT_49);
		if (genModel.useClassOverrideAnnotation()) {
			stringBuffer.append(TEXT_50);
		}
		stringBuffer.append(TEXT_51);
		stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.ResourceSet"));
		stringBuffer.append(TEXT_52);
		stringBuffer.append(genModel.getImportedName("org.polarsys.kitalpha.ad.metadata.helpers.LibraryHelper"));
		stringBuffer.append(TEXT_53);
		stringBuffer.append(genModel.getImportedName("org.eclipse.ui.dialogs.ElementListSelectionDialog"));
		stringBuffer.append(TEXT_54);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.viewers.LabelProvider"));
		stringBuffer.append(TEXT_55);
		stringBuffer.append(genModel.getImportedName("org.eclipse.swt.graphics.Image"));
		stringBuffer.append(TEXT_56);
		stringBuffer.append(genModel.getImportedName("org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry"));
		stringBuffer.append(TEXT_57);
		stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.provider.EcoreEditPlugin"));
		stringBuffer.append(TEXT_58);
		stringBuffer.append(genModel.getNonNLS());
		stringBuffer.append(TEXT_59);
		stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.presentation.EcoreEditorPlugin"));
		stringBuffer.append(TEXT_60);
		stringBuffer.append(genModel.getNonNLS());
		stringBuffer.append(TEXT_61);
		stringBuffer.append(genModel.getImportedName("java.util.Map"));
		stringBuffer.append(TEXT_62);
		stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.URI"));
		stringBuffer.append(TEXT_63);
		stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
		stringBuffer.append(TEXT_64);
		stringBuffer.append(genModel.getImportedName("java.util.Arrays"));
		stringBuffer.append(TEXT_65);
		stringBuffer.append(genModel.getNonNLS());
		stringBuffer.append(TEXT_66);
		if (genModel.isRichClientPlatform() && genPackage.isGenerateModelWizard()) {
			stringBuffer.append(TEXT_67);
			stringBuffer.append(genPackage.getPrefix());
			stringBuffer.append(TEXT_68);
			stringBuffer
					.append(genModel.getImportedName("org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate"));
			stringBuffer.append(TEXT_69);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IAction"));
			stringBuffer.append(TEXT_70);
			stringBuffer.append(genPackage.getModelWizardClassName());
			stringBuffer.append(TEXT_71);
			stringBuffer.append(genPackage.getModelWizardClassName());
			stringBuffer.append(TEXT_72);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.viewers.StructuredSelection"));
			stringBuffer.append(TEXT_73);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.wizard.WizardDialog"));
			stringBuffer.append(TEXT_74);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.wizard.WizardDialog"));
			stringBuffer.append(TEXT_75);
		}
		stringBuffer.append(TEXT_76);
		stringBuffer.append(genModel.getImportedName("org.eclipse.ui.IEditorPart"));
		stringBuffer.append(TEXT_77);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.viewers.ISelectionProvider"));
		stringBuffer.append(TEXT_78);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IAction"));
		stringBuffer.append(TEXT_79);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IAction"));
		stringBuffer.append(TEXT_80);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IAction"));
		stringBuffer.append(TEXT_81);
		if (genModel.isCreationCommands()) {
			stringBuffer.append(TEXT_82);
			stringBuffer.append(_CollectionOfIAction);
			stringBuffer.append(TEXT_83);
			if (genModel.isCreationSubmenus()) {
				stringBuffer.append(TEXT_84);
				stringBuffer.append(_MapOfStringToCollectionOfIAction);
				stringBuffer.append(TEXT_85);
			}
			stringBuffer.append(TEXT_86);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IMenuManager"));
			stringBuffer.append(TEXT_87);
			stringBuffer.append(_CollectionOfIAction);
			stringBuffer.append(TEXT_88);
			if (genModel.isCreationSubmenus()) {
				stringBuffer.append(TEXT_89);
				stringBuffer.append(_MapOfStringToCollectionOfIAction);
				stringBuffer.append(TEXT_90);
			}
			stringBuffer.append(TEXT_91);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IMenuManager"));
			stringBuffer.append(TEXT_92);
		}
		if (genPackage.isExtensibleProviderFactory()) {
			stringBuffer.append(TEXT_93);
			stringBuffer.append(genModel.getImportedName("java.util.Collection"));
			stringBuffer.append(TEXT_94);
			stringBuffer
					.append(genModel.getImportedName("org.polarsys.kitalpha.emde.ui.actions.EmdeViewerFilterAction"));
			stringBuffer.append(TEXT_95);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IMenuManager"));
			stringBuffer.append(TEXT_96);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
			stringBuffer.append(TEXT_97);
		}
		stringBuffer.append(TEXT_98);
		stringBuffer.append(genPackage.getActionBarContributorClassName());
		stringBuffer.append(TEXT_99);
		stringBuffer.append(genModel.getImportedName("org.eclipse.emf.edit.ui.action.ValidateAction"));
		stringBuffer.append(TEXT_100);
		stringBuffer.append(genModel.getImportedName("org.eclipse.emf.edit.ui.action.ControlAction"));
		stringBuffer.append(TEXT_101);
		if (genPackage.isExtensibleProviderFactory()) {
			stringBuffer.append(TEXT_102);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.util.PropertyChangeEvent"));
			stringBuffer.append(TEXT_103);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.ui.action.ViewerFilterAction"));
			stringBuffer.append(TEXT_104);
		}
		stringBuffer.append(TEXT_105);
		if (genModel.useClassOverrideAnnotation()) {
			stringBuffer.append(TEXT_106);
		}
		stringBuffer.append(TEXT_107);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IToolBarManager"));
		stringBuffer.append(TEXT_108);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.Separator"));
		stringBuffer.append(TEXT_109);
		stringBuffer.append(genPackage.getPrefix().toLowerCase(genModel.getLocale()));
		stringBuffer.append(TEXT_110);
		stringBuffer.append(genModel.getNonNLS());
		stringBuffer.append(TEXT_111);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.Separator"));
		stringBuffer.append(TEXT_112);
		stringBuffer.append(genPackage.getPrefix().toLowerCase(genModel.getLocale()));
		stringBuffer.append(TEXT_113);
		stringBuffer.append(genModel.getNonNLS());
		stringBuffer.append(TEXT_114);
		if (genModel.useClassOverrideAnnotation()) {
			stringBuffer.append(TEXT_115);
		}
		stringBuffer.append(TEXT_116);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IMenuManager"));
		stringBuffer.append(TEXT_117);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IMenuManager"));
		stringBuffer.append(TEXT_118);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.MenuManager"));
		stringBuffer.append(TEXT_119);
		stringBuffer.append(genPackage.getImportedEditorPluginClassName());
		stringBuffer.append(TEXT_120);
		stringBuffer.append(genPackage.getEditorClassName());
		stringBuffer.append(TEXT_121);
		stringBuffer.append(genPackage.getInterfacePackageName());
		stringBuffer.append(TEXT_122);
		stringBuffer.append(genModel.getNonNLS());
		stringBuffer.append(genModel.getNonNLS(2));
		stringBuffer.append(TEXT_123);
		stringBuffer.append(genModel.getNonNLS());
		stringBuffer.append(TEXT_124);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.Separator"));
		stringBuffer.append(TEXT_125);
		stringBuffer.append(genModel.getNonNLS());
		stringBuffer.append(TEXT_126);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.Separator"));
		stringBuffer.append(TEXT_127);
		stringBuffer.append(genModel.getNonNLS());
		stringBuffer.append(TEXT_128);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.Separator"));
		stringBuffer.append(TEXT_129);
		stringBuffer.append(genModel.getNonNLS());
		stringBuffer.append(TEXT_130);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.Separator"));
		stringBuffer.append(TEXT_131);
		stringBuffer.append(genModel.getNonNLS());
		stringBuffer.append(TEXT_132);
		if (genPackage.isExtensibleProviderFactory()) {
			stringBuffer.append(TEXT_133);
			stringBuffer.append(genModel.getImportedName("org.polarsys.kitalpha.emde.ui.i18n.Messages"));
			stringBuffer.append(TEXT_134);
			stringBuffer.append(genModel.getNonNLS());
			stringBuffer.append(TEXT_135);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.Separator"));
			stringBuffer.append(TEXT_136);
			stringBuffer.append(genModel.getNonNLS());
			stringBuffer.append(TEXT_137);
		}
		stringBuffer.append(TEXT_138);
		if (genModel.isCreationCommands()) {
			stringBuffer.append(TEXT_139);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.MenuManager"));
			stringBuffer.append(TEXT_140);
			stringBuffer.append(genPackage.getImportedEditorPluginClassName());
			stringBuffer.append(TEXT_141);
			stringBuffer.append(genModel.getNonNLS());
			stringBuffer.append(TEXT_142);
			stringBuffer.append(genModel.getNonNLS());
			stringBuffer.append(TEXT_143);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.MenuManager"));
			stringBuffer.append(TEXT_144);
			stringBuffer.append(genPackage.getImportedEditorPluginClassName());
			stringBuffer.append(TEXT_145);
			stringBuffer.append(genModel.getNonNLS());
			stringBuffer.append(TEXT_146);
			stringBuffer.append(genModel.getNonNLS());
			stringBuffer.append(TEXT_147);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IMenuListener"));
			stringBuffer.append(TEXT_148);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IMenuManager"));
			stringBuffer.append(TEXT_149);
		} else {
			stringBuffer.append(TEXT_150);
		}
		stringBuffer.append(TEXT_151);
		if (genModel.useClassOverrideAnnotation()) {
			stringBuffer.append(TEXT_152);
		}
		stringBuffer.append(TEXT_153);
		stringBuffer.append(genModel.getImportedName("org.eclipse.ui.IEditorPart"));
		stringBuffer.append(TEXT_154);
		if (genPackage.isExtensibleProviderFactory()) {
			stringBuffer.append(TEXT_155);
			stringBuffer.append(genPackage.getEditorClassName());
			stringBuffer.append(TEXT_156);
			stringBuffer
					.append(genModel.getImportedName("org.polarsys.kitalpha.emde.ui.actions.EmdeViewerFilterAction"));
			stringBuffer.append(TEXT_157);
		}
		stringBuffer.append(TEXT_158);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.viewers.SelectionChangedEvent"));
		stringBuffer.append(TEXT_159);
		if (genModel.isCreationCommands()) {
			stringBuffer.append(TEXT_160);
			if (genModel.useClassOverrideAnnotation()) {
				stringBuffer.append(TEXT_161);
			}
			stringBuffer.append(TEXT_162);
			if (genPackage.isExtensibleProviderFactory()) {
				stringBuffer.append(TEXT_163);
			}
			stringBuffer.append(TEXT_164);
		}
		stringBuffer.append(TEXT_165);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.viewers.SelectionChangedEvent"));
		stringBuffer.append(TEXT_166);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.viewers.ISelection"));
		stringBuffer.append(TEXT_167);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.viewers.IStructuredSelection"));
		stringBuffer.append(TEXT_168);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.viewers.IStructuredSelection"));
		stringBuffer.append(TEXT_169);
		if (genPackage.isExtensibleProviderFactory()) {
			stringBuffer.append(TEXT_170);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
			stringBuffer.append(TEXT_171);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
			stringBuffer.append(TEXT_172);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
			stringBuffer.append(TEXT_173);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
			stringBuffer.append(TEXT_174);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
			stringBuffer.append(TEXT_175);
		}
		stringBuffer.append(TEXT_176);
		if (genModel.isCreationCommands()) {
			stringBuffer.append(TEXT_177);
			if (genModel.isCreationSubmenus()) {
				stringBuffer.append(TEXT_178);
			}
			stringBuffer.append(TEXT_179);
			if (genModel.isCreationSubmenus()) {
				stringBuffer.append(TEXT_180);
			}
			stringBuffer.append(TEXT_181);
			if (genPackage.isExtensibleProviderFactory()) {
				stringBuffer.append(TEXT_182);
				stringBuffer.append(genPackage.getEditorClassName());
				stringBuffer.append(TEXT_183);
			}
			stringBuffer.append(TEXT_184);
			stringBuffer.append(_CollectionOfAnything);
			stringBuffer.append(TEXT_185);
			stringBuffer.append(_CollectionOfAnything);
			stringBuffer.append(TEXT_186);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.edit.domain.EditingDomain"));
			stringBuffer.append(TEXT_187);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.edit.domain.IEditingDomainProvider"));
			stringBuffer.append(TEXT_188);
			if (genModel.isCreationSubmenus()) {
				stringBuffer.append(TEXT_189);
			}
			stringBuffer.append(TEXT_190);
			if (genModel.isCreationSubmenus()) {
				stringBuffer.append(TEXT_191);
			}
			stringBuffer.append(TEXT_192);
			if (genModel.isCreationSubmenus()) {
				stringBuffer.append(TEXT_193);
			}
			stringBuffer.append(TEXT_194);
			if (genModel.isCreationSubmenus()) {
				stringBuffer.append(TEXT_195);
			}
			stringBuffer.append(TEXT_196);
		} else {
			stringBuffer.append(TEXT_197);
		}
		stringBuffer.append(TEXT_198);
		if (genModel.isCreationCommands()) {
			stringBuffer.append(TEXT_199);
			stringBuffer.append(_CollectionOfIAction);
			stringBuffer.append(TEXT_200);
			stringBuffer.append(_CollectionOfAnything);
			stringBuffer.append(TEXT_201);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.viewers.ISelection"));
			stringBuffer.append(TEXT_202);
			stringBuffer.append(_CollectionOfIAction);
			stringBuffer.append(TEXT_203);
			stringBuffer.append(_ArrayListOfIAction);
			stringBuffer.append(TEXT_204);
			if (genModel.useGenerics()) {
				stringBuffer.append(TEXT_205);
				stringBuffer.append(genModel.getImportedName("java.lang.Object"));
				stringBuffer.append(TEXT_206);
			} else {
				stringBuffer.append(TEXT_207);
				stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
				stringBuffer.append(TEXT_208);
			}
			stringBuffer.append(TEXT_209);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.edit.ui.action.CreateChildAction"));
			stringBuffer.append(TEXT_210);
			if (genModel.useGenerics()) {
				stringBuffer.append(TEXT_211);
			} else {
				stringBuffer.append(TEXT_212);
			}
			stringBuffer.append(TEXT_213);
			stringBuffer.append(_CollectionOfIAction);
			stringBuffer.append(TEXT_214);
			stringBuffer.append(_CollectionOfAnything);
			stringBuffer.append(TEXT_215);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.viewers.ISelection"));
			stringBuffer.append(TEXT_216);
			stringBuffer.append(_CollectionOfIAction);
			stringBuffer.append(TEXT_217);
			stringBuffer.append(_ArrayListOfIAction);
			stringBuffer.append(TEXT_218);
			if (genModel.useGenerics()) {
				stringBuffer.append(TEXT_219);
				stringBuffer.append(genModel.getImportedName("java.lang.Object"));
				stringBuffer.append(TEXT_220);
			} else {
				stringBuffer.append(TEXT_221);
				stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
				stringBuffer.append(TEXT_222);
			}
			stringBuffer.append(TEXT_223);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.edit.ui.action.CreateSiblingAction"));
			stringBuffer.append(TEXT_224);
			if (genModel.useGenerics()) {
				stringBuffer.append(TEXT_225);
			} else {
				stringBuffer.append(TEXT_226);
			}
			stringBuffer.append(TEXT_227);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IContributionManager"));
			stringBuffer.append(TEXT_228);
			stringBuffer.append(_CollectionOfExtendsIAction);
			stringBuffer.append(TEXT_229);
			if (genModel.useGenerics()) {
				stringBuffer.append(TEXT_230);
				stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IAction"));
				stringBuffer.append(TEXT_231);
			} else {
				stringBuffer.append(TEXT_232);
				stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
				stringBuffer.append(TEXT_233);
			}
			stringBuffer.append(TEXT_234);
			if (!genModel.useGenerics()) {
				stringBuffer.append(TEXT_235);
				stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IAction"));
				stringBuffer.append(TEXT_236);
			}
			stringBuffer.append(TEXT_237);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IContributionManager"));
			stringBuffer.append(TEXT_238);
			stringBuffer.append(_CollectionOfExtendsIAction);
			stringBuffer.append(TEXT_239);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IContributionItem"));
			stringBuffer.append(TEXT_240);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IContributionItem"));
			stringBuffer.append(TEXT_241);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.SubContributionItem"));
			stringBuffer.append(TEXT_242);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.SubContributionItem"));
			stringBuffer.append(TEXT_243);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.ActionContributionItem"));
			stringBuffer.append(TEXT_244);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IAction"));
			stringBuffer.append(TEXT_245);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.ActionContributionItem"));
			stringBuffer.append(TEXT_246);
			if (genModel.isCreationSubmenus()) {
				stringBuffer.append(TEXT_247);
				stringBuffer.append(_MapOfStringToCollectionOfIAction);
				stringBuffer.append(TEXT_248);
				stringBuffer.append(_CollectionOfIAction);
				stringBuffer.append(TEXT_249);
				stringBuffer.append(_MapOfStringToCollectionOfIAction);
				stringBuffer.append(TEXT_250);
				stringBuffer.append(_LinkedHashMapOfStringToCollectionOfIAction);
				stringBuffer.append(TEXT_251);
				stringBuffer.append(_IteratorOfIAction);
				stringBuffer.append(TEXT_252);
				stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IAction"));
				stringBuffer.append(TEXT_253);
				if (!genModel.useGenerics()) {
					stringBuffer.append(TEXT_254);
					stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IAction"));
					stringBuffer.append(TEXT_255);
				}
				stringBuffer.append(TEXT_256);
				stringBuffer.append(genModel.getImportedName("java.util.StringTokenizer"));
				stringBuffer.append(TEXT_257);
				stringBuffer.append(genModel.getImportedName("java.util.StringTokenizer"));
				stringBuffer.append(TEXT_258);
				stringBuffer.append(genModel.getNonNLS());
				stringBuffer.append(TEXT_259);
				stringBuffer.append(_CollectionOfIAction);
				stringBuffer.append(TEXT_260);
				if (!genModel.useGenerics()) {
					stringBuffer.append(TEXT_261);
					stringBuffer.append(_CollectionOfIAction);
					stringBuffer.append(TEXT_262);
				}
				stringBuffer.append(TEXT_263);
				stringBuffer.append(_ArrayListOfIAction);
				stringBuffer.append(TEXT_264);
				stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IContributionManager"));
				stringBuffer.append(TEXT_265);
				stringBuffer.append(_MapOfStringToCollectionOfIAction);
				stringBuffer.append(TEXT_266);
				if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
					stringBuffer.append(TEXT_267);
					stringBuffer.append(_MapEntryOfStringToCollectionOfIAction);
					stringBuffer.append(TEXT_268);
				} else {
					stringBuffer.append(TEXT_269);
					stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
					stringBuffer.append(TEXT_270);
					stringBuffer.append(_MapEntryOfStringToCollectionOfIAction);
					stringBuffer.append(TEXT_271);
					stringBuffer.append(_MapEntryOfStringToCollectionOfIAction);
					stringBuffer.append(TEXT_272);
				}
				stringBuffer.append(TEXT_273);
				stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.MenuManager"));
				stringBuffer.append(TEXT_274);
				stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.MenuManager"));
				stringBuffer.append(TEXT_275);
				if (!genModel.useGenerics()) {
					stringBuffer.append(TEXT_276);
				}
				stringBuffer.append(TEXT_277);
				if (!genModel.useGenerics()) {
					stringBuffer.append(TEXT_278);
					stringBuffer.append(_CollectionOfIAction);
					stringBuffer.append(TEXT_279);
				}
				stringBuffer.append(TEXT_280);
				stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IContributionManager"));
				stringBuffer.append(TEXT_281);
				stringBuffer.append(_MapOfStringToCollectionOfIAction);
				stringBuffer.append(TEXT_282);
				stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IContributionItem"));
				stringBuffer.append(TEXT_283);
				stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IContributionItem"));
				stringBuffer.append(TEXT_284);
				stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.MenuManager"));
				stringBuffer.append(TEXT_285);
				stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.MenuManager"));
				stringBuffer.append(TEXT_286);
				stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.MenuManager"));
				stringBuffer.append(TEXT_287);
				if (!genModel.useGenerics()) {
					stringBuffer.append(TEXT_288);
					stringBuffer.append(_CollectionOfIAction);
					stringBuffer.append(TEXT_289);
				}
				stringBuffer.append(TEXT_290);
			}
		}
		stringBuffer.append(TEXT_291);
		if (genModel.useClassOverrideAnnotation()) {
			stringBuffer.append(TEXT_292);
		}
		stringBuffer.append(TEXT_293);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IMenuManager"));
		stringBuffer.append(TEXT_294);
		if (genModel.isCreationCommands()) {
			stringBuffer.append(TEXT_295);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.MenuManager"));
			stringBuffer.append(TEXT_296);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.MenuManager"));
			stringBuffer.append(TEXT_297);
			stringBuffer.append(genPackage.getImportedEditorPluginClassName());
			stringBuffer.append(TEXT_298);
			stringBuffer.append(genModel.getNonNLS());
			if (genModel.isCreationSubmenus()) {
				stringBuffer.append(TEXT_299);
			}
			stringBuffer.append(TEXT_300);
			stringBuffer.append(genModel.getNonNLS());
			stringBuffer.append(TEXT_301);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.MenuManager"));
			stringBuffer.append(TEXT_302);
			stringBuffer.append(genPackage.getImportedEditorPluginClassName());
			stringBuffer.append(TEXT_303);
			stringBuffer.append(genModel.getNonNLS());
			if (genModel.isCreationSubmenus()) {
				stringBuffer.append(TEXT_304);
			}
			stringBuffer.append(TEXT_305);
			stringBuffer.append(genModel.getNonNLS());
		}
		if (genPackage.isExtensibleProviderFactory()) {
			stringBuffer.append(TEXT_306);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.MenuManager"));
			stringBuffer.append(TEXT_307);
			stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.MenuManager"));
			stringBuffer.append(TEXT_308);
			stringBuffer.append(genModel.getImportedName("org.polarsys.kitalpha.emde.ui.i18n.Messages"));
			stringBuffer.append(TEXT_309);
			stringBuffer.append(genModel.getNonNLS());
			stringBuffer.append(TEXT_310);
			stringBuffer.append(genModel.getNonNLS());
			stringBuffer.append(TEXT_311);
		}
		stringBuffer.append(TEXT_312);
		if (genModel.useClassOverrideAnnotation()) {
			stringBuffer.append(TEXT_313);
		}
		stringBuffer.append(TEXT_314);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.IMenuManager"));
		stringBuffer.append(TEXT_315);
		stringBuffer.append(genModel.getImportedName("org.eclipse.jface.action.Separator"));
		stringBuffer.append(TEXT_316);
		stringBuffer.append(genModel.getNonNLS());
		stringBuffer.append(genModel.getNonNLS(2));
		stringBuffer.append(TEXT_317);
		stringBuffer.append(genModel.getNonNLS());
		stringBuffer.append(TEXT_318);
		stringBuffer.append(genModel.getNonNLS());
		stringBuffer.append(TEXT_319);
		stringBuffer.append(genModel.getNonNLS());
		stringBuffer.append(TEXT_320);
		if (genModel.useClassOverrideAnnotation()) {
			stringBuffer.append(TEXT_321);
		}
		stringBuffer.append(TEXT_322);
		genModel.emitSortedImports();
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "doGenerate", stringBuffer.toString());
	}
}