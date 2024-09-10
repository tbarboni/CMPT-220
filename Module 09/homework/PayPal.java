public class PayPal extends PaymentGateway{
    private String email;
    private String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via PayPal.");
    }

    public void refundPayment(double amount) {
        System.out.println("Refunding payment of $" + amount + " for account" + this.email);
    }
}
