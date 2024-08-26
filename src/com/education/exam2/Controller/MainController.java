package com.education.exam2.Controller;

import com.education.exam2.Model.Pet;
import com.education.exam2.View.ConsoleView;

import java.util.List;

public class MainController implements Controller, AutoCloseable {

    private CounterResource counterResource;
    private final List<Pet> pets;
    private final ConsoleView view;


    public MainController(CounterResource counterResource, List<Pet> pets, ConsoleView view) {
        this.counterResource = counterResource;
        this.pets = pets;
        this.view = view;
    }

    @Override
    public void showMenu() {
        int choice = view.askUserForChoice();
        switch (choice) {
            case 0:
                createNewAnimal();
                break;
            case 1:
                viewAnimalInfo();
                break;
            case 2:
                teachAnimalNewCommand();
                break;
            case 3:
                navigateToParentMenu();
                break;
            default:
                System.out.println("Неправильный выбор.");
                break;
        }
    }

    @Override
    public void createNewAnimal() {
        System.out.println("Выберите тип животного:");
        System.out.println("1. Собака");
        System.out.println("2. Кошка");
        System.out.println("3. Хомяк");
        int choice = Integer.parseInt(view.input());
        switch (choice) {
            case 1:

        }
    }

    @Override
    public void viewAnimalInfo(int index) {

    }

    @Override
    public void teachAnimalNewCommand() {

    }

    @Override
    public void viewAnimalInfo() {

    }

    @Override
    public void teachAnimalNewCommand(int index) {

    }

    @Override
    public void navigateBack() {

    }

    @Override
    public void close() throws Exception {

    }
}
