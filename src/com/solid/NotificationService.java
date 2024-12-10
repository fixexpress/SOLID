package com.solid;

//L: Liskov Substitution Principle
//Subclasses (CreditCardPayment, PayPalPayment) can replace the interface PaymentMethod without issues.
//No additional changes needed here as the design respects LSP.

//I: Interface Segregation Principle
//Interfaces are kept small and focused. We do not force unnecessary methods on implementations.
public interface NotificationService {
 void sendNotification(String message);
}