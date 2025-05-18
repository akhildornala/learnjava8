package com.example.leetcode;

public class Move0ToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        //expected output  [1,3,12,0,0]
        int[] outputArr = moveArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int[] moveArray(int[] arr) {
        for (int i = 0; i <= arr.length; i++) {
            if(arr[i]==0){

            }
        }
        return arr;
    }
}
