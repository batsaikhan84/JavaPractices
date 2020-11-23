package com.practices.ControlFlow;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
    }
    public static void printSquareStar(int number) {
        if (number >= 5) {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (j == number || j == 1 || i == number || i == 1 || j == number - i + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
