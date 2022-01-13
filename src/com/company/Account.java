package com.company;

public class Account {

    private double plus;
    private double minus;
    private double balance = plus-minus;

    public Account(double balance){
        this.balance=balance;
    }
    public void setPlus(double plus){
        this.plus=plus;
    }
    public double getPlus(){
        return plus;
    }
    public void setMinus(double minus){
        this.minus=minus;
    }
    public double getMinus(){
        return minus;
    }
    public double getBalance(){
        balance+=plus-minus;
        return balance;
    }
}
