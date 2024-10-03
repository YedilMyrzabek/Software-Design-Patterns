package org.example.FactoryMethodPattern;

//Testing the Factory Method
public abstract class TransportFactory {
    public abstract Transport createTransport();

    public void productDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
    /*The Factory Method pattern allows the client to create objects (transport) without knowing the exact class*/
}
