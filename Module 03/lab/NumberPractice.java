import java.util.Scanner;
public class NumberPractice {
    public static void main(String[] args) {
        //Identify variables and request numeric inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number");
        int num1 = input.nextInt();
        System.out.print("Enter the second number");
        int num2 = input.nextInt();
        System.out.print("Enter the third number");
        int num3 = input.nextInt();
        System.out.print("Enter the fourth number");
        int num4 = input.nextInt();
        int smallest = 0;
        int largest = 0;
        // Compare the inputs to find the largest and smallest numbers.
        if (num1 > num2) {
            largest = num1;
        } else {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        if (num4 > largest) {
            largest = num4;
        }
        if (num1 < num2) {
            smallest = num1;
        } else {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        if (num4 < smallest) {
            smallest = num4;
        }
        // Output numbers
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Number 3: " + num3);
        System.out.println("Number 4: " + num4);
        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);
        input.close();
    }
}
