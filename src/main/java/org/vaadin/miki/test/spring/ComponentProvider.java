package org.vaadin.miki.test.spring;

import com.vaadin.flow.component.Component;

@FunctionalInterface
public interface ComponentProvider {

    Component createComponent();

}
