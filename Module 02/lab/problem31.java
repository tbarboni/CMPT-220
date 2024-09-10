
import java.util.Scanner;

public class problem31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for inputs
        System.out.print("Input first number: ");
        int number1 = input.nextInt();
        System.out.print("Input second number: ");
        int number2 = input.nextInt();
        System.out.print(number1 + " x " + number2 + " = " + (number1 * number2));

        input.close();
    }
}