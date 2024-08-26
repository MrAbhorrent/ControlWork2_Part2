package com.education.exam2.Controller;


import com.education.exam2.Model.Animal;
import com.education.exam2.Model.Cat;
import com.education.exam2.Model.Dog;
import com.education.exam2.Model.Hamster;

public class AnimalFactory {

    public static Animal createAnimal(String type, String name) {
        switch (type.toLowerCase()) {
            case "dog":
                return new Dog(name);
            case "cat":
                return new Cat(name);
            case "hamster":
                return new Hamster(name);
            // Можно добавить другие типы животных
            default:
                throw new IllegalArgumentException("Unknown animal type");
        }
    }
}
