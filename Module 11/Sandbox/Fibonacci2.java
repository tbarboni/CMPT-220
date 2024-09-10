import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number for the fibonacci index: ");
        int num = input.nextInt();
        System.out.println("The fibonacci number at index " + num + " is " + fibonacci(num));
    }

    private static long fibonacci(int num, long[] fibArray) {
        if (num == 1 || num == 2) {
            return 1;
        } 
        if (fibArray[num] != 0) {
            return fibArray[num];
        }
        long result = fibonacci(num - 1, fibArray) + fibonacci(num - 2, fibArray);
        fibArray[num] = result;
        return result;
        }
    
    private static long fibonacci(int num) {
        long[] fibArray = new long[num + 1];
        return fibonacci(num, fibArray);
    }
}