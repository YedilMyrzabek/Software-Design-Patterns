package org.example.StrategyPattern;

// Class implementing the Family subscription
public class FamilySub implements Subcription{

    // Method providing access to Family subscription content
    @Override
    public void AccessToContent() {
        System.out.println("You have access to Family Subscription");
    }
}
