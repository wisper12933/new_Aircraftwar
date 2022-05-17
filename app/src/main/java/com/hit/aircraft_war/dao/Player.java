package com.hit.aircraft_war.dao;

public class Player {

    private int playerID;
    private int score;
    private String playerName;
    private String playDate;

    public Player(int playerID, int score, String playerName, String playDate){
        this.playerID = playerID;
        this.score = score;
        this.playerName = playerName;
        this.playDate = playDate;
    }

    public int getPlayerID(){
        return playerID;
    }
    public void setPlayerID(int playerID){
        this.playerID = playerID;
    }
    public int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score = score;
    }
    public String getPlayerName(){
        return playerName;
    }
    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }
    public String getPlayDate(){
        return playDate;
    }
    public void setPlayDate(String playDate){
        this.playDate = playDate;
    }
}
