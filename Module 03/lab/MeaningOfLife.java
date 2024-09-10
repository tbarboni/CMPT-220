import java.util.Scanner;

public class MeaningOfLife {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Request inputs
        System.out.print("Enter a number: ");
        int meaning = input.nextInt();
        // Check if inputs are the meaning of life and output response
        if (meaning == 42) {
            System.out.print("You entered: " + meaning + "\nYour answer is correct");
        } else {
            System.out.print("You entered: " + meaning + "\nYou do not have the answer to life");
        }
        input.close();
    }

}
