package ru.geekbrains.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {
    private List<Subscriber> subscribers = new ArrayList<Subscriber>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    protected void notify(Object args) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this, args);
        }
    }
}
