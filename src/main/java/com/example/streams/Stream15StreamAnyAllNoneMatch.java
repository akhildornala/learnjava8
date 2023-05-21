package com.example.streams;

import java.util.List;
import java.util.function.Predicate;

public class Stream15StreamAnyAllNoneMatch {

    public static void main(String args[]) {


        List<IplPlayer> players = IplPlayer.getIplPlayers();

        Predicate<IplPlayer> score90Predicate = x -> x.getHighScore() >= 90;

        System.out.println(players.stream()
                .allMatch(score90Predicate));

        Predicate<IplPlayer> namePredicate = x -> x.getName().contains("a");
        System.out.println(players.stream()
                .anyMatch(namePredicate));

    }
}
