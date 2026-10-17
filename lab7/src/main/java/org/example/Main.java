package org.example;

import org.example.entity.Movie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Начало", "Кристофер Нолан", 137);
        Movie movie2 = new Movie("Криминальное чтиво", "Квентин Тарантино", 154);
        Movie movie3 = new Movie("Интерстеллар", "Кристофер Нолан", 169);
        Movie movie4 = new Movie("Зеленая миля", "Фрэнк Дарабонт", 189);

        System.out.println("Средняя длительность фильма: " + Movie.getAverageDuration() + " мин.");
    }
}
