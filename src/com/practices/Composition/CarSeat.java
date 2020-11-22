package com.practices.Composition;

public class CarSeat {
    private String materialType;
    private boolean isAutomatic;

    public CarSeat(String materialType, boolean isAutomatic) {
        this.materialType = materialType;
        this.isAutomatic = isAutomatic;
    }
    public void move() {
        System.out.println("Seat is moving");
    }
    public String getMaterialType() {
        return materialType;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }
}
