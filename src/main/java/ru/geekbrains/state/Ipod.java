package ru.geekbrains.state;

public class Ipod {
    private State state;
    private boolean playing = false;

    public Ipod() {
        this.state = new ReadyState(this);
    }

    public void changeState(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
