package com.example.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Stream05SortedDistinctExample {

    public static void main(String args[]) {
        List<Integer> numbers = List.of(34, 23, 46, 68, 9, 7, 87, 9, 1, 87, 1, 677, 1, 2, 90, 1, 34, 46, 87);

        System.out.println("sortedList");
        List<Integer> sortedList = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedList);

        System.out.println("parallelSortedList");
        List<Integer> parallelSortedList = numbers.stream()
                .parallel()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(parallelSortedList);

        System.out.println("distinctNumbers");
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctNumbers);

        System.out.println("parallelDistinctNumbers");
        List<Integer> parallelDistinctNumbers = numbers.stream()
                .parallel()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(parallelDistinctNumbers);

    }
}
