package org.example.AbstractFactoryPattern;

import org.example.AbstractFactoryPattern.Interface.Button;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows button clicked");
    }
}
