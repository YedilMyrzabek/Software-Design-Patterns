package org.example.StrategyPattern;

import java.util.Scanner;
import java.util.concurrent.Flow;

public class main {
    public static void main(String[] args) {


        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to select a subscription type
        System.out.println("Select your Subscription: " +
                "\n1. Free Subscription" +
                "\n2. Premium Subscription" +
                "\n3. Family Subscription");

        // Capture the user's selection
        int answer = sc.nextInt();

        // Switch case to handle different subscription types based on user's input
        switch (answer){
            case 1:
                User user = new User(new FreeSub());
                user.accessContent();
                break;
            case 2:
                User user1 = new User(new PremiumSub());
                user1.accessContent();
                break;
            case 3:
                User user2 = new User(new FamilySub());
                user2.accessContent();
                break;
            default:
                // Invalid input from user
                System.out.println("Sorry this number is wrong");
        }



    }
}
