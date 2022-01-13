package com.company;

public class Choice extends Clothes {

    private String title;
    private Lenght lenght;
    private Type type;
    private Season season;
    private CollectionType collectionType;
    private What what;

    public Choice(String title, Lenght lenght, Type type, Season season, CollectionType collectionType, What what) { //konstruktor
        this.title=title;
        this.lenght = lenght;
        this.type = type;
        this.season = season;
        this.collectionType = collectionType;
        this.what = what;

    }
    public String getTitle() { //getter
        return title;
    }
    public Lenght getLenght() {
        return lenght;
    }
    public Type getType() {
        return type;
    }
    public Season getSeason() {
        return season;
    }
    public CollectionType getCollectionType() {
        return collectionType;
    }
    public What getWhat() {
        return what;
    }

}
