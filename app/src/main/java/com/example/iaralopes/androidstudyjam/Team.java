package com.example.iaralopes.androidstudyjam;

/**
 * Created by Iara Lopes on 29/07/2017.
 */


public class Team {

    private String name;
    private int score;
    private int numberOfPlayers;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void addScore(int score) {
        this.score += score;
    }
}
