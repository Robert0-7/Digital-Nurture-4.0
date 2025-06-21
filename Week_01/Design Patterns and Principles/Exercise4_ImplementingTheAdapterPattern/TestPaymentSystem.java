public class TestPaymentSystem {
    public static void main(String[] args) {
        // PhonePe
        PhonePeGateway phonePe = new PhonePeGateway();
        PaymentProcessor phonePeProcessor = new PhonePeAdapter(phonePe);
        phonePeProcessor.processPayment(1500.0);

        // GPay
        GPayGateway gpay = new GPayGateway();
        PaymentProcessor gpayProcessor = new GPayAdapter(gpay);
        gpayProcessor.processPayment(2000.0);
    }
}
