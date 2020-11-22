package com.practices.Inheritance.Automobile;

public class HondaCivic extends Car {
    public static void main(String[] args) {
        HondaCivic civic = new HondaCivic(36);
        civic.steer(30);
        civic.accelerate(15);

    }
    private int roadServiceMonth;

    public HondaCivic(int roadServiceMonth) {
        super("HondaCivic", "Sedan", 4, 3, false);
        this.roadServiceMonth = roadServiceMonth;
    }
    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else {
            changeGear(2);
        }
        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
