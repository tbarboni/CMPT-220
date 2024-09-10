// *******************************************************************
// DigitPlay.java
//
// Finds the number of digits in a positive integer.
// *******************************************************************
import java.util.Scanner;
public class DigitPlay {
    public static void main (String[] args) {
        int num; //a number
        Scanner scan = new Scanner(System.in);
        System.out.println ();
        System.out.print ("Please enter a positive integer: ");
        num = scan.nextInt ();
        if (num <= 0)
        System.out.println ( num + " isn't positive -- start over!!");
        else {
        // Call numDigits to find the number of digits in the number
        // Print the number returned from numDigits
        System.out.println ("\nThe number " + num + " contains " +
        + numDigits(num) + " digits. The sum of the digits is " + sumDigits(num) + ".");
        System.out.println ();
        // Call sumDigits to find the sum of digits in the identification number
        int sum = sumDigits(num);
        // Check if the sum is divisible by 7
            if (sum % 7 != 0) {
                System.out.println("The identification number " + num + " is in error.");
            } else {
                System.out.println("The identification number " + num + " is ok.");
            }
        }

    }
// -----------------------------------------------------------
// Recursively counts the digits in a positive integer
// -----------------------------------------------------------
    public static int numDigits(int num) {
        if (num < 10)
            return 1;
        else
            return 1 + numDigits(num/10);
        }
    public static int sumDigits(int num) {
        if (num < 10) {   // base case
            return num;
        } else {
            return num % 10 + sumDigits(num/10); // recursive case
        }
    }
}