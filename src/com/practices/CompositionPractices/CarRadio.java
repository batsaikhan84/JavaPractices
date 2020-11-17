package com.practices.CompositionPractices;

public class CarRadio {
    private String brand;
    private boolean isDigital;

    public CarRadio(String brand, boolean isDigital) {
        this.brand = brand;
        this.isDigital = isDigital;
    }
    public void play() {
        System.out.println("Playing a song");
    }

    public String getBrand() {
        return brand;
    }

    public boolean isDigital() {
        return isDigital;
    }
}
