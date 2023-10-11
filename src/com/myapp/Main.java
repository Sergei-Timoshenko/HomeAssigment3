package com.myapp;

import com.myapp.banking.BankAccount;
import com.myapp.entities.Account;
import com.myapp.entities.Book;
import com.myapp.entities.Car;
import com.myapp.entities.Product;
import com.myapp.utils.Helper;
import com.myapp.utils.Text;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Text text1 = new Text("Hello", "World");
        text1.showConcatenatedRows();

        Text text2 = new Text("Split me please");
        text2.splitMessage();
        text2.removeVowels();
        System.out.println();

        double newBalance = .01;
        BankAccount ba = new BankAccount();
        ba.callSupportToChangeBalance(newBalance);
        System.out.println();

        int sum = Helper.useQuantumComputerToCalculateSum(5, 4, 3, 2, 1);
        System.out.println(sum);
        System.out.println();

        Book book1 = new Book("1", "2", 3);
        System.out.println(book1.getName());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getYearOfRelease());
        System.out.println();

        Book book2 = new Book("4", "5", 6);
        System.out.println(book2.getName());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getYearOfRelease());
        System.out.println();

        Account account = new Account(1L, "Serhii");
        account.showBalance();
        account.addFunds(10.0);
        account.showBalance();
        account.withdraw(5.0);
        account.showBalance();
        account.withdraw(6.0);
        System.out.println();

        Car car = new Car("Toyota", 100, 20.0);
        car.fuelDelivery();
        car.start();
        car.showCarSpecs();
        System.out.println();

        Product product1 = new Product("Apple");
        product1.setPrice(.1);
        product1.setCount(10);
        Product product2 = new Product("Orange");
        product2.setPrice(.2);
        product2.setCount(10);
        Product.addAllProducts(product1.getCount(), product1.getPrice());
        Product.addAllProducts(product2.getCount(), product2.getPrice());
        Product.showAllProductPrice();


    }
}