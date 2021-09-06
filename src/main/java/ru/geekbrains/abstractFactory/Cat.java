package ru.geekbrains.abstractFactory;

public class Cat implements Animal {
    public String getName() {
        return "cat";
    }

    public String makeSound() {
        return "Mau";
    }
}
