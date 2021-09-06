package ru.geekbrains.abstractFactory;

public class Dog implements Animal{
    public String getName() {
        return "dog";
    }

    public String makeSound() {
        return "Gav";
    }
}
