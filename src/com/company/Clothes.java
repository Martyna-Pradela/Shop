package com.company;

public class Clothes {
    private double price;
    private int size;
    private String color;

    public Clothes(){
    }
    public Clothes(double price, int size, String color){
        this.price = price;
        this.size=size;
        this.color=color;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public void setSize(int size){
        this.size=size;
    }
    public int getSize(){
        return size;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return "Color: " + color;
    }
}
