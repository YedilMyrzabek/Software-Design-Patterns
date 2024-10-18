package org.example.StrategyPattern;

public class main {
    public static void main(String[] args) {
        User user = new User(new FreeSub());
        user.accessContent();

        user.setSubscription(new PremiumSub());
        user.accessContent();

        user.setSubscription(new FamilySub());
        user.accessContent();

        user.setSubscription(new FamilySub());
        user.accessContent();
    }
}
