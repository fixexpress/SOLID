package com.solid;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void pay(Order order) {
        System.out.println("Paid " + order.getAmount() + " using PayPal for Order ID: " + order.getId());
    }
}