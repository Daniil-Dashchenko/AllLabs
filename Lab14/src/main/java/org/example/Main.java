package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("--- Задание 1: Информация о школе ---");
            task1();

            System.out.println("\n--- Задание 2: 10 целых чисел с клавиатуры ---");
            task2();

            System.out.println("\n--- Задание 3: Разделение случайных чисел (квадраты) ---");
            task3();

            System.out.println("\n--- Задание 4: 10 вещественных значений напряжения ---");
            task4();

            System.out.println("\n--- Задание 5: Подсчет чисел в диапазоне от 1 до 100 ---");
            task5();

        }
        catch (IOException e) {
            System.err.println("Общая ошибка ввода-вывода: " + e.getMessage());
        }
    }

    public static void task1() throws IOException {
        Path filePath = Paths.get("school_info.txt");

        String info = "Название: Средняя школа №8\nАдрес: ул. Школьная, 12\nГод основания: 1995\nСпециализация: Математический уклон";
        Files.writeString(filePath, info);

        System.out.println("Имя файла: " + filePath.getFileName());
        System.out.println("Абсолютный путь: " + filePath.toAbsolutePath());
        System.out.println("Размер файла: " + Files.size(filePath) + " байт");
        System.out.println("Существует: " + Files.exists(filePath));

        System.out.println("Содержимое файла:");
        String content = Files.readString(filePath);
        System.out.println(content);
    }

    public static void task2() throws IOException {
        Path filePath = Paths.get("f_task2.txt");
        Scanner scanner = new Scanner(System.in);
        List<String> inputNumbers = new ArrayList<>();

        System.out.println("Введите 10 целых чисел через пробел или с новой строки:");
        for (int i = 0; i < 10; i++) {
            if (scanner.hasNextInt()) {
                inputNumbers.add(String.valueOf(scanner.nextInt()));
            }
        }

        Files.write(filePath, inputNumbers);

        List<String> lines = Files.readAllLines(filePath);
        System.out.print("Числа из файла: ");

        int negativeCount = 0;
        for (String line : lines) {
            int num = Integer.parseInt(line);
            System.out.print(num + " ");
            if (num < 0) {
                negativeCount++;
            }
        }
        System.out.println("\nКоличество отрицательных чисел: " + negativeCount);
    }

    public static void task3() throws IOException {
        Path fileF = Paths.get("f_task3.txt");
        Path fileG = Paths.get("g_task3.txt");
        Path fileH = Paths.get("h_task3.txt");

        Random random = new Random();
        List<String> randomNumbers = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            randomNumbers.add(String.valueOf(random.nextInt(200) + 1));
        }
        Files.write(fileF, randomNumbers);

        List<String> srcLines = Files.readAllLines(fileF);
        List<String> squares = new ArrayList<>();
        List<String> others = new ArrayList<>();

        for (String line : srcLines) {
            int num = Integer.parseInt(line);

            double sqrt = Math.sqrt(num);
            if (sqrt == (int) sqrt) {
                squares.add(line);
            }
            else {
                others.add(line);
            }
        }

        Files.write(fileG, squares);
        Files.write(fileH, others);

        System.out.println("Исходные числа (f): " + srcLines);
        System.out.println("Числа-квадраты (g): " + squares);
        System.out.println("Остальные числа (h): " + others);
    }

    public static void task4() throws IOException {
        Path filePath = Paths.get("voltage.txt");
        Scanner scanner = new Scanner(System.in);
        List<String> voltages = new ArrayList<>();

        System.out.println("Введите 10 вещественных значений напряжения (например, 220,5):");
        for (int i = 0; i < 10; i++) {
            if (scanner.hasNextDouble()) {
                voltages.add(String.valueOf(scanner.nextDouble()));
            }
            else {
                scanner.next();
                i--;
            }
        }

        Files.write(filePath, voltages);

        List<String> lines = Files.readAllLines(filePath);
        double sum = 0;
        System.out.print("Считанные значения напряжения: ");
        for (String line : lines) {
            double v = Double.parseDouble(line);
            System.out.print(v + "V; ");
            sum += v;
        }

        double average = sum / lines.size();
        System.out.printf("\nСреднее напряжение: %.2f V\n", average);
    }

    public static void task5() throws IOException {
        Path fileF = Paths.get("f_task5.txt");
        Random random = new Random();
        List<String> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(String.valueOf(random.nextInt(200) - 50));
        }
        Files.write(fileF, numbers);

        List<String> lines = Files.readAllLines(fileF);
        int countInRange = 0;

        System.out.print("Числа в файле: ");
        for (String line : lines) {
            int num = Integer.parseInt(line);
            System.out.print(num + " ");
            if (num >= 1 && num <= 100) {
                countInRange++;
            }
        }

        System.out.println("\nКоличество чисел в диапазоне от 1 до 100: " + countInRange);
    }
}
