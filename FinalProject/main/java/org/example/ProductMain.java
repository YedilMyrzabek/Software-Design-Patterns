package org.example;

import org.example.AbstractFactory.ClothingFactory;
import org.example.AbstractFactory.ElectronicsFactory;
import org.example.AbstractFactory.Product;
import org.example.AbstractFactory.ProductFactory;
import org.example.BuilderMethod.Order;
import org.example.Composite.CategoryGroup;
import org.example.Composite.SingleCategory;
import org.example.ObserverOrderStatus.OrderObserver;
import org.example.ObserverOrderStatus.OrderStatus;
import org.example.ObserverOrderStatus.UserNotification;
import org.example.ProxyPattern.ProductDataAccess;
import org.example.ProxyPattern.ProductDataProxy;
import org.example.Strategy.CreditCardPayment;
import org.example.Strategy.PayPalPayment;
import org.example.Strategy.PaymentContext;
import org.example.Strategy.PaymentStrategy;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Using Abstract Factory to create a product
        System.out.println("Choose a product type: 1 for Electronics, 2 for Clothing");
        int productChoice = scanner.nextInt();
        ProductFactory productFactory;
        if (productChoice == 1) {
            productFactory = new ElectronicsFactory();
        } else {
            productFactory = new ClothingFactory();
        }
        Product product = productFactory.createProduct();
        System.out.println("Product created: " + product.getDescription());

        // 2. Using Builder to create an order
        System.out.println("Enter the quantity for the product:");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Choose a payment method: 'credit' or 'paypal'");
        String paymentMethod = scanner.nextLine();

        Order order = new Order.OrderBuilder()
                .setProduct(product.getDescription())
                .setQuantity(quantity)
                .setPaymentMethod(paymentMethod)
                .build();

        System.out.println("Order created for " + order);

        // 3. Using Proxy to fetch product data with caching
        ProductDataAccess dataAccess = new ProductDataProxy();
        System.out.println("Fetching product data...");
        System.out.println(dataAccess.fetchData());

        // 4. Using Composite to create and show product categories
        SingleCategory electronics = new SingleCategory("Electronics");
        SingleCategory clothing = new SingleCategory("Clothing");

        CategoryGroup mainCategory = new CategoryGroup("Main Categories");
        mainCategory.addCategory(electronics);
        mainCategory.addCategory(clothing);

        System.out.println("Product Categories:");
        mainCategory.showCategory();

        // 5. Using Strategy to handle payment
        PaymentStrategy paymentStrategy;
        if (paymentMethod.equalsIgnoreCase("credit")) {
            paymentStrategy = new CreditCardPayment();
        } else {
            paymentStrategy = new PayPalPayment();
        }

        PaymentContext paymentContext = new PaymentContext(paymentStrategy);
        System.out.println("Enter amount to pay:");
        double amount = scanner.nextDouble();
        paymentContext.executePayment(amount);

        // 6. Using Observer to notify user of order status updates
        OrderStatus orderStatus = new OrderStatus();
        OrderObserver userNotification = new UserNotification();
        orderStatus.addObserver(userNotification);

        System.out.println("Updating order status to 'Shipped'");
        orderStatus.setStatus("Shipped");

        System.out.println("Updating order status to 'Delivered'");
        orderStatus.setStatus("Delivered");

        scanner.close();
    }
}
