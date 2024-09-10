import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Title: ");
        String title = input.nextLine();
        System.out.print("First Name: ");
        String firstName = input.nextLine();
        System.out.print("Last Name: ");
        String lastName = input.nextLine();
        System.out.print("Date of Birth (yyyy-MM-dd): ");
        String dobStr = input.nextLine();

        // Parse the date of birth
        Date dob = null;
        try {
            dob = new SimpleDateFormat("yyyy-MM-dd").parse(dobStr);
        } catch (ParseException e) {
            System.err.println("Invalid date format. Please use yyyy-MM-dd.");
            System.exit(1);
        }
        
        // Set the remaining information
        AirlinePassenger passenger = new AirlinePassenger(title, firstName, lastName, dob);

        System.out.print("MobileNumber: ");
        passenger.setMobileNumber(input.nextLine());
        System.out.print("Frequent Flyer Number: ");
        passenger.setFrequentFlyerNumber(input.nextLine());
        System.out.print("Miles Flown: ");
        passenger.setMilesFlown(input.nextInt());
        input.nextLine();
        System.out.print("Nationality: ");
        passenger.setNationality(input.nextLine());
        System.out.print("Passport Number: ");
        passenger.setPassportNumber(input.nextLine());
        System.out.print("Passport Expiry (yyyy-MM-dd): ");
        String passportExpiryStr = input.nextLine();
        System.out.print("Passport Country: ");
        passenger.setPassportCountry(input.nextLine());
        System.out.print("Passport Issue Date (yyyy-MM-dd): ");
        String passportIssueDateStr = input.nextLine();
        // Parse passport expiry and issue dates
        try {
            Date passportExpiry = new SimpleDateFormat("yyyy-MM-dd").parse(passportExpiryStr);
            Date passportIssueDate = new SimpleDateFormat("yyyy-MM-dd").parse(passportIssueDateStr);
            passenger.setPassportExpiry(passportExpiry);
            passenger.setPassportIssueDate(passportIssueDate);
        } catch (ParseException e) {
            System.err.println("Invalid date format. Please use yyyy-MM-dd.");
            System.exit(1);
        }

        // Print out passenger information
        System.out.println("\nPassenger Information:\n" + passenger);
    }

}
