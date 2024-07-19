/*WRITE A PROGRAM THAT HANDLES EXCEPTIONS BY USING TRY, CATCH, AND FINALLY BLOCKS
Requirement:
Write a Java program that prompts the user to input a number.
Attempt to divide a fixed number (e.g., 10) by the user-provided number.
Use try, catch, and finally blocks to handle any potential exceptions (e.g., division by
zero).
Print appropriate messages in the catch block for exceptions.
Ensure the finally block is executed to perform any cleanup operations (e.g., closing
resources). */

import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fixedNumber = 10;

        try {
            // Prompt the user to input a number
            System.out.print("Enter a number to divide 10 by: ");
            int userInput = scanner.nextInt();

            // Attempt to divide the fixed number by the user provided number
            int result = fixedNumber / userInput;

            // Print the result of the division
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("Error: An unexpected error occurred.");
        } finally {
            // Perform cleanup operations
            System.out.println("Cleaning up resources....finally always executes");
            scanner.close();
        }
    }
}