package com.myapp.entities;

public class Book {
    private final String name;
    private final String author;
    private final int yearOfRelease;

    public Book(String name, String author, int yearOfRelease) {
        this.name = name;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }
}
