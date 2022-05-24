package com.example.project;

public class Fish {
    String auxdata;
    int size;
    String name;
    String ID;

    public Fish(String name, String ID, int size, String auxdata){
        this.name = name;
        this.size = size;
        this.ID = ID;
        this.auxdata = auxdata;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getID() {
        return ID;
    }

    public String getImg() {
        return auxdata;
    }
}
