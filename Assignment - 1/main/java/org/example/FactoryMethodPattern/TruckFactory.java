package org.example.FactoryMethodPattern;

public class TruckFactory extends TransportFactory{

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
