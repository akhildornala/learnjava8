package com.example.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream06SortedExample {
    public static void main(String args[]) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        System.out.println("################## sorted courses");
        sortFun(courses);

        System.out.println("################## naturalSortFun");
        naturalSortFun(courses);

        System.out.println("################## naturalReverseSortFun");
        naturalReverseSortFun(courses);

        System.out.println("################## sortByLength");
        sortByLength(courses);

        System.out.println("################## sortByComparator");
        sortByComparator(courses);

    }

    public static void sortFun(List<String> courses) {
        courses.stream()
                .sorted()
                .forEach(System.out::println);
    }

    public static void naturalSortFun(List<String> courses) {
        courses.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }

    public static void naturalReverseSortFun(List<String> courses) {
        courses.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    public static void sortByLength(List<String> courses) {
        courses.stream()
                .sorted(Comparator.comparing(c -> c.length()))
                .forEach(System.out::println);


    }

    public static void sortByComparator(List<String> courses) {
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        courses.stream()
                .sorted(comp)
                .forEach(System.out::println);
    }
}
