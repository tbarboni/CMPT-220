import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);

        // get word from user
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();

        // convert to all upper case
        word = word.toUpperCase();

        // count frequency of each letter in string
        for (int i = 0; i < word.length(); i++) {
            try {
                counts[word.charAt(i) - 'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(word.charAt(i) + " is not a letter");
            }
        }
        // print frequencies
        System.out.println();
        for (int j = 0; j < counts.length; j++)
            if (counts[j] != 0)
                System.out.println((char) (j + 'A') + ": " + counts[j]);
        scan.close();
    }
}