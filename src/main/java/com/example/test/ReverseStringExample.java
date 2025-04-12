package com.example.test;

public class ReverseStringExample {

    public static void main(String args[]) {
        String input = "madam";

        char[] arr =  input.toCharArray();

        StringBuilder builder = new StringBuilder(input);
        String reverse = builder.reverse().toString();

        System.out.println(reverse.equals(input));
    }
}
