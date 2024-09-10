import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Gather inputs from user.
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        int ta = input.nextInt();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        int v = input.nextInt();
        // Check for errors in input
        if (ta > 41) {
            System.out.print("The temperature is out of range.");
            System.exit(0);
        }
        if (ta < -58) {
            System.out.print("The temperature is out of range.");
            System.exit(0);
        }
        if (v < 2) {
            System.out.print("The temperature is out of range.");
            System.exit(0);
        }
        // Calculate windChill and print appropriate output.
        double windChill = (35.74 + (0.6215 * ta)
                - (35.75 * (Math.pow(v, 0.16)) + (0.4275 * ta * (Math.pow(v, 0.16)))));
        if (windChill < -21) {
            System.out.print("EXTREMELY COLD. Frostbite likely. Outdoor activity becomes dangerous.");
        } else if (windChill < 0) {
            System.out.print("BITTER COLD. Frostbite possible");
        } else if (windChill < 15) {
            System.out.print("VERY COLD. Very Unpleasent");
        } else if (windChill < 30) {
            System.out.print("COLD. Unpleasent");
        }
        input.close();
    }

}
