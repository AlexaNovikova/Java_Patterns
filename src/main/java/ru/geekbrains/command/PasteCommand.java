package ru.geekbrains.command;

public class PasteCommand extends TextBookCommand {

    public PasteCommand(TextBook textBook) {
        super(textBook);
    }

    public boolean execute() {
      String text = textBook.getText();
      text+=textBook.clipboard;
      textBook.setText(text);
      return true;
    }
}
