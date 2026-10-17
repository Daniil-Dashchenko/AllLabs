package org.example;

import org.example.entity.Flat;
import org.example.entity.Gender;
import org.example.entity.Human;
import org.example.entity.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую сторону");
        double sideA = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Введите вторую сторону");
        double sideB = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Введите третью сторону");
        double sideC = scanner.nextDouble();
        scanner.nextLine();

        Triangle triangle = new Triangle(sideA, sideB, sideC);
        triangle.perimeter();

        Flat[] flats = new Flat[6];

        flats[0] = new Flat("address1", 2, 450);
        flats[1] = new Flat("address2", 4, 950);
        flats[2] = new Flat("address3", 1, 380);
        flats[3] = new Flat("address4", 3, 1200.3);
        flats[4] = new Flat("address5", 5, 1100.4);
        flats[5] = new Flat("address6", 2, 500);

        Flat maxRoomsFlat = flats[0];
        Flat mostExpensiveFlat = flats[0];

        for (Flat flat : flats) {
            if (flat.getRooms() > maxRoomsFlat.getRooms()) {
                maxRoomsFlat = flat;
            }
            if (flat.getPrice() > mostExpensiveFlat.getPrice()) {
                mostExpensiveFlat = flat;
            }
        }

        System.out.println("Квартира с максимальным количеством комнат:");
        System.out.println(maxRoomsFlat);

        System.out.println("\nСамая дорогая квартира:");
        System.out.println(mostExpensiveFlat);

        Human[] humans = {
                new Human("Александр", Gender.MALE),
                new Human("Мария", Gender.FEMALE),
                new Human("Дмитрий", Gender.MALE),
                new Human("Анна", Gender.FEMALE),
                new Human("Иван", Gender.MALE)
        };

        System.out.println("Список женщин:");

        for (Human human : humans) {
            if (human.getGender() == Gender.FEMALE) {
                System.out.println(human);
            }
        }


    }
}
