package org.example.SingletonPattern;

public class Logger {
    private static Logger instance;
    
    public static Logger getInstance() {
        if (instance == null) instance = new Logger();

        return instance;
    }

    public void log(String ms) {
        System.out.println("Log: " + ms);
    }
}
