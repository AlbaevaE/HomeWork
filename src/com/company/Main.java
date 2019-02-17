package com.company;

import java.awt.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BD bd = new BD();
        bd.connect();
        bd.insertCar(new Car(43, 1579));
        bd.insertCarInfo(new CarInfo(11, 1556, "Bugatti Type 64 1939", 2987000, "Black"));
        System.out.println(bd.getAll());

    }
}
//    create table car(                     Так я создала таблицы. Долго думала,
//        id serial primary key,               положить информацию в машину или машину в информацию.
//        num int unique,
//        info int references car_info(id));
//
//        create table car_info(
//        id int primary key,
//        year_of_issue int not null,
//        model varchar(50)not null,
//        price int not null,
//        color varchar(40)not null);
//
//        select * from car_info
