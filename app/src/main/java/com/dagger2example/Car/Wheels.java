package com.dagger2example.Car;

public class Wheels {

    //imagine this class belongs to third party library

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
