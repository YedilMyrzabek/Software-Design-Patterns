package org.example.StrategyPattern;

// Class implementing the Premium subscription
public class PremiumSub implements Subcription {

    // Method providing access to Premium subscription content
    public void AccessToContent() {
        System.out.println("You have access to Premium Subscription.");
    }
}
