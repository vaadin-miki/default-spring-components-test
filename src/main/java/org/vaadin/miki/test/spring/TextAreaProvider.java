package org.vaadin.miki.test.spring;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.spring.annotation.SpringComponent;

@SpringComponent
public class TextAreaProvider implements ComponentProvider {
    @Override
    public Component createComponent() {
        return new TextArea("A random text area", "A random placeholder");
    }
}
