package solvita;

import java.util.Scanner;

public class Exercise2 {
    private static void printStars(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Base's length: ");
        int baseLength = reader.nextInt();
        reader.close();

        if (baseLength % 2 == 0) {
            for (int nStars = 2; nStars <= baseLength; nStars = nStars + 2) {
                printStars(nStars);
                System.out.println();
            }
        } else {
            for (int nStars = 1; nStars <= baseLength; nStars = nStars + 2) {
                printStars(nStars);
                System.out.println();
            }
        }
    }
}
