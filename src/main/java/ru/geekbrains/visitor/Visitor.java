package ru.geekbrains.visitor;

public interface Visitor {
    String visitDot(Dot dot);
    String visitCircle(Circle circle);
}
