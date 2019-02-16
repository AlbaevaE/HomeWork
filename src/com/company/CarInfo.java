package com.company;

import java.awt.*;

public class CarInfo {
    int id;
    int year_of_issue;
    String model;
    int price;
    String color;

    public CarInfo(int id, int year_of_issue, String model, int price, String color) {
        this.id = id;
        this.year_of_issue = year_of_issue;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "id=" + id +
                ", year_of_issue=" + year_of_issue +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color=" + color +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear_of_issue() {
        return year_of_issue;
    }

    public void setYear_of_issue(int year_of_issue) {
        this.year_of_issue = year_of_issue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
