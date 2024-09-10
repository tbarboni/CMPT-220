
/**************************************************************************************
 * Program: Array1.java
 * Date:    October 2023
 * This program demonstrates the use of arrays in storing data.
 * The student will enter and process data according to the exercises.
**************************************************************************************/

import java.util.Scanner;

public class Array1 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        final int SIZE = 3; // The size of our array
        int[] array1 = new int[SIZE]; // Array declaration

        // Prompt to enter 'SIZE' number of integers
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter an integer: ");
            array1[i] = input.nextInt();
        }
        
        // Output the numbers entered into the array
        System.out.print("Numbers entered into the array: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        // Calculate and output the sum of the numbers
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        System.out.println("\nSum of the numbers entered: " + sum);

        /* 
        Output:
           Enter an integer: 1
           Enter an integer: 2
           Enter an integer: 3
           Numbers entered into the array: 1 2 3
           Sum of the numbers entered: 6

         */
    }
}