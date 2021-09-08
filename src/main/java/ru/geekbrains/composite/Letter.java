package ru.geekbrains.composite;

public class Letter extends BaseExpressionPart{

    private final char letter;

    public Letter(String font, String color, char letter) {
        super(letter, font, color);
        this.letter = letter;
    }

}
