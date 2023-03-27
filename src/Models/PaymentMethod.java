package Models;

public class PaymentMethod {
    private String paymentId;

    public PaymentMethod(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
    @Override
    public String toString() {
        return "PaymentMethod{" +
                "paymentId='" + paymentId + '\'' +

                '}';
    }
}
