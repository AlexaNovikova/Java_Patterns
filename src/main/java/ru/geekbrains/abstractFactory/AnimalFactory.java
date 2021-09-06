package ru.geekbrains.abstractFactory;

public class AnimalFactory implements AbstractFactory {
    public Animal create(String animalName) {
        switch (animalName) {
            case "dog": {
                return new Dog();
            }
            case "cat": {
                return new Cat();
            }
            default:
                return null;
        }
    }
}
