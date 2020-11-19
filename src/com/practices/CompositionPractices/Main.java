package com.practices.CompositionPractices;

public class Main {
    public static void main(String[] args) {
        CarKey key = new CarKey("black", true);
        CarRadio radio = new CarRadio("bose", true);
        CarSeat seat = new CarSeat("leather", true);
        Car mercedes = new Car("Mercedes", "Benz", key, seat, radio);

        mercedes.moveSeat();
        mercedes.moving();
        mercedes.playRadio();
        mercedes.startingCar();
    }
}
