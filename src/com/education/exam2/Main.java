package com.education.exam2;

import com.education.exam2.Controller.MenuController;
import com.education.exam2.Controller.RegistryService;
import com.education.exam2.View.ConsoleView;
import com.education.exam2.View.View;

public class Main {
    public static void main(String[] args) {

        RegistryService registryService = new RegistryService();
        View view = new ConsoleView();
        MenuController menuController = new MenuController(registryService, view);
        menuController.showMenu();
    }
}
