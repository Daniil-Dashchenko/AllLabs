import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int task;
        do {
            System.out.println("\nЗадания");
            System.out.println("1 - Поиск максимального");
            System.out.println("2 - Умножение матрицы");
            System.out.print("Введите номер задания: ");
            task = scanner.nextInt();
            Random random = new Random();
            switch (task) {
                case 1:
                    System.out.println("Введите размер массива");
                    int n = scanner.nextInt();
                    int mas[] = new int[n];
                    System.out.println("Массив: ");
                    for (int i = 0; i < mas.length; i++) {
                        //  mas[i] = random.nextInt(100);
                        mas[i] = scanner.nextInt();
                        System.out.println("[" + i + "] " + mas[i]);
                    }
                    int maxIndex = 0;
                    for (int i = 1; i < mas.length; i++) {
                        if (mas[i] > mas[maxIndex]) {
                            maxIndex = i;
                        }
                    }

                    System.out.println("Индекс максимального элемента: " + maxIndex);
                    break;
                case 2:
                    int[][] matrix = new int[5][5];
                    System.out.println("Исходная матрица:");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            matrix[i][j] = random.nextInt(10) + 1;
                            System.out.print(matrix[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    System.out.print("\nВведите число X ");
                    int x = scanner.nextInt();

                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            matrix[i][j] *= x;
                        }
                    }

                    System.out.println("\nМатрица после умножения на " + x + ":");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.print(matrix[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Такого задания нету. Попробуйте еще раз.");
                    break;
            }
        }
        while (task != 0);
        scanner.close();
    }
}