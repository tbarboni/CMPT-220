import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = input.nextLine();

        try {
            PrintWriter out = new PrintWriter("output.txt");

            out.println(str);

            out.close();

            System.out.println("Text has been written to output.txt");

        } catch (FileNotFoundException e) {
            System.out.println("An error occured while trying to write to the file: " + e.getMessage());
        }
    }
}
