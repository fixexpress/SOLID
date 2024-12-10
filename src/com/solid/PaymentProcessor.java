package com.solid;

//D: Dependency Inversion Principle
//High-level modules (PaymentProcessor) depend on abstractions (PaymentMethod, NotificationService), not on concrete classes.
public class PaymentProcessor {
 private final PaymentMethod paymentMethod;
 private final NotificationService notificationService;

 public PaymentProcessor(PaymentMethod paymentMethod, NotificationService notificationService) {
     this.paymentMethod = paymentMethod;
     this.notificationService = notificationService;
 }

 public void processPayment(Order order) {
     paymentMethod.pay(order);
     notificationService.sendNotification("Payment successful for Order ID: " + order.getId());
 }
}