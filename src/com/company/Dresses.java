package com.company;

public class Dresses extends Clothes{

    @Override
    public String toString() {
        return "Dresses [name=" + name + ", lenght=" + lenght + ", season=" + season + "]";
    }


    private String name;
    private Lenght lenght;
    private Season season;

    public Dresses(String name, Lenght lenght, Season season, double price, int size, String color) {
        super(price, size, color);
        this.name = name;
        this.lenght = lenght;
        this.season = season;

    }
    public String getName() {
        return name;
    }
    public Lenght getLenght() {
        return lenght;
    }

    public Season getSeason() {
        return season;
    }
}
