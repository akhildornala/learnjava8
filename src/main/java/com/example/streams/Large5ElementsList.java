package com.example.streams;

import java.util.Comparator;
import java.util.List;

public class Large5ElementsList {

    public static void main(String[] args) {
        // Create a list with 5 elements
        List<Integer> list = List.of(99, 12, -7, 0, 9, 3, 2, 5);

        List<Integer> top5Elements = list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(5)
                .toList();

        // Print the list
        System.out.println("List: " + top5Elements);

        // Print the size of the list
        System.out.println("Size of the list: " + list.size());
    }
}
