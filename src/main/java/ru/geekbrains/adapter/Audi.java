package ru.geekbrains.adapter;

public class Audi implements XenonLightsCar{

    public void drive() {
        System.out.println("Audi drives.");
    }

    public void xenonOn() {
        System.out.println("Audi xenon lights on.");
    }

    public void xenonOff() {
        System.out.println("Audi xenon lights off.");
    }

    public void stop() {
        System.out.println("Audi stops.");
    }
}
