package com.example.practice;

import java.util.List;

public class HCFExample2 {

    public static void main(String[] args) {
        List<Integer> nums = List.of(63, 21, 18, 15, 21, 12);
        int numsSize = nums.size();
        int gcf = 1;

        for (int i = 0; i < numsSize - 1; i++) {
            gcf = findGCF(nums.get(i), nums.get(i + 1), gcf);
            System.out.println("gcf of " + nums.get(i) + " and " + nums.get(i + 1) + " is " + gcf);
        }

        System.out.println(gcf);
    }

    private static int findGCF(int a, int b, int gcf) {
        for (int i = 1; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcf = i;
            }
        }
        return gcf;
    }
}
