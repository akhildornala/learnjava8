package com.example.streams;

public class IplPlayers {

    public IplPlayers() {

    }


    private int jerseyNumber;
    private String name;
    private String teamName;
    private int highScore;

    public IplPlayers(int jerseyNumber, String name, String teamName, int highScore) {
        this.jerseyNumber = jerseyNumber;
        this.name = name;
        this.teamName = teamName;
        this.highScore = highScore;
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
}
