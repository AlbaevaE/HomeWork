package com.company;

import java.util.Objects;

public class WeekDays {
    String day;

    public WeekDays(String day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeekDays weekDays = (WeekDays) o;
        return Objects.equals(day, weekDays.day);
    }

    @Override
    public int hashCode() {
        return day.length();
    }
}
