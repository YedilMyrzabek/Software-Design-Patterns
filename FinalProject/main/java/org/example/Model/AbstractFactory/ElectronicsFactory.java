package org.example.Model.AbstractFactory;

// Concrete factories for product type
public class ElectronicsFactory implements ProductFactory {

    @Override
    public Product createProduct() {
        return new Electronics();
    }
}