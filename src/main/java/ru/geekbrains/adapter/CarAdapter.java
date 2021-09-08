package ru.geekbrains.adapter;

public class CarAdapter implements BasicCar {

    private XenonLightsCar xenonLightsCar;

    public CarAdapter(XenonLightsCar xenonLightsCar) {
        this.xenonLightsCar = xenonLightsCar;
    }

    public void drive() {
        xenonLightsCar.drive();
    }

    public void lightOn() {
        xenonLightsCar.xenonOn();
    }

    public void lightOff() {
        xenonLightsCar.xenonOff();
    }

    public void stop() {
        xenonLightsCar.stop();
    }
}
