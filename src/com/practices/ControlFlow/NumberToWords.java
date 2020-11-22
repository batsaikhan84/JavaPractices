package com.practices.ControlFlow;

public class NumberToWords {
    public static void main(String[] args) {
//        System.out.println(getDigitCount(0));
//        System.out.println(reverse(123));
        numberToWords(123954);
    }
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reverseNumber = reverse(number);
            while (reverseNumber > 0) {
                int numberDigit = reverseNumber % 10;
                switch (numberDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reverseNumber /= 10;
            }

        }
    }
    public static int reverse(int number) {
        int reverseNumber = 0;
        while (number > 0) {
            int numberDigit = number % 10;
            reverseNumber = reverseNumber * 10 + numberDigit;
            number /= 10;
        }
        return reverseNumber;
    }
    public static int getDigitCount(int number) {
        int counter = 1;
        if (number < 0) {
            return -1;
        } else {
            while (number >= 10) {
                counter++;
                number /= 10;
            }
        }
        return counter;
    }
}
