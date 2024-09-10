import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Booking {
    private AirlinePassenger passenger;
    private String flightNumber;
    private String seatNumber;
    private LocalDateTime bookingDateTime;
    private LocalTime bookingTime;
    private String bookingNumber;

    // No-arg constructor
    public Booking() {
        passenger = new AirlinePassenger();
        flightNumber = "";
        seatNumber = "";
        bookingDateTime = LocalDateTime.now();
        bookingTime = LocalTime.now();
        generateBookingNumber();
    }

    // Constructor with arguments for passenger, flightNumber, and bookingDateTime
    public Booking(AirlinePassenger passenger, String flightNumber, String seatNumber, LocalDateTime bookingDateTime) {
        this.passenger = passenger;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.bookingDateTime = bookingDateTime;
        this.bookingTime = LocalTime.now();
        generateBookingNumber();
    }

    // Setter and getter methods
    public AirlinePassenger getPassenger() {
        return passenger;
    }

    public void setPassenger(AirlinePassenger passenger) {
        this.passenger = passenger;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public LocalDateTime getBookingDateTime() {
        return bookingDateTime;
    }

    public void setBookingDateTime(LocalDateTime bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }

    // Generate a random booking number (6 uppercase letters)
    private void generateBookingNumber() {
        StringBuilder randomString = new StringBuilder();
        Random random = new Random();
        int length = 6;
        for (int i = 0; i < length; i++) {
            char randomChar = (char) (random.nextInt(26) + 'A');
            randomString.append(randomChar);
        }
        bookingNumber = randomString.toString();
    }

    DateTimeFormatter dateFormatObject = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    DateTimeFormatter timeFormatObject = DateTimeFormatter.ofPattern("HH:mm");

    // Override toString method to print booking information
    @Override
    public String toString() {
        return "Booking Information:" +
                "\nBooking Number: " + bookingNumber +
                "\nFlight Number: " + flightNumber +
                "\nSeat Number: " + seatNumber +
                "\nBooking Date and Time: " + bookingDateTime.format(dateFormatObject) +
                "\nBooking Time: " + bookingTime.format(timeFormatObject) + "\n\n" + passenger.toString();
    }
}
