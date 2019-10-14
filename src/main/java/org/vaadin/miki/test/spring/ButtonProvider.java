package org.vaadin.miki.test.spring;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.spring.annotation.SpringComponent;

@SpringComponent
public class ButtonProvider implements ComponentProvider {
    @Override
    public Component createComponent() {
        return new Button("A random button that does nothing");
    }
}
