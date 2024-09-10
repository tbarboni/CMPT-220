import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Problem2 {
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

        // Set the remaining information for the passenger
        AirlinePassenger passenger = new AirlinePassenger(title, firstName, lastName, dob);

        System.out.print("Mobile Number: ");
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

        System.out.print("Flight Number: ");
        String flightNumber = input.nextLine();
        System.out.print("Seat Number ");
        String seatNumber = input.nextLine();
        System.out.print("Booking Date and Time (yyyy-MM-dd HH:mm): ");
        String bookingDateTimeStr = input.nextLine();

        // Parse booking date and time
        LocalDateTime bookingDateTime = null;
        try {
            bookingDateTime = LocalDateTime.parse(bookingDateTimeStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        } catch (DateTimeParseException e) {
            System.err.println("Invalid date and time format. Please use yyyy-MM-dd HH:mm.");
            System.exit(1);
        }

        // Generate a booking
        Booking booking = new Booking(passenger, flightNumber, seatNumber, bookingDateTime);

        // Print out passenger and booking information
        System.out.println(booking);
        input.close();
    }
}
