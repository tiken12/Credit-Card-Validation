/** Wikender Alcius
 * EEL5881 Homework 1
 */

 /** Creting this class to validate the card numbers */
 public class CreditCardValidation implements PaymentValidation {

    /** Using Luhn's Algorithm for the validation process */
    @Override
    public boolean validate(String cardNumber) {
        int sum = 0;
        boolean alternate = false;
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(cardNumber.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n -= 9;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }
}
