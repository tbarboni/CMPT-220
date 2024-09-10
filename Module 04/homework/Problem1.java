import java.util.Scanner;

// This is a program to find the next prime number after user input
public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for two integer numbers
        System.out.print("Enter two integer numbers: ");

        // Assign the two integer numbers to variables and find their product
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int product = (n1 * n2);

        // Initialize p
        int p = product + 1;

        // While loop to find the next prime number
        while (true) {

            // for loop to check for prime numbers
            boolean prime = (true);
            for (int i = 2; (i * i) <= p; i++) {
                if (p % i == 0) {
                    prime = false;
                    break;
                }
            }

            // Check if number is prime and if so print prime.
            if (prime) {
                System.out.println("The next prime number after the product is " + p);
                break;
            }
            p++;
            input.close();
        }
    }
}
