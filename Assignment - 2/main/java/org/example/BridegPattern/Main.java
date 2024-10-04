package org.example.BridegPattern;

import org.example.BridegPattern.*;


public class Main {
    public static void main(String[] args) {
        Engine petrolEngine = new PetrolEngine();
        Car sedan = new Toyota(petrolEngine);
        sedan.drive();

        Engine electricEngine = new ElectricEngine();
        Car suv = new Tesla(electricEngine);
        suv.drive();
    }
}