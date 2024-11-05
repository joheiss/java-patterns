package com.jovisco.tutorial.patterns.memento;

import java.util.Deque;
import java.util.LinkedList;

public class EditorUsingMementoRecord {

    private final TextAreaUsingMementoRecord textArea;
    private final Deque<TextAreaUsingMementoRecord.MementoRecord> stateHistory;

    public EditorUsingMementoRecord() {
        textArea = new TextAreaUsingMementoRecord();
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
