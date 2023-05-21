package com.example.streams;

import java.util.List;
import java.util.function.Function;

public class Stream11BehaviourParameterization2 {

    public static void main(String args[]) {
        List<Integer> numbers = List.of(1, 9, 5, 6, 3, 15, 11, 13, 27, 8, 12);

        Function<Integer, Integer> fun = x -> x * 2;
        behaviourFunction(numbers, fun);
    }

    public static void behaviourFunction(List<Integer> numbers, Function<Integer, Integer> fun) {
        numbers.stream()
                .map(fun)
                .forEach(System.out::println);
    }
}
