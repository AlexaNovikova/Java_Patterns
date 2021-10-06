package ru.geekbrains.observer;

public class Sensor extends Publisher{
    private int t;

    public int getT(){
        return t;
    }

    public void setT(int t) {
        this.t = t;
        notify(t);
    }

    @Override
    public String toString() {
        return "Sensor";
    }
}
