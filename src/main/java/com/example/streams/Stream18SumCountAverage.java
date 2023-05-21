package com.example.streams;

import java.util.List;
import java.util.function.Predicate;

public class Stream18SumCountAverage {

    public static void main(String args[]) {
        List<IplPlayer> iplPlayerList = IplPlayer.getIplPlayers();
        Predicate<IplPlayer> score50Players = x -> x.getHighScore() >= 50;


//        iplPlayerList.stream()
//                .map(x-> x.getHighScore())
//                .sum



    }
}
