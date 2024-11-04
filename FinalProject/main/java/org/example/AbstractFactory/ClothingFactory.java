package org.example.AbstractFactory;

class ClothingFactory implements ProductFactory {

    @Override
    public Product createProduct() {
        return new Clothing();
    }
}