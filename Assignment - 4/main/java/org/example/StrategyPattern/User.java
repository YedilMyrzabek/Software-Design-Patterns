package org.example.StrategyPattern;

// Class representing the user with a subscription
public class User {
    // Subscription field to hold the current subscription type
    private Subcription subscription;

    // Constructor to initialize the user with a subscription
    public User(Subcription subscription) {
        this.subscription = subscription;
    }

    // Method to change the subscription type
    public void setSubscription(Subcription subscription) {
        this.subscription = subscription;
    }

    // Method to access content based on the current subscription
    public void accessContent() {
        subscription.AccessToContent();
    }
}
