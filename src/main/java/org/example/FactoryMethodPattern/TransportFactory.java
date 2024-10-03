package org.example.FactoryMethodPattern;

public abstract class TransportFactory {
    public abstract Transport createTransport();

    public void productDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
