package com.example.masaladosa;

public class Seller {
    public int id;

    public String name;

    public String imageUrl;

    public String description;

    public String price;

    public float rating;

    public String email;

    public Seller(int id, String name, String imageUrl, String description, String price, float rating, String email) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.description = description;
        this.price = price;
        this.rating = rating;
        this.email = email;
    }
}
