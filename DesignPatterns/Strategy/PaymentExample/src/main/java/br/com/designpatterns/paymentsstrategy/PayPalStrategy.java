package br.com.designpatterns.paymentsstrategy;

public class PayPalStrategy implements Payment {

    @Override
    public void pay(float amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}
