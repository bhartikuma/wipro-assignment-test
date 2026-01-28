package com.paymentsystem;

public class CreditCardPayment extends Payment {

    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Creditcard payment processed: ₹" + amount);
    }
}
