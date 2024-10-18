package org.example.StrategyPattern;

public class FreeSub implements Subcription{
    @Override
    public void AccessToContent() {
        System.out.println("You have access to Free Subscription.");
    }
}
