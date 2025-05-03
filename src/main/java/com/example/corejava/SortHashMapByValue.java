package com.example.corejava;

import java.util.*;
import java.util.stream.Collectors;

public class SortHashMapByValue {

    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("David", 95);
        scores.put("Jane", 80);
        scores.put("Mary", 97);
        scores.put("Lisa", 78);
        scores.put("Dino", 65);

        System.out.println(scores);

        scores = sortByValue(scores);

        System.out.println(scores);

    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> scores) {
        Map<String, Integer> sortedByValue = new LinkedHashMap<>();

        List<Map.Entry<String, Integer>> entryList = scores.entrySet()
                .stream()
                .collect(Collectors.toList());

        Comparator<Map.Entry<String, Integer>> comp = (o1, o2) -> o2.getValue().compareTo(o1.getValue());
        entryList.sort(comp);
        Map<String, Integer> sortedMap = entryList.stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o1, LinkedHashMap::new));


        System.out.println(sortedMap);

        return sortedMap;
    }
}
