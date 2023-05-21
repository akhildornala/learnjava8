package com.example.streams;

import java.util.Comparator;
import java.util.List;

public class Stream16Comparator {

    public static void main(String args[]) {
        List<IplPlayer> playersList = IplPlayer.getIplPlayers();

        System.out.println("###########################################");
        System.out.println("name sort");
        Comparator<IplPlayer> teamNameComp = Comparator.comparing(IplPlayer::getTeamName);
        playersList.stream()
                .sorted(teamNameComp)
                .forEach(System.out::println);


        System.out.println("###########################################");
        System.out.println("name and score sort");
        Comparator<IplPlayer> nameAndScoreComp = Comparator.comparing(IplPlayer::getTeamName)
                .thenComparing(IplPlayer::getHighScore);
        playersList.stream()
                .sorted(nameAndScoreComp)
                .forEach(System.out::println);


        System.out.println("###########################################");
        System.out.println("name and score reverse sort");
        Comparator<IplPlayer> nameAndScoreReverseComp = Comparator.comparing(IplPlayer::getTeamName)
                .thenComparing(IplPlayer::getHighScore)
                .reversed();
        playersList.stream()
                .sorted(nameAndScoreReverseComp)
                .forEach(System.out::println);

        System.out.println("###########################################");
        System.out.println("name and score reverse correct sort");
        Comparator<IplPlayer> nameAndScoreReverseCorrectComp = new Comparator<IplPlayer>() {
            @Override
            public int compare(IplPlayer o1, IplPlayer o2) {
                if (o1.getTeamName().equals(o2.getTeamName())) {
                    return o2.getHighScore() - o1.getHighScore();
                } else {
                    return o1.getTeamName().compareTo(o2.getTeamName());
                }
            }
        };
        playersList.stream()
                .sorted(nameAndScoreReverseCorrectComp)
                .forEach(System.out::println);
    }
}
