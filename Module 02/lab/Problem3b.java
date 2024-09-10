import java.util.Scanner;

public class Problem3b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get the inputs
        System.out.print("What is your first (or full) name: ");
        String name = input.next();
        System.out.print("What is the price per gallon of gasoline paid at the time of your last fill-up: ");
        double ppg = input.nextDouble();
        System.out.print("What is the total amount paid for the fill up");
        double gasTotal = input.nextDouble();
        System.out.print("Initial odometer reading: ");
        int iniOdo = input.nextInt();
        System.out.print("Final odometer reading: ");
        int finOdo = input.nextInt();

        // Calculate the miles per gallon
        int totalMiles = (finOdo - iniOdo);
        double totalGas = (gasTotal / ppg);
        double mpg = (totalMiles / totalGas);

        // Output the result
        System.out.println(name + ", you drove " + totalMiles + " miles using " + totalGas + " with an mpg of " + mpg);
        input.close();
    }
}
/*
 * Output from Tests
 * Tristan, you drove 135 miles using 7.130281690140845 with an mpg of
 * 18.933333333333334
 * Frank, you drove 521 miles using 18.25581395348837 with an mpg of
 * 28.538853503184715
 * Ruth, you drove 75 miles using 6.098666666666667 with an mpg of
 * 12.29777000437254
 * Gail, you drove 311 miles using 10.0 with an mpg of 31.1
 */
