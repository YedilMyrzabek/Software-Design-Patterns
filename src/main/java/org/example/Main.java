package org.example;

import org.example.BuilderPattern.House;
import org.example.PrototypePattern.Product;
import org.example.SingletonPattern.Logger;

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
    }
}