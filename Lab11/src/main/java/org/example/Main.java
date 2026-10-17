package org.example;

import org.example.entity.ClassicalMusic;
import org.example.entity.Music;
import org.example.entity.RockMusic;

public class Main {

    public static void main(String[] args) {
        Music genericMusic = new Music("Абстрактный трек", "Неизвестный автор", 180);
        RockMusic rockTrack = new RockMusic("It's My Life", "Bon Jovi", 224, true);
        ClassicalMusic classicalTrack = new ClassicalMusic("Времена года: Зима", "Антонио Вивальди", 530, "Скрипка");

        rockTrack.play();
        rockTrack.play(3);
        rockTrack.play(1.2);
        rockTrack.play("Stadium");

        System.out.println();

        Music[] playlist = {genericMusic, rockTrack, classicalTrack};

        for (Music track : playlist) {
            track.play();
            System.out.println("Жанр трека: " + track.getGenre());
        }

        for (Music track : playlist) {
            if (track instanceof RockMusic) {
                RockMusic rock = (RockMusic) track;
                System.out.println(rock.getTitle() + " — это рок-музыка");
                rock.play("Croke Park");
            }
            else if (track instanceof ClassicalMusic) {
                ClassicalMusic classical = (ClassicalMusic) track;
                System.out.println(classical.getTitle() + " — это классика");
                classical.play(true);
            }
            else {
                System.out.println(track.getTitle() + " — это базовый музыкальный объект.");
            }
        }
    }
}
