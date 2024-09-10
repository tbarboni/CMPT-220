/*
 *  Title: Problem2.java   
 *  Description: This is a program that prompts the user to
 *               enter the size of the lists and two lists of numbers and 
 *               calculates the sum of the products of the corresponding 
 *               elements of two lists
 *  Author: Tristan Barboni
 *  Date: 10/19/2023  
 */
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.print("The new string is: " + reverseCase(s));
    }

    // A function deigned to reverse the case of a given string. For example London
    // becomes lONDON.
    public static String reverseCase(String s) {
        StringBuilder str = new StringBuilder(s);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                str.setCharAt(i, Character.toUpperCase(c));
            } else {
                str.setCharAt(i, Character.toLowerCase(c));
            }
        }
        return str.toString();
    }
}
