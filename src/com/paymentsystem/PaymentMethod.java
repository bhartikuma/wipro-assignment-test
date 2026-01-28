package com.paymentsystem;

@FunctionalInterface
public interface PaymentMethod {
    boolean validate(double amount);

    default void info() {
        System.out.println("Validating payment...");
    }

    static void rules() {
        System.out.println("Amount must be greater than 0");
    }
}
