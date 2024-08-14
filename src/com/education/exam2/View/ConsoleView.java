package com.education.exam2.View;

import java.util.List;
import java.util.Scanner;

public class ConsoleView implements View {

    //final String;

    public void displayMenu() {
        System.out.println("\n╔═════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║  Реестр домашних животных                                               ║");
        System.out.println("╚═════════════════════════════════════════════════════════════════════════╝");
        System.out.println("1. Добавить новое животное");
        System.out.println("2. Посмотреть реестр животных");
        System.out.println("3. Увидеть список команд, которое выполняет животное");
        System.out.println("4. Обучить животное новым командам");
        System.out.println("5. Завершение работы приложения");
        System.out.println("===========================================================================");
    }

    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String input() {
        System.out.print("> ");
        try {
            return System.console().readLine();
        } catch (Exception e) {
            return "";
        }
    }

    public int askUserForChoice() {
        System.out.println("Choose an option:");
        System.out.println("0. Завести новое животное");
        System.out.println("1. Просмотреть информацию по животному");
        System.out.println("2. Обучить животное новой команде");
        System.out.println("3. Назад");
        return Integer.parseInt(input());
    }

    public void displayList(List<String> stringList) {
        int counter = 0;
        for (String row: stringList) {
            //counter++;
            System.out.printf("\t%d - %s\n", counter++, row);
        }
    }
}
