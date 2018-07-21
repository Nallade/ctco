package solvita;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number: ");
        Integer baseLength = reader.nextInt();
        reader.close();
        System.out.println(baseLength);
    }
}
