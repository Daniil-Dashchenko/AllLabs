package org.example.entity;

public class RockMusic extends Music {

    private boolean hasGuitarSolo;

    public RockMusic(String title, String artist, int duration, boolean hasGuitarSolo) {
        super(title, artist, duration);
        this.hasGuitarSolo = hasGuitarSolo;
    }

    @Override
    public String getGenre() {
        return "Рок";
    }

    public void play(String concertHall) {
        System.out.println("Рок-концерт в " + concertHall);
    }
}
