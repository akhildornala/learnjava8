package com.example.practice;

import java.util.*;
import java.util.stream.Collectors;

public class HCFExample3 {

    public static void main(String[] args) {
        List<Integer> nums = List.of(63, 21, 18, 15, 21, 12);
        int sizeOfInput = nums.size();
        Map<Integer, List<Integer>> numsFactorsMap = new HashMap<>();
        for (Integer num : nums) {
            List<Integer> factors = new ArrayList<>();
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    factors.add(i);
                }
            }
            Comparator<Integer> comparator = (o1, o2) -> o2.compareTo(o1);
            factors.sort(comparator);
            numsFactorsMap.put(num, factors);
        }
        List<Integer> initialList = numsFactorsMap.get(63);
       for(Integer k: numsFactorsMap.keySet()){
           List<Integer> secondaryList =  numsFactorsMap.get(k);
           initialList.retainAll(secondaryList);
       }
        System.out.println(initialList);
        System.out.println(Collections.max(initialList));
    }
}
