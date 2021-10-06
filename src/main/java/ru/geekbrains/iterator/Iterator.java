package ru.geekbrains.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T getNext();
    void reset();
}
