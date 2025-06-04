package com.example.practice;

import java.util.ArrayList;
import java.util.List;

public class UpStreamList {

    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>(List.of(1, 3, 3, 2));
        int step = 2;
        int res = solve(ls, step);
        System.out.println(res);
    }

    private static int solve(List<Integer> nums, int step) {
        int res = 0;
        int size = nums.size();
        for (int i = 0; i < size - 1; i++) {
            res = res + callMe(nums.get(i), nums.get(i + 1), step, i+1, nums);
        }
        return res;
        
    }

    private static int callMe(int firstNum, int secondNum, int step, int index, List<Integer> nums) {
        int res = 0;
        if (secondNum > firstNum) {
            res = 0;
        } else {
            while (secondNum <= firstNum) {
                res = res + 1;
                secondNum = secondNum + step;
            }
            nums.set(index, secondNum);
        }
        return res;
    }
}
