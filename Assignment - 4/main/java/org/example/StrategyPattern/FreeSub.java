package org.example.StrategyPattern;

// Class implementing the Free subscription
public class FreeSub implements Subcription{

    // Method providing access to Free subscription content
    @Override
    public void AccessToContent() {
        System.out.println("You have access to Free Subscription.");
    }
}
