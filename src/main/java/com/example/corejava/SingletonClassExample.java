package com.example.corejava;

public class SingletonClassExample {

    private static SingletonClassExample obj;

    private SingletonClassExample() {

    }

    public synchronized static SingletonClassExample createObj() {
        if (obj == null) {
            obj = new SingletonClassExample();
        }
        return obj;
    }

    public static void main(String[] args) {
        SingletonClassExample obj1 = SingletonClassExample.createObj();
        SingletonClassExample obj2 = SingletonClassExample.createObj();
        System.out.println(obj1 == obj2);

    }
}
