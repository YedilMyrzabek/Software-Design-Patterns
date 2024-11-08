package org.example;

import org.example.Model.AbstractFactory.ClothingFactory;
import org.example.Model.AbstractFactory.ElectronicsFactory;
import org.example.Model.AbstractFactory.Product;
import org.example.Model.AbstractFactory.ProductFactory;
import org.example.Model.BuilderMethod.Order;
import org.example.Model.Composite.CategoryGroup;
import org.example.Model.Composite.SingleCategory;
import org.example.Model.ObserverOrderStatus.OrderObserver;
import org.example.Model.ObserverOrderStatus.OrderStatus;
import org.example.Model.ObserverOrderStatus.UserNotification;
import org.example.Model.ProxyPattern.ProductDataAccess;
import org.example.Model.ProxyPattern.ProductDataProxy;
import org.example.Model.Strategy.CreditCardPayment;
import org.example.Model.Strategy.PayPalPayment;
import org.example.Model.Strategy.PaymentContext;
import org.example.Model.Strategy.PaymentStrategy;

import java.util.Locale;
import java.util.Scanner;

public class ProductController {
    private ProductView view;

    public ProductController(ProductView view) {
        this.view = view;
    }

    public void createAndShowProduct() {
        Scanner scanner = new Scanner(System.in);

        // 1. Choose product
        System.out.println("Choose a product type: 1 for Electronics, 2 for Clothing");
        int productChoice = scanner.nextInt();
        ProductFactory productFactory;
        if (productChoice == 1) {
            productFactory = new ElectronicsFactory();
        } else {
            productFactory = new ClothingFactory();
        }

        Product product = productFactory.createProduct();
        view.displayProduct(product.getDescription());

        // 2. Creating product with Builder
        System.out.println("Enter the quantity for the product:");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Choose a payment method: 'credit' or 'paypal'");
        String paymentMethod = scanner.nextLine();

        Order order = new Order.OrderBuilder()
                .setProduct(product.getDescription())
                .setQuantity(quantity)
                .setPaymentMethod(paymentMethod)
                .build();

        view.displayOrder("Order created for " + product.getDescription());

        // 3. Using Proxy for taking product
        ProductDataAccess dataAccess = new ProductDataProxy();
        view.displayProduct("Fetched product data: " + dataAccess.fetchData());

        // 4. show category with Composite
        SingleCategory electronics = new SingleCategory("Electronics");
        SingleCategory clothing = new SingleCategory("Clothing");

        CategoryGroup mainCategory = new CategoryGroup("Main Categories");
        mainCategory.addCategory(electronics);
        mainCategory.addCategory(clothing);

        System.out.println("Product Categories:");
        mainCategory.showCategory();

        // 5. Choose chose of payment
        PaymentStrategy paymentStrategy = paymentMethod.equalsIgnoreCase("credit")
                ? new CreditCardPayment() : new PayPalPayment();

        PaymentContext paymentContext = new PaymentContext(paymentStrategy);
        System.out.println("Enter amount to pay:");
        double amount = scanner.nextDouble();
        paymentContext.executePayment(amount);

        // 6. Use Observer for menage product
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
