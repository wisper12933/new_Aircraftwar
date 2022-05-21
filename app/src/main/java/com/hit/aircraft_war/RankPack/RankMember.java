package com.hit.aircraft_war.RankPack;

public class RankMember {
    private int rank;
    private String name;
    private int score;
    private String time;

    public RankMember(int rank, String name, int score, String time) {
        this.rank = rank;
        this.name = name;
        this.score = score;
        this.time = time;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getTime() {
        return time;
    }
}
