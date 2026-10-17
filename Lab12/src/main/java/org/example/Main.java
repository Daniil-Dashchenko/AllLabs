package org.example;

import org.example.entity.*;

import java.util.*;

import static org.example.entity.Game.printGames;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Map<String, Building> buildingMap = new HashMap<>();

        buildingMap.put("ЖК Спутник", new Residential("ЖК Спутник", 1, 16, 120));
        buildingMap.put("ЖК Маяк", new Residential("ЖК Маяк", 2, 25, 200));
        buildingMap.put("Дом на Набережной", new Residential("Дом на Набережной", 3, 5, 30));

        buildingMap.put("БЦ Плаза", new Office("БЦ Плаза", 4, 20, 45));
        buildingMap.put("БЦ Кристалл", new Office("БЦ Кристалл", 5, 12, 25));
        buildingMap.put("Технопарк", new Office("Технопарк", 6, 4, 10));

        buildingMap.put("Городская Клиника №1", new Hospital("Городская Клиника №1", 7, 6, 12));
        buildingMap.put("Детская больница", new Hospital("Детская больница", 8, 4, 8));

        for (Map.Entry<String, Building> entry : buildingMap.entrySet()) {
            System.out.println("Название (Ключ): \"" + entry.getKey() + "\" => " + entry.getValue());
        }

        System.out.println();
        System.out.println("ЗАДАНИЕ 2");
        System.out.println();

        List<Game> games = new ArrayList<>();

        games.add(new Game(1, "Witcher 3", "RPG", 4, List.of(5, 5, 5, 4)));
        games.add(new Game(2, "Flappy Bird", "Arcade", 3, List.of(2, 2, 3, 2)));
        games.add(new Game(3, "Minecraft", "Sandbox", 4, List.of(4, 5, 4, 4)));
        games.add(new Game(4, "Dota 2", "MOBA", 2, List.of(4, 3, 4, 5)));
        games.add(new Game(5, "Unknown Game", "Trash", 1, List.of(1, 2, 2, 1)));
        games.add(new Game(6, "Tetris", "Puzzle", 3, List.of(4, 4, 4, 4)));

        games.removeIf(game -> game.getAverageScore() < 3.0);

        for (Game game : games) {
            if (game.getAverageScore() >= 4.0) {
                game.setRating(game.getRating() + 1);
            }
        }
        printGames(games, 5);

        Collections.sort(games, new Comparator<Game>() {
            @Override
            public int compare(Game g1, Game g2) {
                int scoreCompare = Double.compare(g2.getAverageScore(), g1.getAverageScore());
                if (scoreCompare != 0) {
                    return scoreCompare;
                }
                return g1.getTitle().compareTo(g2.getTitle());
            }
        });

        System.out.println("ИТОГОВЫЙ ОТСОРТИРОВАННЫЙ СПИСОК ИГР");
        for (Game game : games) {
            System.out.printf("ID: %s | Название: %-15s | Средний балл: %.2f\n",
                    game.getId(), game.getTitle(), game.getAverageScore());
        }
    }
}
