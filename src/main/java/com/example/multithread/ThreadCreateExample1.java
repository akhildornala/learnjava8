package com.example.multithread;

public class ThreadCreateExample1 extends Thread {

    public void run() {
        System.out.println("inside run method " + Thread.currentThread().getName());
    }

    public static void main(String args[]) {
        System.out.println("start akhil");
        ThreadCreateExample1 t1 = new ThreadCreateExample1();
        t1.setName("t1");
        t1.start();

        ThreadCreateExample1 t2 = new ThreadCreateExample1();
        t2.setName("t2");
        t2.start();

        ThreadCreateExample1 t3 = new ThreadCreateExample1();
        Thread tr3 = new Thread(t3);
        tr3.setName("tr3");
        tr3.start();


        System.out.println("done akhil");
    }
}
