package com.example.streams;

import java.util.List;
import java.util.function.*;

public class Stream10FunctionalInterface {
    public static void main(String args[]) {
        BinaryOperator<Integer> biOp1 = (num1, num2) -> num1 + num2;
        int sum = biOp1.apply(2, 4);
        System.out.println(sum);

        Supplier<String> sup1 = () -> "Akhil Dornala";
        Supplier<List<String>> sup2 = () -> List.of("one", "two");
        System.out.println(sup2.get());

        UnaryOperator<Integer> un1 = (a) -> a + 1;
        System.out.println(un1.apply(9));

        BiPredicate<String, Integer> biPredicate1 = (str, num) -> str.length() > 3 && num % 2 == 0;
        System.out.println(biPredicate1.test("akhildornala", 9));
        System.out.println(biPredicate1.test("akhildornala", 6));


        Supplier<List<String>> numbersSupplier = () -> List.of("one", "two", "three", "four", "five");
        numbersSupplier.get()
                .stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

//        IntToDoubleFunction<Double> fun3 = new IntToDoubleFunction() {
//            @Override
//            public double applyAsDouble(int value) {
//                return 0;
//            }
//        };
//
//        Supplier<List<Integer>> numbersSupplier2 = () -> List.of(1, 2, 3, 4, 5);
//        numbersSupplier2.get()
//                .stream()
//                .map(Integer::intValue)
//                .map(IntToDoubleFunction::applyAsDouble)

    }
}
