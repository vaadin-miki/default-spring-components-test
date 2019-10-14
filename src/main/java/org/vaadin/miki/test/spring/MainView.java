package org.vaadin.miki.test.spring;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route
@PWA(name = "Project Base for Vaadin Flow with Spring", shortName = "Project Base")
// for test purposes: remove those three annotations below
@Uses(ComboBox.class)
@Uses(TextArea.class)
@Uses(TextField.class)
// with the default frontend dependencies preloaded, the application should still work
public class MainView extends VerticalLayout {

    private final ComponentBuilder builder;

    public MainView(@Autowired ComponentBuilder builder) {
        this.builder = builder;
        Button button = new Button("Click to add a random component",
                e -> add(builder.getRandomComponent()));
        add(button);
    }

}
