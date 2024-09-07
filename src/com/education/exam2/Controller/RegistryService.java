package com.education.exam2.Controller;

import com.education.exam2.Model.Animal;
import com.education.exam2.Model.Pet;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RegistryService {

    private final Map<String, Animal> registry = new HashMap<>();

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

    public List<String> getCommands(String name) {
        Pet pet = (Pet) registry.get(name);
        return pet != null ? pet.getCommandsList() : null;
    }

    public List<String> getListAnimal() {
        Set<String> list = registry.keySet();
        return (List<String>) list;
    }

    public boolean trainAnimal(String name, String command) {
        Pet pet = (Pet) registry.get(name);
        if (pet != null) {
            pet.learnCommand(command);
            System.out.printf("Для животного %s добавлена команда: %s\n", name, command);
            return true;
        } else {
            String strNotFoundAnimal = "Животное не найдено.";
            System.out.println(strNotFoundAnimal);
            return false;
        }
    }
}
