package com.practices.ControlFlow;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int unrevered = number;
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        if (reversed == unrevered) {
            return true;
        } else {
            return false;
        }
    }
}
