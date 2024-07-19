/*NUMBER-INCREASING REVERSE PYRAMID PATTERN
Use the java loops to print number-increasing reverse pyramid pattern.
Expected output:
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1 */

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        // Define the maximum number in the first row
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number:");
        int number=sc.nextInt();

        // Outer loop for each row
        for (int i = number; i >= 1; i--) {
            // Inner loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}