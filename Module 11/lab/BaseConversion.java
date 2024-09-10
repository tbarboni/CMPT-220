// ******************************************************************
// BaseConversion.java
//
// Recursively converts an integer from base 10 to another base
// ******************************************************************
import java.util.Scanner;
public class BaseConversion {
    public static void main (String[] args) {
        int base10Num;
        int base;
        Scanner scan = new Scanner(System.in);
        System.out.println ();
        System.out.println ("Base Conversion Program");
        System.out.print ("Enter an integer: ");
        base10Num = scan.nextInt();
        System.out.print ("Enter the base: ");
        base = scan.nextInt();
        // Call convert and print the answer
        System.out.println("Number: " + base10Num + " Base: " + base + " ---> " + convert(base10Num, base));
        scan.close();
    }
// --------------------------------------------------
// Converts a base 10 number to another base.
// --------------------------------------------------
    public static String convert (int num, int b) {
        int quotient; // the quotient when num is divided by base b
        int remainder; // the remainder when num is divided by base b
        String temp = "";
        if (num < b) {
            return Integer.toString(num);
        } else {
            quotient = num / b; // integer division
            remainder = num % b;
            temp = convert(quotient, b) + Integer.toString(remainder);
            return temp;
        }
    }
}