package org.example;

import org.example.entity.Basketball;
import org.example.entity.Football;
import org.example.entity.SportGame;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // SportGame game = new SportGame("Какая-то игра", 10, 60);

        SportGame[] games = new SportGame[5];

        games[0] = new Football("Финал Лиги Чемпионов", 22, 90, 3);
        games[1] = new Football("Матч Ла Лиги", 22, 90, 1);
        games[2] = new Football("Товарищеский матч", 22, 90, 0);

        games[3] = new Basketball("Матч НБА", 10, 48, 4);
        games[4] = new Basketball("Кубок Европы", 10, 40, 4);

        System.out.println("Вывод информации о матчах и их правил:");
        for (SportGame game : games) {
            game.displayInfo();
        }
    }
}