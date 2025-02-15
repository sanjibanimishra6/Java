package com.wipro.java.designpattern.factory;

import com.wipro.java.designpattern.Button;
import com.wipro.java.designpattern.CheckBox;
import com.wipro.java.designpattern.MacOSButton;
import com.wipro.java.designpattern.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOSCheckbox();
    }
}