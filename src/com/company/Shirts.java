package com.company;

public class Shirts extends Clothes {

    @Override
    public String toString() {
        return "Shirts [name=" + name + ", season=" + season + "]";
    }
    private String name;
    private Season season;

    public Shirts(String name, Season season, double price, int size, String color) {
        super(price, size, color);
        this.name = name;
        this.season = season;
    }
    public Season getSeason() {
        return season;
    }
    public String getName() {
        return name;
    }
}
