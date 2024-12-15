package com.example.test;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String inputString = "my name is Akhil Dornala";
        List<Character> ls = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        System.out.println(ls);
        Map<Character, Long> frequencyMap = inputString.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !Character.isWhitespace(c))
                .map(c -> Character.toLowerCase(c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyMap);
    }
}
