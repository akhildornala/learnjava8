package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfCharOccurenceUsingStreams {

    public static void main(String[] args) {
        String str = "this is an example program M";
        String[] arr = str.split("");
        List<String> ls = new ArrayList<>(Arrays.asList(arr));
        System.out.println(ls.stream()
                        .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
    }
}
