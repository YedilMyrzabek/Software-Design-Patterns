package org.example.MementoPattern;

public class MementoPatternExample {
    public static void main(String[] args) {
        // Create TextEditor's object
        TextEditor editor = new TextEditor();

        // Create Caretaker's object
        CareTaker caretaker = new CareTaker();

        // Write some text
        editor.write("Hello, Astana!");

        // Save the current text using the Memento
        caretaker.saveMemento(editor.save());

        // Change the text
        editor.write("Hello, Almaty!");

        // Return previous text with Memento
        editor.restore(caretaker.getMemento());
    }
}
