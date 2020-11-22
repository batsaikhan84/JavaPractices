package com.practices.ControlFlow;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
    }
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        } else {
            int smallNumber = Math.min(first, second);
            int largeNumber = Math.max(first, second);

            for (int i = smallNumber; i > 0; i--) {
                if (smallNumber % i == 0) {
                    for (int j = largeNumber; j > 0; j--) {
                        if ((largeNumber % j == 0) && j == i) {
                            return i;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
