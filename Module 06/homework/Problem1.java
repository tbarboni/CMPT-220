/*
 *  Title: Problem1.java   
 *  Description: This is a program designed to take a
 *               string and count the non-special characters.
 *  Author: Tristan Barboni
 *  Date: 10/20/2023  
 */
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the text to analyze: ");

        // Assign variables and arrays.
        String text = input.nextLine();
        text = text.replaceAll("[^a-zA-Z]", "");
        char[] charArray = new char[text.length()];
        int[] charCount = new int[text.length()];
        int count = 0;

        // Process the text and coutn the characters.
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            int charIndex = -1;
            for (int j = 0; j < count; j++) {
                if (charArray[j] == currentChar) {
                    charIndex = j;
                    break;
                }
            }
            if(charIndex != -1) {
                charCount[charIndex]++;
            } else {
                charArray[count] = currentChar;
                charCount[count] = 1;
                count ++;
            }
        }

        // Print output of list count.
        System.out.println("The characters in the text are:");
        for (int i = 0; i < count; i++) {
            System.out.println(charArray[i] + " " + charCount[i]);
        }
        
    }
}
