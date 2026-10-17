package org.example.entity;

import org.example.exception.BookingException;
import org.example.exception.InvalidRestaurantDataException;

public class Restaurant {

    private String name;
    private String cuisine;
    private int rating;
    private int priceLevel;
    private String address;
    private int totalTables = 10;
    private int bookedTables = 0;

    public Restaurant(String name, String cuisine, int rating, int priceLevel, String address) {
        if (name == null || name.isEmpty()) {
            throw new InvalidRestaurantDataException("Имя ресторана не может быть пустым.");
        }
        if (rating < 1 || rating > 5) {
            throw new InvalidRestaurantDataException("Рейтинг должен быть в диапазоне от 1 до 5. Передано: " + rating);
        }
        if (priceLevel < 1 || priceLevel > 3) {
            throw new InvalidRestaurantDataException("Уровень цен должен быть в диапазоне от 1 до 3. Передано: " + priceLevel);
        }
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
        this.priceLevel = priceLevel;
        this.address = address;
    }

    public void bookTable(int persons) throws BookingException {
        if (persons <= 0) {
            throw new BookingException("Количество гостей должно быть больше 0.");
        }

        int tablesNeeded = (int) Math.ceil((double) persons / 4);

        if (bookedTables + tablesNeeded > totalTables) {
            throw new BookingException("Невозможно забронировать столик на " + persons + " чел. Нет свободных мест.");
        }

        bookedTables += tablesNeeded;
        System.out.println("Успешно забронировано мест: " + persons + " (" + tablesNeeded + " ст.) в ресторане " + name);
    }

    public void updateRating(int newRating) {
        if (newRating < 1 || newRating > 5) {
            throw new InvalidRestaurantDataException("Новый рейтинг должен быть от 1 до 5. Передано: " + newRating);
        }
        this.rating = newRating;
        System.out.println("Рейтинг ресторана " + name + " обновлен до: " + newRating);
    }

    public String getName() { return name; }
    public int getRating() { return rating; }

    @Override
    public String toString() {
        return String.format("Ресторан '%s' [%s кухня], Рейтинг: %d/5, Цена: %d/3, Адрес: %s (Столов занято: %d/%d)",
                name, cuisine, rating, priceLevel, address, bookedTables, totalTables);
    }
}
