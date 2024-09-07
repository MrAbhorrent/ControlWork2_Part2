package com.education.exam2.View;

import java.util.List;
import java.util.Scanner;

public class ConsoleView implements View {

    private final Scanner scanner;

    public ConsoleView(Scanner scanner) {
        this.scanner = scanner;
    }

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

    public int getUserChoice() {
        System.out.print("Выберите пункт меню: ");
        return scanner.nextInt();
    }

    public String getAnimalType() {
        System.out.print("Введите тип животного (dog/cat/hamster): ");
        scanner.nextLine();  // ??
        return scanner.nextLine();
    }

    public String getAnimalName() {
        System.out.print("Введите имя животного: ");
        return scanner.nextLine();
    }

    public String getNewCommand() {
        System.out.print("Введите новую команду: ");
        return scanner.nextLine();
    }

    public void showCommands(String name, List<String> commands) {
        System.out.printf("Команды для %s: \n", name);
        displayList(commands);
    }

    public void showAnimalAdded(String name) {
        System.out.println("Животное добавлено: " + name);
    }

    public void showCommandAdded(String name, String command) {
        System.out.println("Команда добавлена для " + name + ": " + command);
    }

    public void showAnimalNotFound() {
        System.out.println("Животное не найдено.");
    }

    public void showInvalidChoice() {
        System.out.println("Неверный выбор. Попробуйте снова.");
    }

    public void showExitMessage() {
        System.out.println("Выход из программы.");
    }

    public void displayList(List<String> stringList) {
        int counter = 0;
        for (String row: stringList) {
            System.out.printf("\t%d - %s\n", counter++, row);
        }
    }
}
