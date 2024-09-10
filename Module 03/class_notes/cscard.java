import java.util.Scanner;

public class cscard {
    public static void main(String[] args) {
        // Gather inputs from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter previous balance: ");
        Double previousBalance = input.nextDouble();
        System.out.print("Enter the amount of additional charges: ");
        Double additionalCharges = input.nextDouble();
        // Calculate new balance and minimum payments
        double nike = previousBalance + additionalCharges;
        double minimumPayment = 0;
        double interest = 0;
        // add interest
        if (previousBalance > 0) {
            interest = nike * .02;
            nike += interest;
        }
        // find minimum balance
        if (nike < 50) {
            minimumPayment = nike;
        } else if (nike <= 300) {
            minimumPayment = 50.00;
        } else if (nike > 300) {
            minimumPayment = nike * 0.2;
        }
        System.out.print("CS CARD International Statement\n===============================\n\nPrevious Balance:   $"
                + previousBalance + "\nAdditional Charges: $" + additionalCharges + "\nInterest:           $"
                + ((int) (interest * 100) / 100.)
                + "\n\nNew Balance:        $" + (int) (nike * 100) / 100. + "\n\nMinimum Payment:    $"
                + (int) (minimumPayment * 100) / 100.);
        input.close();
    }
}
/*Boolean operators
 *and = &&
  or = **
  not = !
  xor = ^
 */