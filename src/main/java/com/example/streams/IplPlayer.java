package com.example.streams;

import java.util.List;

public class IplPlayer {


    private int jerseyNumber;
    private String name;
    private String teamName;
    private int highScore;

    public IplPlayer() {

    }

    public IplPlayer(int jerseyNumber, String name, String teamName, int highScore) {
        this.jerseyNumber = jerseyNumber;
        this.name = name;
        this.teamName = teamName;
        this.highScore = highScore;
    }

    public static List<IplPlayer> getIplPlayers() {
        return List.of(
                new IplPlayer(10, "sachin", "mi", 100),
                new IplPlayer(18, "virat", "rcb", 80),
                new IplPlayer(17, "ab de villiers", "rcb", 85),
                new IplPlayer(53, "david warner", "srh", 100),
                new IplPlayer(99, "surya kumar", "mi", 99),
                new IplPlayer(50, "chris gayle", "punjab", 49)
        );
    }


    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    @Override
    public String toString() {
        return "IplPlayer{" +
                "jerseyNumber=" + jerseyNumber +
                ", name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                ", highScore=" + highScore +
                '}';
    }
}
