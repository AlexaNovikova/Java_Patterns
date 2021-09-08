package ru.geekbrains.composite;

public class PunctuationMark extends BaseExpressionPart {
    private final char symbol;

    public PunctuationMark(char symbol, String font, String color) {
        super(symbol, font, color);
        this.symbol = symbol;
    }

}
