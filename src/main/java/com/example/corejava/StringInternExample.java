package com.example.corejava;

public class StringInternExample {

    public static void main(String args[]) {
        System.out.println("Akhil Dornala");
        String s1 = "akhil";
        String s2 = new String("akhil");
        String s3 = "akhil";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        //
        System.out.println("2nd example");
        String t1 = "hello";
        String t2 = new String("hello").intern();
        String t3 = "hello";
        System.out.println(t1 == t2);
        System.out.println(t1.equals(t2));
        System.out.println(t1 == t3);
        System.out.println("end");
    }
}
