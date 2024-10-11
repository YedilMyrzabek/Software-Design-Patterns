package org.example.MementoPattern;

public class TextEditor {
    private String text;

    // Method to write text
    public void write(String newText) {
        this.text = newText;
        System.out.println("TextEditor: Current content is: \"" + text + "\"");
    }

    // Method to save the current text in a Memento
    public Memento save() {
        System.out.println("TextEditor: Saving current state...");
        return new Memento(text);
    }

    // Method to restore the text from a Memento
    public void restore(Memento memento) {
        this.text = memento.getState();
        System.out.println("TextEditor: Restoring content to: \"" + text + "\"");
    }
}
