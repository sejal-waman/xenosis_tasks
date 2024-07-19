/*JAVA PROGRAM FOR DECIMAL TO HEXADECIMAL CONVERSION
Given a decimal number N, convert N into an equivalent hexadecimal number i.e. convert the
number with base value 10 to base value 16. The decimal number system uses 10 digits 0-9
and the Hexadecimal number system uses 0-9, A-F to represent any numeric value.*/
//Assignment-1

import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        
        // Convert the decimal number to hexadecimal
        String hexadecimalNumber = convertDecimalToHexadecimal(decimalNumber);
        
        // Display the result
        System.out.println("Hexadecimal equivalent: " + hexadecimalNumber);
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to convert decimal to hexadecimal
    public static String convertDecimalToHexadecimal(int decimalNumber) {
        // Check if the number is zero
        if (decimalNumber == 0) {
            return "0";
        }
        
        // String to store the hexadecimal result
        StringBuilder hexString = new StringBuilder();
        
        // Hexadecimal characters
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
        // Convert decimal to hexadecimal
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 16;
            hexString.insert(0, hexChars[remainder]);
            decimalNumber /= 16;
        }
        
        // Return the hexadecimal result as a string
        return hexString.toString();
    }
}