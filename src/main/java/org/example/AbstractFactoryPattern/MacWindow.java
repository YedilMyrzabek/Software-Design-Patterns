package org.example.AbstractFactoryPattern;

import org.example.AbstractFactoryPattern.Interface.Window;

public class MacWindow implements Window {
    @Override
    public void open() {
        System.out.println("Mac window open");
    }
}
