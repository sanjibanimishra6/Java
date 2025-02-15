package com.wipro.java.designpattern.factory;

import com.wipro.java.designpattern.Button;
import com.wipro.java.designpattern.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckbox();
}
