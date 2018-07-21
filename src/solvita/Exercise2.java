package solvita;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number: ");
        int baseLength = reader.nextInt();
        reader.close();

        if (baseLength % 2 == 0) {
            for (int x = 2; x <= baseLength; x = x + 2) {
                for (int n = 1; n <= x; n++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            for (int x = 1; x <= baseLength; x = x + 2) {
                for (int n = 1; n <= x; n++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
