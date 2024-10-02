package org.example.PrototypePattern;

public class Product implements Cloneable{
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Product clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }

    @Override
    public String toString() {
        return "Product: " + name
                + " Price: " + price;
    }
}
