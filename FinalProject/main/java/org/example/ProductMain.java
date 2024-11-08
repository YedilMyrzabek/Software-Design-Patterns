package org.example;

public class ProductMain {
    public static void main(String[] args) {

        ProductView view = new ProductView();
        ProductController controller = new ProductController(view);

        controller.createAndShowProduct();
    }
}
