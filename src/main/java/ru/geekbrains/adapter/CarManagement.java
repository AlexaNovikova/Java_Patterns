package ru.geekbrains.adapter;

public class CarManagement {
    private BasicCar basicCar;

    public CarManagement(BasicCar basicCar) {
        this.basicCar = basicCar;
    }

    public void driveCar() {
        basicCar.drive();
        basicCar.lightOn();
    }

    public void stopCar() {
        basicCar.stop();
        basicCar.lightOff();
    }
}
