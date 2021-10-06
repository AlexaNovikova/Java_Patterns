package ru.geekbrains.mediator;

public class Main {
    public static void main(String[] args) {

        Fan fan = new Fan();
        Button button = new Button();
        Pult pult = new Pult(button, fan);
        fan.setPult(pult);
        button.setPult(pult);
        pult.press();
        pult.press();
    }
}
