package com.example.streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Functional01BehaviourParameterization {
    public static void main(String args[]) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        System.out.println("even number");
        Predicate<Integer> evenNumbersPredicate = n -> n % 2 == 0;
        fbp1(numbers, evenNumbersPredicate);


        System.out.println("odd numbers");
        Predicate<Integer> oddNumbersPredicate = n -> n % 2 != 0;
        fbp1(numbers, oddNumbersPredicate);

        System.out.println("multiply 2 function");
        Function<Integer, Integer> multiply2Function = n -> n * 2;
        fbp2(numbers, multiply2Function);

        System.out.println("multiply 2 function");
        Function<Integer, Integer> multiply5Function = n -> n * 5;
        fbp2(numbers, multiply5Function);

        Function<Integer, String> strFunction = n -> n.toString();

    }

    private static void fbp1(List<Integer> number, Predicate<Integer> predicate) {
        number.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }

    private static void fbp2(List<Integer> numbers, Function<Integer, Integer> function) {
        numbers.stream()
                .map(function)
                .forEach(System.out::println);
    }
}
