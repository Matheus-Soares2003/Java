package br.com.designpatterns.paymentsstrategy;

public class StripeStrategy implements Payment {

    @Override
    public void pay(float amount) {
        System.out.println("Paid " + amount + " using Stripe");
    }
}
