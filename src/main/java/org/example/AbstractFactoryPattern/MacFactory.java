package org.example.AbstractFactoryPattern;

import org.example.AbstractFactoryPattern.Interface.AbstractFactory;
import org.example.AbstractFactoryPattern.Interface.Button;
import org.example.AbstractFactoryPattern.Interface.Window;

public class MacFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Window createWindow() {
        return new MacWindow();
    }
}
