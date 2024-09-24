/**Wikender Alcius
 * EEL5881 Homework 1
 */

/** Creating this class to process payments */
public class PaymentProcessor {
    private PaymentValidation paymentValidation;

    /** Using this to validate the payment method */
    public PaymentProcessor(PaymentValidation paymentValidation) {
        this.paymentValidation = paymentValidation;
    }

    /**
     * Using this parameter to process the card number
     * if it is good it will say "Payment is Valid."
     * if it is bad it will say "Invalid card number."
     */
    public void processPayment(String cardNumber) {
        if (paymentValidation.validate(cardNumber)) {
            System.out.println("Payment is valid.");
        } else {
            System.out.println("Invalid card number.");
        }
    }

    /** Entering a random card number to test if the system works perfectly */
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor(new CreditCardValidation());
        /**
         * Using Luhn's Algorithm if I use a random number the card will say invalid
         * because it has to respect the doubling logic
         */
        processor.processPayment("1234567812345670");
    }
}
