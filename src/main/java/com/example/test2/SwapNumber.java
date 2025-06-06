package com.example.test2;

public class SwapNumber {

    public static void main(String args[]){
        /*
        Write a Java Program to swap two numbers using the third variable.

  Enter x and y
45
98
Before Swapping4598
After Swapping9845
         */

        int num1 = 45;
        int num2= 98;
        System.out.println("before swap");
        System.out.println("num1:"+num1);
        System.out.println("num2:"+num2);
        num1 = num1+num2;

        num2 = num1-num2;


        num1 = num1-num2;
        System.out.println("after swap");
        System.out.println("num1:"+num1);
        System.out.println("num2:"+num2);


    }
}
