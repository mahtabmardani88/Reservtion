package Views;

import Models.PaymentMethod;

import java.util.List;

public class PaymentMethodView {
    public void printPaymentMethod(List<PaymentMethod> PaymentMethodList) {
        System.out.println("PaymentMethod:");
        for (PaymentMethod paymentMethod : PaymentMethodList) {
            System.out.println(paymentMethod.toString());
        }
    }
}
