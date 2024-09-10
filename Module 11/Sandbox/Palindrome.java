import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        System.out.println("Is " + word + " a palindrome? " + isPalindrome(word));
        
    }
    private static boolean isPalindrome(String word) {
        return isPalindrome(word, 0, word.length() - 1);
    }
    private static boolean isPalindrome(String word, int low, int high) {
        if (low >= high) {
            return true;
        } else if (word.charAt(low) == word.charAt(high)) {
            return isPalindrome(word, low + 1, high - 1);
        } else {
            return false;
        }
        // if (word.length() <= 1) {
        //     return true;
        // } else if (word.charAt(0) == word.charAt(word.length() - 1)) {
        //     return isPalindrome(word.substring(1, word.length() - 1));
        // } else {
        //     return false;
        // }
    }
}
