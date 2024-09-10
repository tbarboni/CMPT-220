import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt for input
        System.out.print("Please input an integer:");
        int num = input.nextInt();
        // Calculate and print result based on input
        if (num < 0) {
            System.out.print("The square of " + num + " is " + (num * num));
        }
        if (num > 0) {
            System.out.print("The square root of " + num + " is " + Math.sqrt(num));
        }
        if (num == 0) {
            System.out.print("The number is zero");
        }
        
        input.close();
    }
}
