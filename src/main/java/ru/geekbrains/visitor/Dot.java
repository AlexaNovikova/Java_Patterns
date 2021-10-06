package ru.geekbrains.visitor;

public class Dot implements Shape{
    private int x;
    private int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Move dot");
    }

    @Override
    public void draw() {
        System.out.println("draw dot");
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitDot(this);
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
