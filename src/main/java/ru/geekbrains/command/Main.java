package ru.geekbrains.command;

public class Main {

    public static TextBook textBook;
    public static CopyCommand copyCommand;
    public static PasteCommand pasteCommand;

    public static void main(String[] args) {
        textBook= new TextBook();
        copyCommand = new CopyCommand(textBook);
        pasteCommand = new PasteCommand(textBook);
        textBook.setText("text");
        copyText();
        System.out.println(textBook.getText());
        pasteText();
        System.out.println(textBook.getText());
        rollBack();
        System.out.println(textBook.getText());
        rollBack();
        System.out.println(textBook.getText());
        copyText();
        pasteText();
        pasteText();
        System.out.println(textBook.getText());
    }

    private static void rollBack() {
        pasteCommand.rollBack();
    }

    public static void copyText(){
        copyCommand.execute();
    }
    public static void pasteText(){
        pasteCommand.backUp();
        pasteCommand.execute();
    }

}
