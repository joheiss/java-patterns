package com.jovisco.tutorial.patterns.memento;

public class TextArea {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Memento save() {
        return new Memento(this.text);
    }

    public void restore(Memento memento) {
        this.text = memento != null ? memento.getSavedText() : null;
    }

    public static class Memento {

        private final String text;

        private Memento(String textToSave) {
            this.text = textToSave;
        }

        public String getSavedText() {
            return text;
        }
    }

    public record MementoRecord(String text) {}
}
