package ru.geekbrains.adapter;

public class Suzuki implements BasicCar {
    public void drive() {
        System.out.println("Suzuki rides.");
    }

    public void lightOn() {
        System.out.println("Suzuki light on.");
    }

    public void lightOff() {
        System.out.println("Suzuki light off.");
    }

    public void stop() {
        System.out.println("Suzuki stops.");
    }
}
