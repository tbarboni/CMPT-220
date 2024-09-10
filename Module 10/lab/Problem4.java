import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner fileScanner = null;
        while (fileScanner == null) {
            System.out.print("Enter a filename: ");
            File file = new File(input.nextLine());
            try {
                fileScanner = new Scanner(file);
            } catch (FileNotFoundException e) {
                System.out.println("404: File not found");
            }
        }
        while (fileScanner.hasNextLine()) {
            System.out.println(fileScanner.nextLine());
        }
        fileScanner.close();
    }
}

