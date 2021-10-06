package ru.geekbrains.mediator;

public class Button {
    private PultMediator pult;


    public void setPult(PultMediator pult) {
        this.pult = pult;
    }

    public void press(){
        pult.press();
    }
}
