package com.jovisco.tutorial.patterns.memento;

public class MementoClient {

    public static void main(String[] args) {

        Editor editor = new Editor();
        editor.write("Hello, World!");
        editor.printText();
        editor.write("Playing with Memento Pattern");
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();

        var editorUsingMementoRecord = new EditorUsingMementoRecord();
        editorUsingMementoRecord.write("Hello, People!");
        editorUsingMementoRecord.printText();
        editorUsingMementoRecord.write("Playing with Memento Pattern - using record");
        editorUsingMementoRecord.printText();
        editorUsingMementoRecord.undo();
        editorUsingMementoRecord.printText();
        editorUsingMementoRecord.undo();
        editorUsingMementoRecord.printText();
    }
}
