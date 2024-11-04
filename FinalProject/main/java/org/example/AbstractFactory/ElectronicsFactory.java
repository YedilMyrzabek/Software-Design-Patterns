package org.example.AbstractFactory;

// Concrete factories for product type
class ElectronicsFactory implements ProductFactory {

    @Override
    public Product createProduct() {
        return new Electronics();
    }
}