package ru.geekbrains.state;

public abstract class State {
    protected Ipod ipod;

    public State(Ipod ipod) {
        this.ipod = ipod;
    }

    abstract void onLock();
    abstract void onPlay();
    abstract void onNext();
}
