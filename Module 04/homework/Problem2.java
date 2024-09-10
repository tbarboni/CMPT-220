/*
 * This is a program designed to calculate the 
 * square root of a positive integer.
 */

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // Gather inputs and set variables
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the a positive integer number: ");
        int x = input.nextInt();
        double n = x;

        /*
         * Execute Calculations:
         * (a) Start with an initial guess n.
         * (b) If n is close enough to the square
         * root of the number, stop. The answer is n.
         * (c) Otherwise, make a new guess by averaging
         * n and the number divided by n
         */
        while (Math.abs(n * n - x) > 0.0000001) {
            n = (n + x / n) / 2;
        }

        // Output Result
        System.out.print("The sqrt (" + x + ") is: " + n);
        input.close();
    }

}
