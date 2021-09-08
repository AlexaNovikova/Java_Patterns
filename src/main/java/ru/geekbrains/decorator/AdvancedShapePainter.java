package ru.geekbrains.decorator;

public class AdvancedShapePainter extends PaintDecorator {

    public AdvancedShapePainter(Painter painter) {
        super(painter);
    }

    public void paint(Shape shape, String color) {
        Shape newShape = shape.clone();
        newShape.setColor(color);
        super.paint(newShape);
    }

    public void paint(Shape shape, int size) {
        Shape newShape = shape.clone();
        newShape.setSize(size);
        super.paint(newShape);
    }

    public void paint(Shape shape, String color, int size) {
        Shape newShape = shape.clone();
        newShape.setColor(color);
        newShape.setSize(size);
        super.paint(newShape);
    }
}
