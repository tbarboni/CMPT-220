import java.util.Scanner;

public class Step9 {
    public static void main(String[] args) {
        // Step nine finds the first, second, third, and fourth power
        // or a set of numbers starting from 1 to the number the user inputs

        // Gather inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the largest of the whole numbers: ");
        int n = input.nextInt();

        // Process and output results
        System.out.println("n\tn^2\tn^3\tn^4");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "\t" + Math.pow(i, 2) + "\t" + Math.pow(i, 3) + "\t" + Math.pow(i, 4));
        }
    }
}
