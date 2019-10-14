package org.vaadin.miki.test.spring;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.spring.annotation.SpringComponent;

@SpringComponent
public class ComboBoxProvider implements ComponentProvider {

    enum RandomValues { SOME, RANDOM, VALUES }

    @Override
    public Component createComponent() {
        return new ComboBox<>("A random combo box", RandomValues.values());
    }
}
