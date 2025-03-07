package com.example.recyclerview;

public class Item {
    private int image;
    private String title;
    private String description;
    private String price;

    public Item(String title, String description, int image, String price) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.price = price;
    }

    // Getter and Setter Methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
