package org.example.AbstractFactoryPattern;

import org.example.AbstractFactoryPattern.Interface.AbstractFactory;
import org.example.AbstractFactoryPattern.Interface.Button;
import org.example.AbstractFactoryPattern.Interface.Window;

public class MacFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new MacButton(); //Create a Mac button
    }

    @Override
    public Window createWindow() {
        return new MacWindow(); //Create a Mac window
    }
}
