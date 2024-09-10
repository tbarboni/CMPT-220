// Define a class CreditCard that extends PaymentGateway
public class CreditCard extends PaymentGateway{
    // Declare private variables for cardNumber and expirationDate
    private String cardNumber;
    private String expirationDate;

    // Constructor for CreditCard class that takes cardNumber and expirationDate as parameters
    public CreditCard(String cardNumber, String expirationDate) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    // Override the processPayment method from PaymentGateway for CreditCard
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " with Credit Card " + this.cardNumber + " that expires on " + this.expirationDate + ".");
    }

    // Override the refundPayment method from PaymentGateway for CreditCard
    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding payment of $" + amount + " for card " + this.cardNumber);
    }
}