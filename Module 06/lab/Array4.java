/**************************************************************************************
 * Program: Array4.java
 * Date:    October 2023
 * This program demonstrates the use of arrays in storing data.
 * The student will enter and process data according to the exercises.
**************************************************************************************/

public class Array4 {

    public static void main(String[] args) {

        int[][] array = new int[3][5];
        int value = 0;

        // Initialize the 3x5 array using nested for loops
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = value;
                value++;
            }
        }

        // Display the values in the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
        /*
            Output:
                0 1 2 3 4 
                5 6 7 8 9
                10 11 12 13 14
         */
    }
}