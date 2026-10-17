package org.example.entity;

import java.util.List;

public class Game {

    private int id;
    private String title;
    private String genre;
    private int rating;
    private List<Integer> playerScores;

    public Game(int id, String title, String genre, int rating, List<Integer> playerScores) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.playerScores = playerScores;
    }

    public double getAverageScore() {
        if (playerScores == null || playerScores.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int score : playerScores) {
            sum += score;
        }
        return sum/playerScores.size();
    }

    public int getRating() {return rating;}
    public void setRating(int rating) {this.rating = rating;}

    public int getId() {return id;}
    public String getTitle() {return title;}

    public static void printGames(List<Game> games, int rating) {
        System.out.println("Вывод игр с рейтингом = " + rating + ":");
        boolean found = false;
        for (Game game : games) {
            if (game.getRating() == rating) {
                System.out.println(" " + game);
                found = true;
            }
        }
        if (!found) {
            System.out.println(" [Игр с таким рейтингом не найдено!]");
        }
    }

    @Override
    public String toString() {
        return String.format("ID: %s | Название: %-15s | Жанр: %-10s | Рейтинг: %d | Ср. балл игроков: %.2f",
                id, title, genre, rating, getAverageScore());
    }


}
