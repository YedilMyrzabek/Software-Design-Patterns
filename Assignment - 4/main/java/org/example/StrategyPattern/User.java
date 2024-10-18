package org.example.StrategyPattern;

public class User {
    private Subcription subscription;


    public User(Subcription subscription) {
        this.subscription = subscription;
    }

    public void setSubscription(Subcription subscription) {
        this.subscription = subscription;
    }

    public void accessContent() {
        subscription.AccessToContent();
    }
}
