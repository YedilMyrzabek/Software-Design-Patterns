package org.example.FactoryMethodPattern;

//Drone implements from Transport for air delivering
public class Drone implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delitvery by air using a Drone");
    }
}
