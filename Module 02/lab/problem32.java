import java.util.Scanner;

public class problem32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get three numbers
        System.out.print("What are the three numbers");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        // Calculate the average
        double avg = ((n1 + n2 + n3) / 3);
        // Output the result
        System.out.print("The average of " + n1 + " + " + n2 + " + " + n3 + " = " + avg);
        input.close();
    }

}
