package com.myapp.entities;

public class Car {
    private final String brand;
    private final int enginePower;
    private final double v;

    public Car(String brand, int enginePower, double v) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.v = v;
    }

    public void start() {
        System.out.println("Ka-Boom");
    }

    public void fuelDelivery() {
        System.out.println("*delivered*");
    }

    public void showCarSpecs() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", enginePower=" + enginePower +
                ", v=" + v +
                '}';
    }
}
