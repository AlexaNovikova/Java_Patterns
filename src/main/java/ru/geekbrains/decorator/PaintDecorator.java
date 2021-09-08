package ru.geekbrains.decorator;

public class PaintDecorator implements Painter {

    protected Painter painter;

    public PaintDecorator(Painter painter) {
        this.painter = painter;
    }

    public void paint(Shape shape) {
        painter.paint(shape);
    }

}
