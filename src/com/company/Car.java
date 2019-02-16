package com.company;

public class Car {
int id;
int num;


    public Car(int id, int num) {
        this.id = id;
        this.num = num;

    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", num=" + num ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
