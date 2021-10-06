package ru.geekbrains.state;

public class Main {
    public static void main(String[] args) {
        Ipod ipod = new Ipod();
        ipod.getState().onPlay();
        ipod.getState().onPlay();
    }
}
