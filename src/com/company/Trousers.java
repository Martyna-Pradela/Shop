package com.company;

public class Trousers extends Clothes {

    @Override
    public String toString() {
        return "Trousers [nazwa=" + nazwa + ", type=" + type + ", collectionType=" + collectionType + "]";
    }

    private String nazwa;
    private Type type;
    private CollectionType collectionType;

    public Trousers(String nazwa, Type type, CollectionType collectionType, double price, int size, String color) {
        super(price, size, color);
        this.nazwa = nazwa;
        this.type = type;
        this.collectionType = collectionType;
    }
    public String getNazwa() {
        return nazwa;
    }
    public Type getType() {
        return type;
    }

    public CollectionType getCollectionType() {
        return collectionType;
    }
}
