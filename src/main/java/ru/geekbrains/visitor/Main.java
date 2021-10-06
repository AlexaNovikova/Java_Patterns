package ru.geekbrains.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dot dot = new Dot(3,4);
        Dot dot2 = new Dot(4, 7);
        Circle circle = new Circle(1,2,3);
        Circle circle2 = new Circle(4,5,3);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(dot);
        shapes.add(dot2);
        shapes.add(circle);
        shapes.add(circle2);
        JSONExportVisitor jsonExportVisitor = new JSONExportVisitor();
        String jsonString = jsonExportVisitor.export(shapes);
        System.out.println(jsonString);
    }
}
