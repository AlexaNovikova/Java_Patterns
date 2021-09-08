package ru.geekbrains.bridge;

public class Main {
    public static void main(String[] args) {
        Product product1 = new CentralLocking("Central Locking System");
        Product product2 = new GearLocking("Gear Locking System");
        Car car = new BigWheel(product1, "BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car = new Motoren(product1, "Motoren lm model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();


        car = new BigWheel(product2, "BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

    }
}
