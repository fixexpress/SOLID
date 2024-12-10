package com.solid;

//S: Single Responsibility Principle
//Cada classe tem uma única responsabilidade.
public class Order {
 private final String id;
 private final double amount;

 public Order(String id, double amount) {
     this.id = id;
     this.amount = amount;
 }

 public String getId() {
     return id;
 }

 public double getAmount() {
     return amount;
 }
}