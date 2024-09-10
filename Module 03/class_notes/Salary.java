import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get the current salary and performance rating
        System.out.print("Enter the current salary: ");
        double currentSalary = input.nextDouble();
        System.out.print("Enter the performance rating: ");
        double rating = input.nextDouble();
        double raise = 0;
        // Compute the raise -- Use if ... else ...
        if (rating == 1) {
            raise = currentSalary * 0.06;
        } else if (rating == 2) {
            raise = currentSalary * 0.04;
        } else if (rating == 1) {
            raise = currentSalary * 0.015;
        }
        // Print the results
        System.out.println("Amount of your raise: $" + (int) (raise * 100) / 100.0);
        System.out.println("Your new salary: $" +
                (int) ((currentSalary + raise) * 100) / 100.0);
    }
}
