package com.example.leetcode;

public class Move0ToEnd {
    public static void main(String[] args) {
        int[] arr = {9,0, 1, 0, 3, 12, 0, 8};
        //expected output  [1,3,12,0,0]
        int[] outputArr = moveArray(arr);
        System.out.println("output");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int[] moveArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                //swap
                for(int j=i; j<arr.length-1; j++){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;

                }
//                printArray(arr);

            }
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
