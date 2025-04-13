package com.example.corejava;

public class MethodOverloadExample {

    public static void main(String args[]) {
//        solution(null);
    }

    private static void solution(Integer a) {
        System.out.println("inside integer method");
    }

    private static void solution(String a) {
        System.out.println("from string method");
    }

    private static void solution(Object obj) {
        System.out.println("inside obj method");
    }

    private static Integer test(Integer a) {
        return 1;
    }

    private static String test(String a) {
        return "hi";
    }
}
