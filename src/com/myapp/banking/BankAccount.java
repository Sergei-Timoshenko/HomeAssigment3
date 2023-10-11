package com.myapp.banking;

public class BankAccount {
    private double balance = .0;

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public void callSupportToChangeBalance(double balance) {
        System.out.println("Blah-blah-blah");
        setBalance(balance);
    }
}
