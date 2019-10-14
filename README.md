# Default Front-End Components Test

This simple application creates a random component when a button is clicked. The created component is completely random and not known to the main view.

However, due to the lack of predefined set of front-end dependencies in Vaadin 14.0, `@Uses` annotations are required on the view - listing every possible component that could be added.

This application is a test case for when the predefined front-end dependencies are available - removing all `@Uses` annotations from `MainView` should not break the application. 