package com.example.test;

import java.util.List;
import java.util.stream.Collectors;

public class TestSortedFunction {

    public static void main(String[] args) {
        List<String> names = List.of("akhil", "tara", "one", "two", "three", "nine", "done", "hi");
        List<String> sortedNames = sortGivenList(names);
        System.out.println(sortedNames);
    }

    private static List<String> sortGivenList(List<String> ls) {
        return ls.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
