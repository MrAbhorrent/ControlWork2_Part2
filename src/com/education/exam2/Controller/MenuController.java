package com.education.exam2.Controller;

import com.education.exam2.View.View;

import java.util.List;

public class MenuController {
    private final RegistryService registryService;
    private final View view;

    public MenuController(RegistryService registryService, View view) {
        this.registryService = registryService;
        this.view = view;
    }

    public void showMenu() {
        while (true) {
            view.displayMenu();
            int choice = view.getUserChoice();

            switch (choice) {
                case 1:
                    String type = view.getAnimalType();
                    String name = view.getAnimalName();
                    registryService.addAnimal(type, name);
                    view.showAnimalAdded(name);
                    break;
                case 2:
                    List<String> list = registryService.getListAnimal();
                    view.showAnimals(list);
                    break;
                case 3:
                    name = view.getAnimalName();
                    List<String> commands = registryService.getCommands(name);
                    if (commands != null) {
                        view.showCommands(name, commands);
                    } else {
                        view.showAnimalNotFound();
                    }
                    break;
                case 4:
                    name = view.getAnimalName();
                    String command = view.getNewCommand();
                    if (registryService.trainAnimal(name, command)) {
                        view.showCommandAdded(name, command);
                    } else {
                        view.showAnimalNotFound();
                    }
                    break;
                case 5:
                    view.showExitMessage();
                    return;
                default:
                    view.showInvalidChoice();
            }
        }
    }
}
