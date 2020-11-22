package com.practices.Composition;

public class Car {
    private String make;
    private String mark;
    private CarKey key;
    private CarSeat seat;
    private CarRadio radio;

    public Car(String make, String mark, CarKey key, CarSeat seat, CarRadio radio) {
        this.make = make;
        this.mark = mark;
        this.key = key;
        this.seat = seat;
        this.radio = radio;
    }

    public void moving() {
        System.out.println("Car is moving.");
    }
    public void startingCar() {
        key.start();
    }
    public void moveSeat() {
        seat.move();
    }
    public void playRadio() {
        radio.play();
    }
}
