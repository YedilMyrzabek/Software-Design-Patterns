package org.example.MementoPattern;

public class CareTaker {
    private Memento memento;

    // Method to save the memento
    public void saveMemento(Memento memento) {
        // Saving Memento
        this.memento = memento;
    }

    // Method to get the saved memento
    public Memento getMemento() {
        // Restoring from Memento
        return memento;
    }
}
