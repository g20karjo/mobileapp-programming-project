package com.example.project;

public class Fish {
    String img;
    int size;
    String name;
    String ID;

    public Fish(String name, String ID, int size, String img){
        this.name = name;
        this.size = size;
        this.ID = ID;
        this.img = img;
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
        return img;
    }
}
