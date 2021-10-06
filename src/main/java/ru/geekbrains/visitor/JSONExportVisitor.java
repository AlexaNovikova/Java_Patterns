package ru.geekbrains.visitor;

import java.util.List;

public class JSONExportVisitor implements  Visitor{

    public String export(List<Shape> shapes){
        StringBuffer stringBuffer = new StringBuffer();
        for (Shape shape: shapes){
            String rez = shape.accept(this);
            stringBuffer.append(rez);
        }
        return stringBuffer.toString();
    }
    @Override
    public String visitDot(Dot dot) {
        return "{'x': " + dot.getX()+ ", 'y': " + dot.getY()+"} ";
    }

    @Override
    public String visitCircle(Circle circle) {
        return "{'x': " + circle.getX()+ ", 'y': " + circle.getY()+ ", 'radius': " + circle.getRadius()+ "} ";
    }
}
