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


package org.polarsys.kitalpha.transposer.ui.internal.providers;

import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.provider.CommonItemProviderAdapterFactory;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.provider.MappingItemProvider;

/**
 * @author Guillaume Gebhart
 * 
 */
public class MappingTreeLabelProvider extends LabelProvider {

  private MappingItemProvider _provider = null;

  /**
   * 
   */
  public MappingTreeLabelProvider() {

    CommonItemProviderAdapterFactory factory = new CommonItemProviderAdapterFactory();
    _provider = (MappingItemProvider) factory.createMappingAdapter();
  }

  @Override
  public Image getImage(final Object element) {
    // MappingItemProvider _provider = new MappingItemProvider(null);
    if (element instanceof Mapping) {
      URL url = (URL) _provider.getImage(element);
      ImageDescriptor imd = ImageDescriptor.createFromURL(url);

      if (imd != null)
        return imd.createImage();
    }
    return null;
  }

  @Override
  public String getText(final Object element) {
    if (element instanceof Mapping) {
      return ((Mapping) element).getName();
    }
    return null;
  }
}