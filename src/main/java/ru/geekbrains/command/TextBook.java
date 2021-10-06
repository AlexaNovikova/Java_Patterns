package ru.geekbrains.command;

public class TextBook {
    private String text;
    public String clipboard;

    public void setText(String text) {
        this.text = text;

    }

    public String getText() {
        return text;
    }

    public String getSelectedText(){
        return " SelectedText";
    }
}
