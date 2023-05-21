package com.example.streams;

import java.util.List;
import java.util.function.Predicate;

public class Stream11BehaviourParameterization {

    public static void main(String args[]) {

        List<Integer> numbers = List.of(1, 9, 5, 6, 3, 15, 11, 13, 27, 8, 12);

//        System.out.println("even numbers");
//        numbers.stream()
//                .filter(x -> x % 2 == 0)
//                .forEach(System.out::println);
//
//
//        System.out.println("odd numbers");
//        numbers.stream()
//                .filter(x -> x % 2 != 0)
//                .forEach(System.out::println);

        Predicate<Integer> evenPredicate = x -> x % 2 == 0;
        Predicate<Integer> oddPredicate = x -> x % 2 != 0;

//        System.out.println("even numbers");
//        numbers.stream()
//                .filter(evenPredicate)
//                .forEach(System.out::println);
//
//        System.out.println("odd numbers");
//        numbers.stream()
//                .filter(oddPredicate)
//                .forEach(System.out::println);

        System.out.println("even predicate");
        behaviourParam(numbers, evenPredicate);
        System.out.println("odd predicate");
        behaviourParam(numbers, oddPredicate);

        System.out.println("other predicate");
        int divider = 3;
        Predicate<Integer> otherPredicate = x -> x % divider == 0;
        behaviourParam(numbers, otherPredicate);

    }

    public static void behaviourParam(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }





    /*
    https://deloittedevelopment.udemy.com/course/functional-programming-with-java/learn/lecture/16544488#questions
     */
}
