package com.practices.Polymorphism;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(isValid(71));
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            int counter = 0;
            while (counter < 3) {
                while (num1 > 0) {
                    int num1Digit = num1 % 10;
                    int num2Temp = num2;
                    while (num2Temp > 0) {
                        int num2Digit = num1 % 10;
                        if (num1Digit == num2Digit) {
                            counter += 1;
                        }
                        int num3Temp = num3;
                        while (num3Temp > 0) {
                            int num3Digit = num3Temp % 10;
                            if (num2Digit == num3Digit) {
                                counter += 1;
                                if (counter >= 2) {
                                    return true;
                                }
                            }
                            num3Temp /= 10;
                        }
                        num2Temp /= 10;
                    }
                    num1 /= 10;
                }
            }
        }
        return false;
    }
    public static boolean isValid(int num) {
        if (num >= 10 && num <= 1000) {
            return true;
        }
        return false;
    }
}
