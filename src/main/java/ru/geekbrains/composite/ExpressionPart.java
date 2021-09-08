package ru.geekbrains.composite;

public interface ExpressionPart {

    public String getFont();
    public String getColor();
    public void setColor(String color);
    public void setFont(String font);
    public void print();
}
