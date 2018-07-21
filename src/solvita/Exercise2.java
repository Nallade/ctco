package solvita;

import java.util.Scanner;

public class Exercise2 {
    private static void printStars(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print("*");
        }
    }

    private static void printSpaces(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        int consoleWidth = 80;
        Scanner reader = new Scanner(System.in);
        printSpaces((consoleWidth - 18) / 2);
        System.out.print("Base's length: ");
        int baseLength = reader.nextInt();
        reader.close();

        if (baseLength % 2 == 0) {
            for (int nStars = 2; nStars <= baseLength; nStars = nStars + 2) {
                printSpaces((consoleWidth - nStars) / 2);
                printStars(nStars);
                System.out.println();
            }
        } else {
            for (int nStars = 1; nStars <= baseLength; nStars = nStars + 2) {
                printSpaces((consoleWidth - nStars) / 2);
                printStars(nStars);
                System.out.println();
            }
        }
    }
}
