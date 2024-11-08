package org.example.Model.ObserverOrderStatus;

import java.util.ArrayList;
import java.util.List;

// Subject class for order
public class OrderStatus {
    private List<OrderObserver> observers = new ArrayList<>();
    private String status;

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(status);
        }
    }
}

