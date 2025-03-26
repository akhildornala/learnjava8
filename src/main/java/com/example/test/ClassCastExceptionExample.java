package com.example.test;

class A {

}

class B extends A {

}

class C extends B {

}


public class ClassCastExceptionExample {

    public static void main(String args[]) {
        A a = new B(); //upcast
        try {
            B b = (B) a; //explicit downcast
            try {
                C c = (C) b;
            } catch (Exception e) {
                System.out.println("exception 2 " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("exception 1 " + e.getMessage());
        }
        A a2 = new A();
        try {
            B b2 = (B) a2;
        } catch (Exception e) {
            System.out.println("exception 3 " + e.getMessage());
        }
        Object o = new String();
        try {
            String s = (String) o;
        } catch (Exception e) {
            System.out.println("exception 4 " + e.getMessage());
        }
        try {
            Integer i = (Integer) o;
        } catch (Exception e) {
            System.out.println("exception 5 " + e.getMessage());
        }

        int i2 = 2;
        try {
            Integer ig = i2;
            Integer ig2 = Integer.valueOf(8);
            int i3 = ig;
            int i4 = ig2;
        } catch (Exception e) {
            System.out.println("exception 6 " + e.getMessage());
        }


    }
}
