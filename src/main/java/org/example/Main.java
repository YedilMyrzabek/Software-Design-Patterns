package org.example;

import org.example.SingletonPattern.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Log in");
        logger.log("Log");
    }
}