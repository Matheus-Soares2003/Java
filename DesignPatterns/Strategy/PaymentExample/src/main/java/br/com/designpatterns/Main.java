package br.com.designpatterns;

import br.com.designpatterns.paymentsstrategy.PayPalStrategy;
import br.com.designpatterns.paymentsstrategy.Payment;
import br.com.designpatterns.paymentsstrategy.StripeStrategy;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Payment> strategies = Map.ofEntries(
                Map.entry("paypal", new PayPalStrategy()),
                Map.entry("stripe", new StripeStrategy())
        );

        String paymentService1 = "paypal";
        String paymentService2 = "stripe";

        Payment paymentStrategy1 = strategies.get(paymentService1);
        Payment paymentStrategy2 = strategies.get(paymentService2);

        System.out.print("Payment1: ");
        paymentStrategy1.pay(250.99f);

        System.out.print("Payment2: ");
        paymentStrategy2.pay(150f);

    }
}