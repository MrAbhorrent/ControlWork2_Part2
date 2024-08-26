package com.education.exam2.Controller;

import com.education.exam2.Model.Animal;
import com.education.exam2.Model.Pet;

import java.util.HashMap;
import java.util.Map;

public class RegistryService {

    private final String strNotFoundAnimal = "Животное не найдено.";
    private Map<String, Animal> registry = new HashMap<>();

    public void addAnimal(String type, String name) {
        try (CounterResource counter = new CounterResource()) {
            Animal animal = AnimalFactory.createAnimal(type, name);
            registry.put(name, animal);
            counter.increment();
            System.out.println("Животное добавлено: " + name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showCommands(String name) {
        Pet pet = (Pet) registry.get(name);
        if (pet != null) {
            System.out.println("Список команд для " + name + ": " + pet.getCommandsList());
        } else {
            System.out.println(strNotFoundAnimal);
        }
    }

    public void trainAnimal(String name, String command) {
        Pet pet = (Pet) registry.get(name);
        if (pet != null) {
            pet.learnCommand(command);
            System.out.printf("Для животного %s добавлена команда: %s\n", name, command);
        } else {
            System.out.println(strNotFoundAnimal);
        }
    }
}
