package com.company;

public class Skirts extends Clothes {

    @Override
    public String toString() {
        return "Skirts [nazwa=" + nazwa + ", lenght=" + lenght + ", season=" + season + "]";
    }
    private String nazwa;
    private Lenght lenght;
    private Season season;

    public Skirts(String nazwa, Lenght lenght, Season season, double price, int size, String color) { //konstruktor
        super(price, size, color);
        this.nazwa = nazwa;
        this.lenght = lenght;
        this.season = season;
    }
    public String getNazwa() {
        return nazwa;
    }
    public Lenght getLenght() { //getter
        return lenght;
    }
    public Season getSeason() {
        return season;
    }
}
