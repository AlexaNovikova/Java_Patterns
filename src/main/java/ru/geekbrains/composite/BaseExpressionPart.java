package ru.geekbrains.composite;

public class BaseExpressionPart implements ExpressionPart {

    private String font;
    private String color;
    private final char symbol;

    public BaseExpressionPart(char symbol, String font, String color) {
        this.symbol = symbol;
        this.font = font;
        this.color = color;
    }


    public String getFont() {
        return font;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public void print() {
        System.out.print(symbol);
    }

}
