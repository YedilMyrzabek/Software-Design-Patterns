package org.example.FactoryMethodPattern;

//Ship implements from Transport for land delivering
public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivery by water in a container");
    }
}
