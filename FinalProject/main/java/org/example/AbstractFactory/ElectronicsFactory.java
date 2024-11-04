package org.example.AbstractFactory;

// Concrete factories for each product type
class ElectronicsFactory implements ProductFactory {

    @Override
    public Product createProduct() {
        return new Electronics();
    }
}