package org.example.entity;

public abstract class SportGame {

    private String name;
    private int players;
    private int duration;

    public SportGame(String name, int players, int duration) {
        this.name = name;
        this.players = players;
        this.duration = duration;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getPlayers() {return players;}
    public void setPlayers(int players) {this.players = players;}

    public int getDuration() {return duration;}
    public void setDuration(int duration) {this.duration = duration;}

    public abstract String getRules();
    public abstract String getScore();

    public void displayInfo() {
        System.out.println("Игра: " + name + " | Количество игроков: " + players + " | Длительность: " + duration + " мин.");
    }
}
