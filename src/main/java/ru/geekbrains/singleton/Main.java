package ru.geekbrains.singleton;

public class Main {
    public static void main(String[] args) {
        SingleInstance1 instance1 = SingleInstance1.getInstance();
        SingleInstance1 instance12 = SingleInstance1.getInstance();
        System.out.println(instance1);
        System.out.println(instance12);
    }
}
