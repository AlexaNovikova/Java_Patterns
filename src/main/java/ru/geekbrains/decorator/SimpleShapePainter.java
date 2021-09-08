package ru.geekbrains.decorator;

public class SimpleShapePainter implements Painter{

    public void paint(Shape shape) {
        System.out.println("Shape is painted "+ shape.getColor()+ " "+ shape.getSize());
    }
}
