package com.example.bookstore;

import java.io.Serializable;

public class BookModel implements Serializable {
    private String title, author, description;
    private int coverImageResource;
    private double price;
    private boolean available;

    public BookModel(String title, String author, String description, int coverImageResource, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.coverImageResource = coverImageResource;
        this.price = price;
        this.available = available;
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getDescription() { return description; }
    public int getCoverImageResource() { return coverImageResource; }
    public double getPrice() { return price; }
    public boolean isAvailable() { return available; }
}
