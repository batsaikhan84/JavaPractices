package com.practices.ControlFlow;

public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(4, 18, 19));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount >= 0 || bigCount >= 0 || goal >= 0) {
            for (int i = 0; i <= bigCount; i++) {
                int bigWeight = 5 * i;
                for (int smallWeight = 0; smallWeight <= smallCount; smallWeight++) {
                    if (bigWeight + smallWeight == goal) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
