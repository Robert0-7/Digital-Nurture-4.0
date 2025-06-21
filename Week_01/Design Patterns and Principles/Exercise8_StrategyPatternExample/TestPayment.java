public class TestPayment {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay with Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        context.pay(1200.50);

        // Pay with PhonePe
        context.setPaymentStrategy(new PhonePePayment("1234567890"));
        context.pay(950.00);
    }
}
