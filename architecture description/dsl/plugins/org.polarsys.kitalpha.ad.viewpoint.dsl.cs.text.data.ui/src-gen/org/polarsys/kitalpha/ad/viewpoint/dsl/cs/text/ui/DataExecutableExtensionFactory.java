/*
 * generated by Xtext
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.internal.DataActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DataExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DataActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DataActivator.getInstance().getInjector(DataActivator.ORG_POLARSYS_KITALPHA_AD_VIEWPOINT_DSL_CS_TEXT_DATA);
	}
	
}
