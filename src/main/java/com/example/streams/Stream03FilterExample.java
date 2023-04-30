package com.example.streams;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream03FilterExample {
    public static void main(String args[]) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        System.out.println("#################### print even numbers");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(Stream03FilterExample::printElement);

        System.out.println("#################### print odd numbers * 2");
        numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .forEach(Stream03FilterExample::printElement);


        System.out.println("#################### print odd numbers * 2 using function");
        Function<Integer, Integer> fun1 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 3;
            }
        };

        numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> fun1.apply(n))
                .forEach(Stream03FilterExample::printElement);

        System.out.println("#################### print even numbers * numbers using lamda expression");
        Function<Integer, Integer> fun2 = a -> a * a;

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> fun2.apply(n))
                .forEach(Stream03FilterExample::printElement);

        System.out.println("#################### courses length");
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        Function<String, Integer> fun3 = x -> x.length();
        List<Integer> filteredCoursesLength = courses.stream()
                .filter(c -> c.contains("Spring"))
                .map(n -> fun3.apply(n))
                .collect(Collectors.toList());
        System.out.println(filteredCoursesLength);
    }

    public static void printElement(Integer num) {
        System.out.println(num);
    }
}
