package com.company;

import java.awt.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BD bd = new BD();
        bd.connect();
        bd.insertCar(new Car(43,1579));
        bd.insertCarInfo(new CarInfo(11,1556,"Bugatti Type 64 1939",2987000,"Black"));

//        HashMap<Car,CarInfo>infoHashMap = new HashMap<>();
//        infoHashMap.put(new Car(2,543),
//                new CarInfo(2,1939,"",3986000,"Blue"));
//        System.out.println(infoHashMap.get(new Car(2,1939)));


    }
}

