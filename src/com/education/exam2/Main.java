package com.education.exam2;

import com.education.exam2.Model.Animal;
import com.education.exam2.View.ViewEd;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
	// write your code here
        ViewEd v = new ViewEd();
        int chooseUser = v.menu();
        int[] arr = { 5, 2, 1, 8, 10 };
        Arrays.sort(arr);

    }

    public static void operationMenu(int selectedMenu) {

        Animal animal;
        switch (selectedMenu) {
            case 1:
                //animal = newAnimal();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
        }
    }

//    private static Animal newAnimal() {
//
//        String nickName = View.inputString("Введите кличку животного:");
//        int yearBirthday = View.inputIntegerlNumber("Введите год рождения животного:");
//        int monthBirthday = View.inputIntegerlNumber("Введите месяц рождения животного:");
//        int dayBirthday = View.inputIntegerlNumber("Введите день рождения животного:");
//        Calendar tmpCalendar = Calendar.getInstance();
//        tmpCalendar.set(yearBirthday, monthBirthday - 1, dayBirthday);
//        Date dateBirthday = tmpCalendar.getTime();
//
//        ArrayList<String> commandsAnimal = new ArrayList<>();
//        String answer = View.inputString("Команды животного будете вводить (y/n)? ");
//        while (answer.equals("y")) {
//            commandsAnimal.add(View.inputString("Введите команду животного:"));
//            answer = View.inputString("Еще команды животного будете вводить (y/n)? ");
//        }
//
//        return new Animal(nickName, dateBirthday);
//    }
}
