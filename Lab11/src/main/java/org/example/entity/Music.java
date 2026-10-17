package org.example.entity;

public class Music {

    private String title;
    private String artist;
    private int duration;

    public Music(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {return title;}
    public String getArtist() {return artist;}
    public int getDuration() {return duration;}

    public void play() {
        System.out.println("Играет музыка:" + artist + " - " + title);
    }

    public void play(int repeat) {
        System.out.println("Играет: " + repeat + " раз: " + artist + " - " + title);
    }

    public void play(double speed) {
        System.out.println("Играет со скоростью " + speed + "x: " + artist + " - " + title);
    }

    public String getGenre() {
        return "Неизвестный жанр";
    }
}
