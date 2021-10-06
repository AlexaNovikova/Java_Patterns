package ru.geekbrains.state;

public class PlayingState extends State{
    public PlayingState(Ipod ipod) {
        super(ipod);
    }

    @Override
    void onLock() {
        ipod.changeState(new LockedState(ipod));
        System.out.println("Locked");
    }

    @Override
    void onPlay() {
       ipod.changeState(new ReadyState(ipod));
        System.out.println("Ready");
    }

    @Override
    void onNext() {
       //next track
    }
}
