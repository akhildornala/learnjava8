package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RepeatedCharsInString {

    public static void main(String[] args) {
        String input = "programming";
        List<String> ls = new ArrayList<>(Arrays.asList(input.split("")));
//        System.out.println(ls);
        String rep = "";
        for(String s: ls){
            if(rep.contains(s)){
                System.out.println(s +"  repeated");
            }
            rep+=s;
        }

        List<String> distinctList = ls.stream()
                .distinct()
                .toList();

        System.out.println(ls);
        System.out.println(distinctList);

    }
}
