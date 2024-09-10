import java.util.Scanner;

public class PersonsAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Ask user for age
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        // Check if age is old enough and output response
        if (age >= 16) {
            System.out.print("You are " + age + " you can drive a car and stay out past 10 p.m.");
        } else {
            System.out.print("You are " + age + " years old. You cannot do anything.");
        }
        input.close();
    }
}
