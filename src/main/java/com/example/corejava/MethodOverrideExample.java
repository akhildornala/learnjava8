package com.example.corejava;

public class MethodOverrideExample {

    public static void main(String[] args) {
        Pet p = new Pet();
        Pet p2 = new Dog();
        Dog d = new Dog();


        System.out.println(p.test("one"));
        System.out.println(p2.test("two"));
        System.out.println(d.test("three"));
    }
}
