package com.paymentsystem;

public class UPIPayment extends Payment {

    public UPIPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("UPI payment processed: ₹" + amount);
    }
}
