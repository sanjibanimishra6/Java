package com.wipro.java.designpattern.factory;

import com.wipro.java.designpattern.Button;
import com.wipro.java.designpattern.CheckBox;
import com.wipro.java.designpattern.WindowsButton;
import com.wipro.java.designpattern.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckbox();
    }
}