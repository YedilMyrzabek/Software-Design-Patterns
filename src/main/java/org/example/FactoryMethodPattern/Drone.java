package org.example.FactoryMethodPattern;

public class Drone implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delitvery by air using a Drone");
    }
}
