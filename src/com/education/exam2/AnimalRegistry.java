package com.education.exam2;

//package com.example.animalregistry;

import java.util.ArrayList;
import java.util.List;

public class AnimalRegistry {

    // Классы животных
    public static class Dog extends Animal {
        public void bark() {
            System.out.println("Woof!");
        }

        @Override
        public void performAction() {
            
        }
    }

    public static class Cat extends Animal {
        public void meow() {
            System.out.println("Meow!");
        }
    }

    // Модель (Animal)
    public static abstract class Animal {
        private String name;
        private List<String> commands = new ArrayList<>();

        public Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void learnCommand(String command) {
            commands.add(command);
        }

        public List<String> getCommands() {
            return commands;
        }

        public abstract void performAction();
    }

    // Контроллер (RegistryController)
    public static class RegistryController {
        private final Animal animal;

        public RegistryController(Animal animal) {
            this.animal = animal;
        }

        public void showMenu() {
            int choice = askUserForChoice();
            switch (choice) {
                case 0:
                    createNewAnimal();
                    break;
                case 1:
                    printAnimalInfo();
                    break;
                case 2:
                    teachAnimalNewCommand();
                    break;
                case 3:
                    navigateToParentMenu();
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

        private void createNewAnimal() {
            System.out.println("Enter the type of animal:");
            String animalType = input().toLowerCase();
            if ("dog".equals(animalType)) {
                animal = new Dog("New Dog");
            } else if ("cat".equals(animalType)) {
                animal = new Cat("New Cat");
            } else {
                System.out.println("Unknown animal type.");
                return;
            }
        }

        private void printAnimalInfo() {
            System.out.println("Animal Name: " + animal.getName());
            for (String command : animal.getCommands()) {
                System.out.println("- " + command);
            }
        }

        private void teachAnimalNewCommand() {
            System.out.println("Enter a command to teach the animal:");
            String command = input();
            animal.learnCommand(command);
        }

        private void navigateToParentMenu() {
            System.out.println("Navigating back to parent menu...");
        }

        private String input() {
            System.out.print("> ");
            try {
                return System.console().readLine();
            } catch (Exception e) {
                return "";
            }
        }

        private int askUserForChoice() {
            System.out.println("Choose an option:");
            System.out.println("0. Create New Animal");
            System.out.println("1. View Animal Info");
            System.out.println("2. Teach Animal New Command");
            System.out.println("3. Navigate Back");
            return Integer.parseInt(input());
        }
    }

    // Представление (RegistryView)
    public static class RegistryView {
        public void displayMenu() {
            System.out.println("Welcome to the Animal Registry!");
            System.out.println("0. Create New Animal");
            System.out.println("1. View Animal Info");
            System.out.println("2. Teach Animal New Command");
            System.out.println("3. Navigate Back");
        }
    }

    public static void main(String[] args) {
        RegistryView view = new RegistryView();
        RegistryController controller = new RegistryController(null);

        view.displayMenu();
        while (true) {
            controller.showMenu();
        }