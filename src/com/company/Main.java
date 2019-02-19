package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random rm = new Random();

        ArrayList<String> st = new ArrayList<>();       //Работа сделана не до конца
        LinkedHashMap<WeekDays, Integer> weekDays = new LinkedHashMap<>();
        WeekDays week = new WeekDays("Monday");
        WeekDays days = new WeekDays("Tuesday");
        WeekDays wd = new WeekDays("Wednesday");
        WeekDays dw = new WeekDays("Thursday");
        WeekDays w = new WeekDays("Friday");
        WeekDays d = new WeekDays("Saturday");
        WeekDays weekd = new WeekDays("Sunday");

        weekDays.put(week, 1);
        weekDays.put(days, 2);
        weekDays.put(wd, 3);
        weekDays.put(dw, 4);
        weekDays.put(w, 5);
        weekDays.put(d, 6);
        weekDays.put(weekd, 7);

        System.out.println("hc1: " + week.hashCode());
        System.out.println("hc2: " + days.hashCode());
        System.out.println("hc3: " + wd.hashCode());
        System.out.println("hc4: " + dw.hashCode());
        System.out.println("hc5: " + w.hashCode());
        System.out.println("hc6: " + d.hashCode());
        System.out.println("hc7: " + weekd.hashCode());
        System.out.println("***************************");


        for (int i = 0; i < 100; i++) {
            GregorianCalendar gc = new GregorianCalendar();
            int year = randBetween(2018, 2019);

            gc.set(gc.YEAR, year);

            int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

            gc.set(gc.DAY_OF_YEAR, dayOfYear);

            System.out.println(gc.get(gc.YEAR) + "." + (gc.get(gc.MONTH) + 1) + "." + gc.get(gc.DAY_OF_MONTH));
        }
    }

    public static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }


//LinkedHashMap<Date,Integer> linkedHash = new LinkedHashMap<>();
//        int max = 365;
//        int min = 1;
//        for(int i = 0;i<101;i++){
//                linkedHash = rm.nextInt((max-min)+min)+1;
//        }



//    public Date randomDate() {
//            var date1 = new Date(2018, 1, 1);
//            var date2 = new Date(2018, 12, 31);
//
//
//        long randomInt(int min, int max)
//        {
//            return Math.round(Math.random()*(max-min)+min);
//        }
//         LinkedHashMap<Integer,Date>dateLinkedHashMap = new LinkedHashMap<>();
//         dateLinkedHashMap.put(1,new Date());


//        LinkedHashMap<DaysOfTheWeek,Integer>days = new LinkedHashMap<>();
//        days.put(DaysOfTheWeek.Monday,1);
//        days.put(DaysOfTheWeek.Tuesday,2);
//        days.put(DaysOfTheWeek.Wednesday,3);
//        days.put(DaysOfTheWeek.Thursday,4);
//        days.put(DaysOfTheWeek.Friday,5);
//        days.put(DaysOfTheWeek.Saturday,6);
//        days.put(DaysOfTheWeek.Sunday,7);
//
//        System.out.println(days);
}

