package ru.geekbrains.visitor;

public class Circle implements Shape{

    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Move circle");
    }

    @Override
    public void draw() {
        System.out.println("Draw circle");
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int getRadius() {
        return radius;
    }
}
