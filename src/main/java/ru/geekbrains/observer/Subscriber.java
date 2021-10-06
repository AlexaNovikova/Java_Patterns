package ru.geekbrains.observer;

public interface Subscriber {
    public void update(Publisher publisher, Object args);
}
