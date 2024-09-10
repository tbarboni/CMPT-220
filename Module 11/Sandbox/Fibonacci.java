import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number for the fibonacci index: ");
        int num = input.nextInt();
        System.out.println("The fibonacci number at index " + num + " is " + fibonacci(num));
    }

    private static long fibonacci(int num) {
        if (num == 1 || num == 2) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}