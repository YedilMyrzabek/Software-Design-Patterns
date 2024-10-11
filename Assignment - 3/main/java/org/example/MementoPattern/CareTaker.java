package org.example.MementoPattern;

public class CareTaker {
    private Memento memento;

    // Method to save the memento
    public void saveMemento(Memento memento) {
        System.out.println("Caretaker: Saving Memento...");
        this.memento = memento;
    }

    // Method to get the saved memento
    public Memento getMemento() {
        System.out.println("Caretaker: Restoring from Memento...");
        return memento;
    }
}
