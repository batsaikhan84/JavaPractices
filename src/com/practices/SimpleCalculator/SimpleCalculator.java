package com.practices.SimpleCalculator;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirsNumber() {
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    public void setFirsNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }
    public double getDivisionResult() {
        return firstNumber/secondNumber;
    }
}
