package ru.geekbrains.command;

public class CopyCommand extends TextBookCommand {

    public CopyCommand(TextBook textBook) {
        super(textBook);
    }

    public boolean execute() {
        textBook.clipboard = textBook.getSelectedText();
        return true;
    }

}
