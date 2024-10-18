package org.example.StrategyPattern;

public class FamilySub implements Subcription{

    @Override
    public void AccessToContent() {
        System.out.println("You have access to Family Subscription");
    }
}
