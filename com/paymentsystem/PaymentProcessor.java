package com.paymentsystem;

import java.util.Scanner;

public class PaymentProcessor {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.print("enter amount: ");
        double amount = sc.nextDouble();

        System.out.print("Choose payment method 1-Credit Card, 2-UPI: ");
        int choice = sc.nextInt();

        PaymentMethod validator = ampont -> amount > 0;

        validator.info();
        PaymentMethod.rules();

        if (!validator.validate(amount)) {
            System.out.println("Invalid amount!");
            return;
        }

       
        Payment payment;

        if (choice == 1) {
            payment = new CreditCardPayment(amount);
        } else if (choice == 2) {
            payment = new UPIPayment(amount);
        } else {
            System.out.println("Invalid payment option");
            return;
        }

        payment.processPayment(); 
    }
}
