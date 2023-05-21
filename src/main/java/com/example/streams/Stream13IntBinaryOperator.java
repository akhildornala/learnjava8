package com.example.streams;

import java.util.List;
import java.util.function.IntBinaryOperator;

public class Stream13IntBinaryOperator {
    public static void main(String args[]) {
        List<Integer> numbers = List.of(1, 9, 5, 6, 3, 15, 11, 13, 27, 8, 12);

        IntBinaryOperator ib = (x, y) -> x + y;
        int sum = ib.applyAsInt(2, 3);
        System.out.println("sum:" + sum);

    }
}
