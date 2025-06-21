public class GPayAdapter implements PaymentProcessor {
    private GPayGateway gpay;

    public GPayAdapter(GPayGateway gpay) {
        this.gpay = gpay;
    }

    @Override
    public void processPayment(double amount) {
        gpay.payViaGPay(amount);
    }
}
