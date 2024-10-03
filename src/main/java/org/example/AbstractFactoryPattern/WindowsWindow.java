package org.example.AbstractFactoryPattern;

import org.example.AbstractFactoryPattern.Interface.Window;

public class WindowsWindow implements Window {
    @Override
    public void open() {
        System.out.println("Windows window open");
    }
}
