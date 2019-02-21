package com.company;

import java.util.Objects;

public class Cities {
    int id;
    String name;

    public Cities(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cities cities = (Cities) o;
        return id == cities.id &&
                Objects.equals(name, cities.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", name: " + name ;
    }
}
