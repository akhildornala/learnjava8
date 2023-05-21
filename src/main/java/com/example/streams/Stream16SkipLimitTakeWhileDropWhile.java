package com.example.streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Stream16SkipLimitTakeWhileDropWhile {

    public static void main(String args[]) {
        List<IplPlayer> iplPlayerList = IplPlayer.getIplPlayers();

        System.out.println("##################################################");
        System.out.println("iplPlayersList");
        iplPlayerList.stream()
                .forEach(System.out::println);


        System.out.println("##################################################");
        System.out.println("limit 4 iplPlayersList");
        iplPlayerList.stream()
                .limit(4)
                .forEach(System.out::println);

        System.out.println("##################################################");
        System.out.println("skip 3 iplPlayersList");
        iplPlayerList.stream()
                .skip(3)
                .forEach(System.out::println);


        System.out.println("##################################################");
        System.out.println("skip 2 limit 4 iplPlayersList");
        iplPlayerList.stream()
                .skip(2)
                .limit(4)
                .forEach(System.out::println);

        System.out.println("##################################################");
        System.out.println("skip 2 limit 100 iplPlayersList");
        iplPlayerList.stream()
                .skip(2)
                .limit(100)
                .forEach(System.out::println);

        System.out.println("##################################################");
        System.out.println("skip 10 limit 100 iplPlayersList");
        iplPlayerList.stream()
                .skip(10)
                .limit(100)
                .forEach(System.out::println);

        System.out.println("##################################################");
        System.out.println("score 50 takewhile");
        Comparator<IplPlayer> scoreComparator = Comparator.comparing(IplPlayer::getHighScore).reversed();
        Predicate<IplPlayer> score50Predicate = x -> x.getHighScore() > 50;
        iplPlayerList.stream()
                .sorted(scoreComparator)
                .takeWhile(score50Predicate)
                .forEach(System.out::println);
        // it will keep taking elements till condition gets true. once conditions becomes false,  it will stop execution


        System.out.println("##################################################");
        System.out.println("score 50 dropWhile");

        iplPlayerList.stream()
                .sorted(scoreComparator)
                .dropWhile(score50Predicate)
                .forEach(System.out::println);
        // it will keep dropping elements till condition gets false. once conditions becomes true,  it will start execution


    }
}
