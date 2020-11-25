package com.practices;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter number between 1 - 9");
//        while (true) {
//            int userInput = scanner.nextInt();
//            System.out.println("You entered: " + userInput);
//        }
        printingInput(9);
    }
    public static void printingInput(int userInput) {
        String[] arrayXO = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
        for (int i = 0; i < arrayXO.length; i++) {
            if (userInput - 1 == i) {
                arrayXO[i] = "x";
            }
        }
        System.out.println("|" + arrayXO[0] + "|" + arrayXO[1] + "|" + arrayXO[2] + "|");
        System.out.println("-------");
        System.out.println("|" + arrayXO[3] + "|" + arrayXO[4] + "|" + arrayXO[5] + "|");
        System.out.println("-------");
        System.out.println("|" + arrayXO[6] + "|" + arrayXO[7] + "|" + arrayXO[8] + "|");
    }
}
