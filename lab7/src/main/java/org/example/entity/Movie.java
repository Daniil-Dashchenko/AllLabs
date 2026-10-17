package org.example.entity;

public class Movie {
    private String title;
    private String director;
    private int duration;

    public static int totalMovies = 0;
    public static int totalDuration = 0;

    public Movie(String title, String director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;

        totalMovies++;
        totalDuration += duration;
    }

    public String getTitle() {return title;}
    public String getDirector() {return director;}
    public int getDuration() {return duration;}

    public static double getAverageDuration() {
        if (totalMovies == 0) {
            return 0;
        }

        return (double) totalDuration / totalMovies;
    }
}
