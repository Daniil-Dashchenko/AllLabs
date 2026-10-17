import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int task;
        do {
            System.out.println("\nЗадания");
            System.out.println("1 - Перевод километров в метры");
            System.out.println("2 - Проверка кратности");
            System.out.println("3 - Вывод чисел кратных/некратных 3");
            System.out.println("0 - Выход из программы");
            System.out.print("Введите номер задания: ");

            task = scanner.nextInt();

            switch (task) {
                case 1:
                    System.out.println("Введите километры:");
                    int km = scanner.nextInt();
                    int metres = km * 1000;
                    System.out.println("Вы ввели: " + km + " километров. Это равно: " + metres + " метров.");
                    break;
                case 2:
                    System.out.println("Введите число A:");
                    int numberA = scanner.nextInt();
                    System.out.println("Введите число B:");
                    int numberB = scanner.nextInt();
                    int result = numberA % numberB;
                    int res = numberA / numberB;
                    if (result == 0) {
                        System.out.println("Число A: " + numberA + " делится на число B: " + numberB + " без остатка. Результат: " + res);
                    }
                    else {
                        System.out.println("Число A: " + numberA + " не делится на число B: " + numberB + " без остатка. Результат: " + res + " Остаток: " + result);
                    }
                    break;
                case 3:
                    System.out.println("Числа, кратные 3 в диапазоне от 1 до 100:");
                    int y = 102;
                    do {
                        if (y % 3 == 0) {
                            System.out.print(y + " ");
                        }
                        y++;
                    }
                    while (y <= 100);

                    System.out.println("\nЧисла, не кратные 3 в диапазоне от 1 до 100:");
                    for (int i = 10; i <= 100; i++) {
                        if (i % 3 != 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Выход из программы");
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
