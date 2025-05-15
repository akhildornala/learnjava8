package com.example.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Top10WithoutSorting {

    public static void main(String args[]){

        List<Integer> ls = new ArrayList<>(List.of(99, 4, 1, 13, 56, 7, 14, 8,  154, 256, 72));
        List<Integer> ls2 = new ArrayList<>(List.of(99, 4, 1, 13, 56, 7, 14, 8,  154, 256, 72));
        Collections.sort(ls2);
        Collections.reverse(ls2);
        ls2.stream()
                .limit(5)
                .forEach(System.out::println);

        int[] arr = new int[10];
        arr[0] = ls.get(0);


        for(int i=0; i< ls.size(); i++){


        }



    }
}
