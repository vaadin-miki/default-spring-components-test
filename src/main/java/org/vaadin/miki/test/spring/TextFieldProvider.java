package org.vaadin.miki.test.spring;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.spring.annotation.SpringComponent;

@SpringComponent
public class TextFieldProvider implements ComponentProvider {

    @Override
    public Component createComponent() {
        return new TextField("A random text field", "A random placeholder");
    }
}
