package com.sample;

public class TestToString {

    public static void main(String[] args){
        TestToString obj1 = new TestToString();
        System.out.println("one");
        System.out.println(obj1);
    }

    public String toString(){
        return "override";
    }
}
