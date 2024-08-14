package com.education.exam2.View;

import java.util.Scanner;

public class ViewEd {

    static Scanner iScanner = new Scanner(System.in);

    public int menu() {
        int result = 0;
        boolean flagWorking = true;
        while (flagWorking) {
            printMainMenu();
            result = inputIntegerNumber("Введите номер меню: ");
        }
        return result;
    }

    public void printMainMenu() {
        System.out.println("\n\n===============================================================================");
        System.out.println("1. Завести новое животное");
        System.out.println("2. Определять животное в правильный класс");
        System.out.println("3. Увидеть список команд, которое выполняет животное");
        System.out.println("4. Обучить животное новым командам");
        System.out.println("5. Посмотреть реестр животных");
        System.out.println("6. Завершение работы приложения");
        System.out.println("===============================================================================");
    }

    public static int inputIntegerNumber(String msg) {
        int num = 0;
        while (num < 1) {
            System.out.print(msg);
            while (!iScanner.hasNextInt()) {
                System.out.printf("\n%s не подходит.\n", iScanner.nextLine());
                System.out.printf(msg);
            }
            num = iScanner.nextInt();
            if (num < 1) {
                System.out.printf("\n%d не подходит.\n", num);
            }
        }
        iScanner.nextLine();
        return num;
    }

    public static String inputString(String msg) {
        System.out.printf(msg);
        return iScanner.nextLine();
    }
}
