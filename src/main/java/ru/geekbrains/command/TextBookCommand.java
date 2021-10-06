package ru.geekbrains.command;

public abstract class TextBookCommand {
    public TextBook textBook;
    private String backUp;

    public TextBookCommand(TextBook textBook) {
        this.textBook = textBook;
    }

    public void backUp(){
        this.backUp = textBook.getText();
    }
    public void rollBack(){
        textBook.setText(backUp);
    }

    public abstract boolean execute();
}
