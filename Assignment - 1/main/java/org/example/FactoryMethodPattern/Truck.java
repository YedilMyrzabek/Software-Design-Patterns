package org.example.FactoryMethodPattern;

//Truck implements from Transport for land delivering
public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivery by land in a box");
    }
}
