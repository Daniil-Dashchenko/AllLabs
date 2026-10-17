package org.example.entity;

public class ClassicalMusic extends Music {

    private String mainInstrument;

    public ClassicalMusic(String title, String artist, int duration, String mainInstrument) {
        super(title, artist, duration);
        this.mainInstrument = mainInstrument;
    }

    @Override
    public String getGenre() {
        return "Классика";
    }

    public void play(boolean isLiveOrchestra) {
        if (isLiveOrchestra) {
            System.out.println("Исполняет живой оркестр. Главный инструмент: " + mainInstrument);
        }
        else {
            System.out.println("Играет студйиная запись. Главный инструмент: " + mainInstrument);
        }
    }
}
