package com.practices;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        String[] arrayXO = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
        String currentPlayer = "x";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number between 1 - 9");
        while (true) {
            int userInput = scanner.nextInt();
            if (arrayXO[userInput - 1] == " ") {
                arrayXO[userInput - 1] = currentPlayer;
                currentPlayer = lastPlayer(currentPlayer);
                printingInput(arrayXO);
            } else {
                System.out.println("Please choose different number");
            }

        }

    }
    public static void printingInput(String[] arrayXO) {
        System.out.println("|" + arrayXO[0] + "|" + arrayXO[1] + "|" + arrayXO[2] + "|");
        System.out.println("-------");
        System.out.println("|" + arrayXO[3] + "|" + arrayXO[4] + "|" + arrayXO[5] + "|");
        System.out.println("-------");
        System.out.println("|" + arrayXO[6] + "|" + arrayXO[7] + "|" + arrayXO[8] + "|");
    }
    public static String lastPlayer(String currentPlayer) {
        if (currentPlayer == "x") {
            return "o";
        }
        return "x";
    }
    public static void win(String[] arrayXO) {

    }
}
