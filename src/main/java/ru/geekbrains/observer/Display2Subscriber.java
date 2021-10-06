package ru.geekbrains.observer;

public class Display2Subscriber implements Subscriber{
    public void update(Publisher publisher, Object args) {
        System.out.printf("%s temperature %s\n", publisher.toString(), args);
    }
}
