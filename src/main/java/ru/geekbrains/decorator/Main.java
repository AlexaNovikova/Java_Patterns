package ru.geekbrains.decorator;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("Circle", "Red", 5);
        ProfessionalShape professionalShape = new ProfessionalShape(shape);
        SimpleShapePainter simpleShapePainter = new SimpleShapePainter();
        simpleShapePainter.paint(shape);
        simpleShapePainter.paint(professionalShape);
        AdvancedShapePainter advancedShapePainter = new AdvancedShapePainter(simpleShapePainter);
        advancedShapePainter.paint(shape, "Green");
        advancedShapePainter.paint(shape, 7);
        advancedShapePainter.paint(shape, "Yellow", 10);
        simpleShapePainter.paint(shape);


        ProfessionalShapePainter professionalShapePainter = new ProfessionalShapePainter(advancedShapePainter);
        professionalShapePainter.paint(professionalShape, "Bold frame", "Glow");


    }
}
