package com.example.corejava;

public class MyCustomExample extends Exception{

    public MyCustomExample(String msg){
        super(msg + " from MyCustomExample");
    }
}
