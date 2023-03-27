package Controllers;

import Models.PaymentMethod;
import Views.PaymentMethodView;

import java.util.ArrayList;
import java.util.List;

public class PaymentMethodController {
    private static PaymentMethodView _paymentMethodView;
    private static List<PaymentMethod> PaymentMethodList;
    public PaymentMethodController(PaymentMethodView paymentMethodView) {
        _paymentMethodView = paymentMethodView;
        PaymentMethodList = new ArrayList<>();
    }

    public void LoadPaymentMethods(){
//calculatur dicont if discount is valid return percentage if expire percentage set to zero

        PaymentMethodList.add(new PaymentMethod("1"));

        PaymentMethodList.add(new PaymentMethod("2"));


    }
    public void PrintPaymentMethod(){


        _paymentMethodView.printPaymentMethod(PaymentMethodList);
    }
}
