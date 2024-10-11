package org.example.MementoPattern;

public class TextEditor {
    private String text;

    // Method to write text
    public void write(String newText) {
        this.text = newText;
        // Current content
        System.out.println(text);
    }

    // Method to save the current text in a Memento
    public Memento save() {
        //  Saving current state
        return new Memento(text);
    }

    // Method to restore the text from a Memento
    public void restore(Memento memento) {
        this.text = memento.getState();
        // Restoring content
        System.out.println(text);
    }
}
