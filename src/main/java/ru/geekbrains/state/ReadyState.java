package ru.geekbrains.state;

public class ReadyState extends State{

    public ReadyState(Ipod ipod) {
        super(ipod);
    }

    @Override
    void onLock() {
        ipod.changeState(new LockedState(ipod));
        System.out.println("Locked");
    }

    @Override
    void onPlay() {
        ipod.changeState(new PlayingState(ipod));
        System.out.println("Play");
    }

    @Override
    void onNext() {
       // next track
    }
}
