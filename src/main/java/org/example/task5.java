package org.example;

import java.util.Scanner;

public class task5 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            printMenu();
            int choice = readInt();
            if (choice == 1) {
                performCalculation();
            } else if (choice == 2) {
                printAboutProgram();
            } else if (choice == 3) {
                printAboutDeveloper();
            } else if (choice == 4) {
                System.out.println("Выход из программы. До свидания!");
                running = false;
            } else {
                System.out.println("Ошибка: такого пункта меню нет. Попробуйте снова.");
            }
        }
    }

    static void printMenu() {
        System.out.println("========================================");
        System.out.println("        ГЛАВНОЕ МЕНЮ ПРОГРАММЫ");
        System.out.println("========================================");
        System.out.println("1. Выполнить расчёт площади круга");
        System.out.println("2. Информация о программе");
        System.out.println("3. Информация о разработчике");
        System.out.println("4. Выход");
        System.out.println("========================================");
    }

    static void performCalculation() {
        System.out.println("\n--- Расчёт площади круга: S = 3.14 * r * r ---");
        double r = readPositiveDouble();
        if (r == -1) {
            System.out.println("Расчёт отменён.");
            return;
        }
        double s = 3.14 * r * r;
        System.out.println("Площадь круга = " + s);
    }

    static void printAboutProgram() {
        System.out.println("\n--- О программе ---");
        System.out.println("Название: Калькулятор площади круга");
        System.out.println("Назначение: вычисление площади круга по формуле S = 3.14 * r * r.");
        System.out.println("Версия: 2.0 (лабораторная работа 1, доработанная).");
    }

    static void printAboutDeveloper() {
        System.out.println("\n--- О разработчике ---");
        System.out.println("Студент: Видякин Михаил Александрович");
        System.out.println("Группа: РИ-250912");
        System.out.println("Учебное заведение: УрФУ");
    }

    static int readInt() {
        while (true) {
            System.out.print("Выберите пункт меню: ");
            String line = scanner.nextLine();
            if (line.equals("exit") || line.equals("выход")) {
                return 4;
            }
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число (или 'exit' для выхода).");
            }
        }
    }

    static double readPositiveDouble() {
        while (true) {
            System.out.print("Введите радиус (r > 0), или 'exit' для отмены: ");
            String line = scanner.nextLine();
            if (line.equals("exit") || line.equals("выход")) {
                return -1;
            }
            try {
                double value = Double.parseDouble(line);
                if (value <= 0) {
                    System.out.println("Ошибка: радиус должен быть больше 0.");
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введено не число. Попробуйте снова.");
            }
        }
    }
}