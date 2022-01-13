package com.company;

import java.util.List;

public class Basket {

    private List<Clothes> produktList;

    public List<Clothes> getProduktList(){
        return produktList;
    }
    public void setProduktList(List<Clothes> produktList) {
        this.produktList = produktList;
    }
    public double shoppingPrice() {
        double suma = 0;
        for(Clothes c : produktList) {
            suma+= c.getPrice();
        }
        return suma;
    }
}
