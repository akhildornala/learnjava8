package com.example.streams;

import java.util.Comparator;
import java.util.List;

public class Stream17MinMaxFindFirstFindAny {

    public static void main(String args[]) {

        List<IplPlayer> iplPlayerList = IplPlayer.getIplPlayers();

        Comparator<IplPlayer> scoreSort = Comparator.comparing(IplPlayer::getHighScore);

        System.out.println(iplPlayerList.stream()
                .max(scoreSort));

        System.out.println(iplPlayerList.stream()
                .min(scoreSort));
    }
}
