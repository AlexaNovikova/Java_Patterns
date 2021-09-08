package ru.geekbrains.adapter;

public class Main {
    public static void main(String[] args) {
        BasicCar suzuki = new Suzuki();
        XenonLightsCar audi = new Audi();
        CarManagement carManagementSuzuki = new CarManagement(suzuki);
        CarAdapter audiAdapted = new CarAdapter(audi);
        CarManagement carManagementAudi = new CarManagement(audiAdapted);
        carManagementAudi.driveCar();
        carManagementAudi.stopCar();
        carManagementSuzuki.driveCar();
        carManagementSuzuki.stopCar();

    }
}
