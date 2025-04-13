package com.example.corejava;

public class Test2 {

    public static void main(String[] args) {
        SingletonClassExample obj1 = SingletonClassExample.createObj();
        SingletonClassExample obj2 = SingletonClassExample.createObj();
        System.out.println(obj1 == obj2);

    }
}
