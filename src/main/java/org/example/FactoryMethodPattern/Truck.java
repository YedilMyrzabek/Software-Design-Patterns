package org.example.FactoryMethodPattern;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivery by land in a box");
    }
}
