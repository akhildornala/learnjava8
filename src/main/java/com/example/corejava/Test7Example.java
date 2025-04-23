package com.example.corejava;

public class Test7Example {

    public static void main(String[] args) throws MyCustomExample {
        int num= 4;

        solution(num);
    }

    private static void solution(int num) throws MyCustomExample{

        if(num<5){
            throw new MyCustomExample("number less than 5");
        }
    }
}
