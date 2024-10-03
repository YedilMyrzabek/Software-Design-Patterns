package org.example.PrototypePattern;

//Product class implements Cloneable interface to use object cloning
public class Product implements Cloneable{
    private String name; //Name of the product
    private double price; //Price of the product

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //Create a copy of the product
    @Override
    public Product clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }

    //Text definition of the product
    @Override
    public String toString() {
        return "Product: " + name
                + " Price: " + price;
    }

    /*The Prototype pattern is used to create copies of objects. */
}
