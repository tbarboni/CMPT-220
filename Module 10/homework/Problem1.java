import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter a string containing only letters and numbers: ");
                String str = input.nextLine();

                // Determine if the string contains only letters and numbers
                if (!str.matches("[a-zA-Z0-9]*")) {
                    throw new Exception("Invalid input, please input only letters and numbers.");
                }

                // If there is a valid input then print the length of the string
                System.out.println("The length of the string is " + str.length());
                break;

                // Catch the exception and print the message
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            if (input.hasNextLine()) {
                input.nextLine();
            }
        }
    }
}
