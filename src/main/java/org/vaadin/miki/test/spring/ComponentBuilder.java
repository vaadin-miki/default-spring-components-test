package org.vaadin.miki.test.spring;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.spring.annotation.SpringComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SpringComponent
public class ComponentBuilder {

    private final Random random = new Random();

    private final List<ComponentProvider> providers = new ArrayList<>();

    @Autowired
    ComponentBuilder(ApplicationContext context) {
        this.providers.addAll(
                context.getBeansOfType(ComponentProvider.class).values()
        );
    }

    public Component getRandomComponent() {
        return this.providers.get(this.random.nextInt(this.providers.size())).createComponent();
    }

}
