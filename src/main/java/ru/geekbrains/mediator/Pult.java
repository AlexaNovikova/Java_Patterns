package ru.geekbrains.mediator;

public class Pult implements PultMediator{

    private Button button;
    private Fan fan;


    public Pult(Button button, Fan fan) {
        this.button = button;
        this.fan = fan;
    }

    public void press() {
        if(fan.isOn()){
            fan.turnOff();
        }
        else {
            fan.turnOn();
        }
    }
}
