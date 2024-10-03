package org.example.FactoryMethodPattern;

public class DroneFactory extends TransportFactory{
    @Override
    public Transport createTransport() {
        return new Drone();
    }
}
