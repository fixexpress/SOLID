package com.solid;

//O: Open/Closed Principle
//Novos métodos de pagamento podem ser adicionados sem modificar a classe PaymentProcessor.
public interface PaymentMethod {
 void pay(Order order);
}