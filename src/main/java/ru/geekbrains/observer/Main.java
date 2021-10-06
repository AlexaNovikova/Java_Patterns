package ru.geekbrains.observer;

public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        sensor.subscribe(new Display2Subscriber());
        sensor.subscribe(new DisplaySubscriber());
        sensor.setT(20);
    }
}
