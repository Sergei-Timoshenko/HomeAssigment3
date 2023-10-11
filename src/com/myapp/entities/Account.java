package com.myapp.entities;

public class Account {
    private final long accountNumber;
    private final String ownerName;
    private double balance;

    public Account(long accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }

    public void addFunds(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Not enough funds");
        }
    }

    public void showBalance() {
        System.out.println(balance);
    }
}
