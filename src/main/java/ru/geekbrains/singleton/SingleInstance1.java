package ru.geekbrains.singleton;

public class SingleInstance1 {

    private static final SingleInstance1 INSTANCE = new SingleInstance1();

    private SingleInstance1(){

    }

    public static SingleInstance1 getInstance(){
        return INSTANCE;
    }
}
