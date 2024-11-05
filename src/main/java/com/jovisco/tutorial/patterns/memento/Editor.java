package com.jovisco.tutorial.patterns.memento;

import java.util.Deque;
import java.util.LinkedList;

public class Editor {

    private final TextArea textArea;
    private final Deque<TextArea.Memento> stateHistory;

    public Editor() {
        textArea = new TextArea();
        stateHistory = new LinkedList<>();
    }

    public void write(String text) {
        textArea.setText(text);
        stateHistory.offer(textArea.save());
    }

    public void undo() {
        if (stateHistory.isEmpty()) return;

        stateHistory.pollLast();
        textArea.restore(stateHistory.peekLast());
    }

    public void printText() {
        System.out.println(textArea.getText());
    }
}
