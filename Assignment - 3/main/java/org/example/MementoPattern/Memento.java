package org.example.MementoPattern;

public class Memento {
    private String state;

    // Constructor of Memento
    public Memento(String state) {
        this.state = state;
    }

    // Method to save and get text
    public String getState() {
        return state;
    }
}
