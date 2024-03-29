package com.example.streams;

import java.util.List;
import java.util.function.Predicate;

public class Stream18SumCountAverage {

    public static void main(String args[]) {
        List<IplPlayer> iplPlayerList = IplPlayer.getIplPlayers();
        Predicate<IplPlayer> score50Players = x -> x.getHighScore() >= 50;


        int sum = iplPlayerList.stream()
                .mapToInt(x -> x.getHighScore())
                .sum();
        System.out.println(sum);


    }

    /*
    https://deloittedevelopment.udemy.com/course/functional-programming-with-java/learn/lecture/16544528#search
     */
}
