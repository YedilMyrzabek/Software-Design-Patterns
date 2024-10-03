package org.example;

import org.example.AbstractFactoryPattern.Interface.AbstractFactory;
import org.example.AbstractFactoryPattern.Interface.Button;
import org.example.AbstractFactoryPattern.Interface.Window;
import org.example.AbstractFactoryPattern.WindowsFactory;
import org.example.BuilderPattern.House;
import org.example.FactoryMethodPattern.DroneFactory;
import org.example.FactoryMethodPattern.ShipFactory;
import org.example.FactoryMethodPattern.TransportFactory;
import org.example.FactoryMethodPattern.TruckFactory;
import org.example.PrototypePattern.Product;
import org.example.SingletonPattern.Logger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Singleton Pattern
        System.out.println("Singleton Pattern: ");
        Logger logger = Logger.getInstance();
        logger.log("Log in");
        logger.log("Log");
        System.out.println();


        //Builder Pattern
        System.out.println("Builder Pattern: ");
        House house = new House.Builder()
                .setRooms(3)
                .setFloors(2)
                .setPool(true)
                .setGarage(false)
                .build();
        System.out.println(house);
        System.out.println();

        //Prototype Pattern
        System.out.println("Prototype Pattern: ");
        Product originalProduct = new Product("Laptop", 1200);
        Product clonedProduct = null;
        try {
            clonedProduct = originalProduct.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(originalProduct);
        System.out.println(clonedProduct);
        System.out.println();

        //AbstractFactory
        AbstractFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        Window window = factory.createWindow();
        button.click();
        window.open();
        System.out.println();

        //Factory Method Pattern
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Select delivery method (only digigt): ");
        System.out.println("1. land delivery");
        System.out.println("2. water delivery");
        System.out.println("3. air delivery");
        int num = sc.nextInt();

        TransportFactory transportFactory;

        switch (num) {
            case 1:
                transportFactory = new TruckFactory(); // Returns a Truck for delivery in land
                break;
            case 2:
                transportFactory = new ShipFactory();  // Returns a Ship for delivery in water
                break;
            case 3:
                transportFactory = new DroneFactory();  // Returns a Drone for delivery in air
                break;
            default:
                System.out.println("Invalid Input (write only digit)");
                return;
        }

        transportFactory.productDelivery();
    }
}