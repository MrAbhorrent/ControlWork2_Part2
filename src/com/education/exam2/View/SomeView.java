package com.education.exam2.View;

import java.util.List;
import java.util.Scanner;

public class SomeView {
    private final Scanner scanner;

    public SomeView() {
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("1. Завести новое животное");
        System.out.println("2. Показать список команд животного");
        System.out.println("3. Обучить животное новой команде");
        System.out.println("4. Выход");
    }

    public int getUserChoice() {
        System.out.print("Выберите пункт меню: ");
        return scanner.nextInt();
    }

    public String getAnimalType() {
        System.out.print("Введите тип животного (dog/cat): ");
        scanner.nextLine();  // consume newline
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
        System.out.println("Команды для " + name + ": " + commands);
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
}
