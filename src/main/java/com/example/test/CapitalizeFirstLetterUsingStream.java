package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class CapitalizeFirstLetterUsingStream {

    public static void main(String args[]) {
        List<String> ls = new ArrayList<>();
        ls.add("akhil");
        ls.add("tara");
        ls.add("hero");
        ls.add("hello");
        ls.add("xyz");
        ls.add("batman");
        ls.add("IronMan");


        System.out.println(ls.stream()
                .map(e -> capitalizeIt(e))
                .toList());
    }

    private static String capitalizeIt(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
    }
}
