package org.example.AbstractFactory;

// Concrete factories for product type
public class ClothingFactory implements ProductFactory {

    @Override
    public Product createProduct() {
        return new Clothing();
    }
}