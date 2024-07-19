/*HOLLOW DIAMOND PYRAMID
Write a java program to print Hollow Diamond Pattern, use Java Loops to print this pyramid*/

import java.util.Scanner;

public class HollowDiamondPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows for the diamond
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Print the upper part of the diamond
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print dots and spaces for the hollow part
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print(".");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line
            System.out.println();
        }

        // Print the lower part of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print dots and spaces for the hollow part
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print(".");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}