package org.example.SingletonPattern;

//Logger class
public class Logger {
    private static Logger instance; //ONly one instance in Logger

    //Method that return the single instance
    public static Logger getInstance() {
        if (instance == null) instance = new Logger(); //Create instance if it doesn't exist

        return instance;
    }

    //Method to output message
    public void log(String ms) {
        System.out.println("Log: " + ms);
    }

    /*The Singleton pattern ensures that only one instance of the Logger class is created*/
}
