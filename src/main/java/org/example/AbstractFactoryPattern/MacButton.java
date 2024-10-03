package org.example.AbstractFactoryPattern;

import org.example.AbstractFactoryPattern.Interface.Button;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Mac button clicked");
    }
}
