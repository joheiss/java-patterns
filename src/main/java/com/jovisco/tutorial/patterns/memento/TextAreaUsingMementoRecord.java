package com.jovisco.tutorial.patterns.memento;

public class TextAreaUsingMementoRecord {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public MementoRecord save() {
        return new MementoRecord(this.text);
    }

    public void restore(MementoRecord memento) {
        this.text = memento != null ? memento.text() : null;
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
