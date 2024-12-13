package com.example.test;

import java.util.List;
import java.util.stream.Collectors;

public class SumOfNumbersExample {
    public static void main(String args[]) {
        List<Integer> nums = List.of(1, 9, 76, 4, 99, 143, 69);
        int sum = nums.stream()
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);
    }
}
