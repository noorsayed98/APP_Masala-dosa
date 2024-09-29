package com.example.masaladosa;

public class Item {
    public int id;

    public String name;

    public String imageUrl;

    public String description;

    public String price;

    public float rating;

    public Seller seller;

    public Item(int id, String name, String imageUrl, String description, String price, float rating, Seller seller) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.description = description;
        this.price = price;
        this.rating = rating;
        this.seller = seller;
    }
}
