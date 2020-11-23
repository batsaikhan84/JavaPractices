package com.practices.UserInput;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }
    public static void inputThenPrintSumAndAverage () {
        int sum = 0;
        long avg = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;

            } else {
                break;
            }
            avg = Math.round((double) sum / count);
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
