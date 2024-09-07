package com.education.exam2.View;

import java.util.*;

public interface View {

    void displayMenu();
    int getUserChoice();
    String getAnimalType();
    String getAnimalName();
    String getNewCommand();
    void showCommandAdded(String name, String command);
    void showCommands(String name, List<String> commands);
    void showAnimals(List<String> listAnimals);
    void showAnimalAdded(String name);
    void showAnimalNotFound();
    void showInvalidChoice();
    void showExitMessage();
}
