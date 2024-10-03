package org.example.AbstractFactoryPattern.Interface;

public interface AbstractFactory {
    public Button createButton(); //Create a Button
    public Window createWindow(); //Create a Window
}

/*The Abstract Factory pattern is used to create families of related objects without specifying their concrete classes*/
