package com.example.test;

import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbersFilter {
    public static void main(String args[]) {
        List<Integer> numsList = List.of(99, 4, 87, 33, 32, 28, 34, 69, 18);
        System.out.println("odd nums are " + printOddEvenNums(numsList, "odd"));
        System.out.println("even nums are " + printOddEvenNums(numsList, "even"));

    }

    private static List<Integer> printOddEvenNums(List<Integer> nums, String type) {
        if (type.equals("even")) {
            return nums.stream()
                    .filter(n -> n % 2 == 0)
                    .collect(Collectors.toList());
        } else if (type.equals("odd")) {
            return nums.stream()
                    .filter(n -> n % 2 != 0)
                    .collect(Collectors.toList());
        }
        return null;
    }
}
