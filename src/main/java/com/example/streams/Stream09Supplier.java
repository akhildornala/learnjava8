package com.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Stream09Supplier {

    public static void main(String args[]) {
        Supplier<Integer> sup = () -> 2;
        System.out.println(sup.get());

        Supplier<List<Integer>> sup2 = ArrayList<Integer>::new;
        System.out.println(sup2.get());

        Supplier<List<String>> sup3 = () -> List.of("one", "two", "three", "four", "five");
        System.out.println(sup3.get());
    }

}
