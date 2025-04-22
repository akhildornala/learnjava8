package com.example.corejava;

public class Chair {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String name;
    public int size;

    public Chair(String name, int size) {
        this.name = name;
        this.size = size;
    }


}
