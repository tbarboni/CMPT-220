import java.util.Scanner;

public class Step5 {
    public static void main(String[] args) {
        
        // Set global values
        int sum = 0;
        int count = 0;
        int oddCount = 0;
        int targetCount = 0;
        int max = 0;
        
        // Gather inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value (0 to quit): ");
        int value = input.nextInt();
        System.out.print("Enter a target number: ");
        int target = input.nextInt();

        // Process Inputs and ask for more
        while (value != 0) {
            sum += value;
            if ((value % 2) == 1) {
                oddCount++;
            }
            System.out.print("Enter next value (0 to quit): ");
            value = input.nextInt();
            if (value > max) {
                max = value;
            }
            if (value == target) {
                targetCount++;
            }
            count++;

        }
        
        // Output totals
        System.out.println("The sum of the input values is " + sum);
        System.out.println("The number of inputs is " + count);
        if (count >= 1) {
            System.out.println("The average of the values is: " + ((double) sum / (double) count));
        } else if (count == 0) {
            System.out.print("You must input at least 1 non-zero value to find the average");
        }
        System.out.println("The number of odd values input is: " + oddCount);
        System.out.println("The value " + target + " was input " + targetCount + " times.");
        System.out.println("The maximum value entered was " + max);
    }

}