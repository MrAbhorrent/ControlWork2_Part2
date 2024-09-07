package com.education.exam2.View;

import java.util.List;

public interface View {

    void displayMenu();
    int getUserChoice();
    String getAnimalType();
    String getAnimalName();
    String getNewCommand();
    void showCommands(String name, List<String> commands);
    void showAnimalAdded(String name);
    void showAnimalNotFound();
    void showInvalidChoice();
    void showExitMessage();

}
