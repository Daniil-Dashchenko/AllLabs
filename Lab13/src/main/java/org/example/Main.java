package org.example;

import org.example.entity.Restaurant;
import org.example.exception.BookingException;
import org.example.exception.InvalidRestaurantDataException;
import org.example.exception.RestaurantNotFoundException;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static List<Restaurant> restaurants = new ArrayList<>();
    public static Restaurant findRestaurantByName(String name) throws RestaurantNotFoundException {
        for (Restaurant r : restaurants) {
            if (r.getName().equalsIgnoreCase(name)) {
                return r;
            }
        }
        throw new RestaurantNotFoundException("Ресторан с названием '" + name + "' не найден в системе.");
    }

    public static void main(String[] args) {
        System.out.println("=== 1. Создание ресторанов и проверка InvalidRestaurantDataException ===");

        try {
            restaurants.add(new Restaurant("Италия", "Итальянская", 5, 2, "ул. Ленина, 10"));
            restaurants.add(new Restaurant("Сакура", "Японская", 4, 3, "пр. Независимости, 45"));
            restaurants.add(new Restaurant("Бургер Клаб", "Американская", 3, 1, "ул. Чехова, 5"));
            System.out.println("Все 3 ресторана успешно добавлены.");
        }
        catch (InvalidRestaurantDataException e) {
            System.out.println("Ошибка инициализации: " + e.getMessage());
        }

        try {
            Restaurant badRestaurant = new Restaurant("Сбойный Ресторан", "Французская", 10, 2, "Тест");
        }
        catch (InvalidRestaurantDataException e) {
            System.out.println("Перехвачена ошибка создания: " + e.getMessage());
        }

        System.out.println("\n=== 2. Проверка операций бронирования и BookingException ===");
        try {
            Restaurant italia = findRestaurantByName("Италия");
            italia.bookTable(4);
            italia.bookTable(6);

            italia.bookTable(35);
        }
        catch (RestaurantNotFoundException | BookingException e) {
            System.out.println("Проблема с бронированием: " + e.getMessage());
        }

        System.out.println("\n=== 3. Проверка поиска и RestaurantNotFoundException ===");
        try {
            Restaurant unknown = findRestaurantByName("Париж");
        }
        catch (RestaurantNotFoundException e) {
            System.out.println("Перехвачена ошибка поиска: " + e.getMessage());
        }

        System.out.println("\n=== 4. Проверка обновления рейтинга ===");
        try {
            Restaurant sakura = findRestaurantByName("Сакура");
            sakura.updateRating(5);
            sakura.updateRating(0);
        }
        catch (RestaurantNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidRestaurantDataException e) {
            System.out.println("Перехвачена ошибка изменения рейтинга: " + e.getMessage());
        }

        System.out.println("\n=== Текущее состояние списка ресторанов ===");
        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }
}
