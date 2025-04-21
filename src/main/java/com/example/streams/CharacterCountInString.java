package com.example.streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCountInString {

    public static void main(String[] args) {
        String input = "hello world";
        Map<Character, Long> map = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));
        System.out.println(map);

    }
}
