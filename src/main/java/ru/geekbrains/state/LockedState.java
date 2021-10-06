package ru.geekbrains.state;

public class LockedState extends  State{
    public LockedState(Ipod ipod) {
        super(ipod);
    }

    @Override
    void onLock() {

    }

    @Override
    void onPlay() {

    }

    @Override
    void onNext() {

    }
}
