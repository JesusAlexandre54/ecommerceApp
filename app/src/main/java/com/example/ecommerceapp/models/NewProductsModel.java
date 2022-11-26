package com.example.ecommerceapp.models;

public class NewProductsModel {
    String description, rating, name, img_url ;
    int price;

    public NewProductsModel() {
    }

    public NewProductsModel(String description, String rating, String name, String img_url, int price) {
        this.description = description;
        this.rating = rating;
        this.name = name;
        this.img_url = img_url;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
