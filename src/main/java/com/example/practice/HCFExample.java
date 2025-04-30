package com.example.practice;

import java.util.*;
import java.util.stream.Collectors;

public class HCFExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(3,21);
        int sizeOfInput = nums.size();
        Map<Integer, List<Integer>> numsFactorsMap = new HashMap<>();
        for (Integer num : nums) {
            List<Integer> factors = new ArrayList<>();
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    factors.add(i);
                }
            }
            Comparator<Integer> comparator = (o1, o2)-> o2.compareTo(o1);
            factors.sort(comparator);
            numsFactorsMap.put(num, factors);
        }
        System.out.println(numsFactorsMap);
        Map<Integer, Long> occurenceMap = numsFactorsMap.values()
                .stream()
                .flatMap(n-> n.stream())
                .collect(Collectors.groupingBy(n->n, Collectors.counting()));
        System.out.println(occurenceMap);
       Optional<Integer> result =  occurenceMap.entrySet()
                .stream()
                .filter(e-> e.getValue() >= sizeOfInput)
                .map(Map.Entry::getKey)
                .sorted( (o1,o2)-> o2.intValue()-o1.intValue())
                .limit(1)
               .findFirst();

       if(result.isPresent()){
           System.out.println("result is :" + result.get());
       }else{
           System.out.println("result is :" + 1);
       }







    }
}
