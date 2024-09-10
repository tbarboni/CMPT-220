
/**************************************************************************************
 * Program: Array2.java
 * Date:    October 2023
 * This program demonstrates the use of arrays in storing data.
 * The student will enter and process data according to the exercises.
**************************************************************************************/

import java.util.Scanner;

public class Array2 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        final int SIZE = 3;           // The size of our array
        int[] array1 = new int[SIZE]; // Array declaration
        int[] array2 = {5,10,15};     // Array2 declaration
        int[] array3 = new int[SIZE]; // Array3 declaration
        
        // Prompt to enter 'SIZE' number of integers
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter an integer: ");
            array1[i] = input.nextInt();
        }

        // Calculate and output the sum of the numbers
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i]+ array2[i];
        }

        // Output the results of array1 + array2 and put it into array3
        System.out.println("Summation of array1 + array2:");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array1[i] + " + " + array2[i] + " = " + array3[i]);
        }
        
        /*
        Output:
            Enter an integer: 1
            Enter an integer: 2
            Enter an integer: 3
            Summation of array1 + array2:
            1 + 5 = 6
            2 + 10 = 12
            3 + 15 = 18
         */
    }
}