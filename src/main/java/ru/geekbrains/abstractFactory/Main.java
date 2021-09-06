package ru.geekbrains.abstractFactory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.create("dog");
        System.out.println(animal.getName());
        System.out.println(animal.makeSound());
        Animal animal1 = animalFactory.create("cat");
        System.out.println(animal1.getName());
        System.out.println(animal1.makeSound());
    }
}
