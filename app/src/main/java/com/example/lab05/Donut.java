package com.example.lab05;

import java.util.ArrayList;

public class Donut {
    private String name;
    private String about;
    private int img;
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Donut(String name, String about, int img, String price) {
        this.name = name;
        this.about = about;
        this.img = img;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Donut{" +
                "name='" + name + '\'' +
                ", about='" + about + '\'' +
                ", img='" + img + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
