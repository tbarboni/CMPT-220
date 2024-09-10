import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println("factorial(" + n + ") = " + factorial(n));

    }

    // A function designed to find the factorial of a given number.
    public static long factorial(int n) {
        
        // Check if n = 0 or 1, and if so fact = 1
        if (n == 0 || n == 1) {
            long fact = 1;
            return fact;
        }else {
            long fact = 1;
            for (int i = 2; i <= n; i++) {
                fact *= i; // Get the result (result i = result)
            }
            return fact;
        }

    }

}
