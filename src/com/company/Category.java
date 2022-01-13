package com.company;

public class Category {

    private String nazwa;
    private What what;

    public Category(String nazwa, What what) {
        this.nazwa = nazwa;
        this.what = what;
    }

    public String getNazwa() {
        return nazwa;

    }
    public What getWhat() {
        return what;
    }
}
