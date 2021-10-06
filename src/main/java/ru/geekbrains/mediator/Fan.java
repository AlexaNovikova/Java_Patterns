package ru.geekbrains.mediator;

public class Fan {
    private PultMediator pult;
    private boolean isOn;

    public Fan() {
        isOn=false;
    }

    public void setPult(PultMediator pult) {
        this.pult = pult;
    }

    public void turnOff(){
        this.isOn =false;
        System.out.println("Выключен");
    }

    public void turnOn(){
        this.isOn = true;
        System.out.println("Включен");
    }

    public boolean isOn(){
        return this.isOn;
    }
}
