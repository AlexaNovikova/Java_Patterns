package ru.geekbrains.decorator;


public class Shape {
    private String shapeName;
    private String color;
    private int size;

    public Shape(String shapeName, String color, int size) {
        this.shapeName = shapeName;
        this.color=color;
        this.size = size;
    }

    public Shape(Shape shape){
        this.shapeName = shape.shapeName;
        this.size = shape.size;
        this.color = shape.color;
    }

    public String getShapeName() {
        return shapeName;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    protected void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public Shape clone(){
        return new Shape(this);
    }

}
