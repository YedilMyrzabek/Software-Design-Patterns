package org.example.FactoryMethodPattern;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivery by water in a container");
    }
}
