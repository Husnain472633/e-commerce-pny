package com.example.ecommerace.fragement;

import java.io.Serializable;

public class productdata implements Serializable {
    private int image;
    private String name , des, price , reting;


    public productdata(int image, String name, String des, String price, String reting) {
        this.image = image;
        this.name = name;
        this.des = des;
        this.price = price;
        this.reting = reting;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getReting() {
        return reting;
    }

    public void setReting(String reting) {
        this.reting = reting;
    }
}
