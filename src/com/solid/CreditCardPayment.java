package com.solid;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(Order order) {
        System.out.println("Paid " + order.getAmount() + " using Credit Card for Order ID: " + order.getId());
    }
}