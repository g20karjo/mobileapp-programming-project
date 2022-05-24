package com.example.project;

public class Fish {
    String auxdata;
    int size;
    String name;
    String ID;
    String Login;

    public Fish(String name, String ID, int size, String auxdata, String Login){
        this.name = name;
        this.size = size;
        this.ID = ID;
        this.auxdata = auxdata;
        this.Login = Login;
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
