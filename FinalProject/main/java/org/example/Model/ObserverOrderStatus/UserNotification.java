package org.example.Model.ObserverOrderStatus;

public class UserNotification implements OrderObserver {
    @Override
    public void update(String status) {
        System.out.println("User notified: Order status is now " + status);
    }
}

