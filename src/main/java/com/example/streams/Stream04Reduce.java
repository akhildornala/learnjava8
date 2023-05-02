package com.example.streams;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Stream04Reduce {

    public static void main(String args[]) {
        List<Integer> ls = List.of(34, 23, 46, 68, 9, 7, 87, 677, 1, 2, 90, 11);
        int sumUsingTraditionalApproach = sumUsingTraditionalApproach(ls);
        System.out.println("sumUsingTraditionalApproach:" + sumUsingTraditionalApproach);

        int sumUsingReduceOP = sumUsingReduceOP(ls);
        System.out.println("sumUsingReduceOP:" + sumUsingReduceOP);

        int sumUsingReduceOP2 = sumUsingReduceOP2(ls);
        System.out.println("sumUsingReduceOP2:" + sumUsingReduceOP2);

        int sumUsingReduceOP3 = sumUsingReduceOP3(ls);
        System.out.println("sumUsingReduceOP3:" + sumUsingReduceOP3);

        int sumUsingReduceOP4 = sumUsingReduceOP4(ls);
        System.out.println("sumUsingReduceOP4:" + sumUsingReduceOP4);

    }

    public static int sumUsingTraditionalApproach(List<Integer> ls) {
        int sum = 0;
        for (Integer a : ls) {
            sum += a;
        }
        return sum;
    }

    public static int sumUsingReduceOP(List<Integer> ls) {
        return ls.stream()
                .reduce(0, Stream04Reduce::addTwoNumber);
    }

    public static int sumUsingReduceOP2(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (a, b) -> a + b);
    }

    public static int sumUsingReduceOP3(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, Integer::sum);
    }

    public static int sumUsingReduceOP4(List<Integer> numbers) {
        BinaryOperator<Integer> biOP = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        /*
        BinaryOperator , input and output should be of same type
         */
//        BinaryOperator<Integer> biOP3 = (String num1, String num2) -> num1.length() + num2.length();

        BinaryOperator<Integer> biOP2 = (num1, num2) -> num1 + num2;

        BiFunction<Integer, Integer, Integer> biFunction = (num1, num2) -> num1 + num2;

        return numbers.stream()
                .reduce(0, biOP2);
    }

    public static int addTwoNumber(int aggregator, int nextNumber) {
        System.out.println(aggregator + "    " + nextNumber);
        return aggregator + nextNumber;
    }
}
