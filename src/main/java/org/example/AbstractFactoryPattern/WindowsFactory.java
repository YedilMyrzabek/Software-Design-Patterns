package org.example.AbstractFactoryPattern;

import org.example.AbstractFactoryPattern.Interface.AbstractFactory;
import org.example.AbstractFactoryPattern.Interface.Button;
import org.example.AbstractFactoryPattern.Interface.Window;

public class WindowsFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}
