
// This is a simple program demonstrating Elementary Programming
import java.util.Scanner;

public class Problem2 {
    // This is the main method
    public static void main(String[] args) {
        // Lines 8-16 ask and recieve input for 4 different variables
        Scanner input = new Scanner(System.in);
        System.out.println("Enter coefficient a:");
        double a = input.nextDouble();
        System.out.println("Enter coefficient b:");
        double b = input.nextDouble();
        System.out.println("Enter coefficient c:");
        double c = input.nextDouble();
        System.out.println("Enter coefficient d:");
        double d = input.nextDouble();
        System.out.println("The solution is " + ((a / b) - (c / d)));
        input.close();
    }
}