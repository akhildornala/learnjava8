package com.example.streams;

import java.util.List;
import java.util.function.Supplier;

public class Stream14MethodReference {

    public static void main(String args[]) {
        List<String> teams = List.of("mumbai indian", "sur risers hyd", "royal challengers bangalore",
                "chennai super kings", "kkr"
        );

        System.out.println("#######################################################");
        System.out.println("normal for each");
        teams.stream()
                .map(t -> t.toUpperCase())
                .forEach(System.out::println);


        System.out.println("#######################################################");
        System.out.println("method reference");
        teams.stream()
                .map(String::toUpperCase)
                .forEach(Stream14MethodReference::testMethodReference);

        System.out.println("#######################################################");
        System.out.println("constructor reference");
        Supplier<String> sup = () -> new String();
        Supplier<String> sup2 = String::new;

    }

    private static void testMethodReference(String str) {
        System.out.println(str);
    }

    /*
    https://deloittedevelopment.udemy.com/course/functional-programming-with-java/learn/lecture/16544512#questions
     */
}
