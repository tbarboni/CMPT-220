
/**************************************************************************************
 * Program: Array3.java
 * Date:    October 2023
 * This program demonstrates the use of arrays in storing data.
 * The student will enter and process data according to the exercises.
**************************************************************************************/

import java.util.Scanner;

public class Array3 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        final int SIZE = 3;           // The size of our array
        int[] array1 = new int[SIZE]; // Array declaration
        int[] array2 = {5,10,15};     // Array2 declaration
        int[] bigArray = new int[SIZE*2]; // bigArray declaration

        // Prompt to enter 'SIZE' number of integers
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter an integer: ");
            array1[i] = input.nextInt();
        }


        // Use a single loop to place values from array1 and array2 into bigArray
        int sum = 0; // Initialize the sum
        for (int i = 0; i < bigArray.length; i++) {
            if (i < SIZE) {
                bigArray[i] = array1[i];
                sum += array1[i]; // Add array1 values to the sum
            } else {
                bigArray[i] = array2[i - SIZE];
                sum += array2[i - SIZE]; // Add array2 values to the sum
            }
        }

        // Output the values in bigArray
        System.out.print("Values in bigArray: ");
        for (int i = 0; i < bigArray.length; i++) {
            System.out.print(bigArray[i] + " ");
        }
        
        // Output the sum of all values in bigArray
        System.out.println("\nSum of all values in bigArray: " + sum);
        /*
        Output:
            Enter an integer: 1
            Enter an integer: 2
            Enter an integer: 3
            Values in bigArray: 1 2 3 5 10 15
            Sum of all values in bigArray: 36 
        */
    }        
}
