package com.wipro.java.designpattern.factory;

import com.wipro.java.designpattern.Button;
import com.wipro.java.designpattern.CheckBox;

public class Application {
    private Button button;
    private CheckBox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}