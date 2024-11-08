package org.example.Model.AbstractFactory;

// Concrete product classes
class Clothing extends Product {

    @Override
    public String getDescription() {
        return "Clothing product";
    }
}