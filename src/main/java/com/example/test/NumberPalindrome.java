package com.example.test;

public class NumberPalindrome {

    public static void main(String args[]) {
        int num = 101;
        boolean isItPalindrome = isNumPalindrome(num);
        System.out.println(isItPalindrome);
    }

    public static boolean isNumPalindrome(int x) {
        try {
            String straight = Integer.toString(x);
            String revString = new StringBuilder(straight).reverse().toString();
            return straight.equals(revString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
