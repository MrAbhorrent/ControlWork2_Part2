package com.education.exam2.Model;

import java.util.ArrayList;
import java.util.Date;

public class Dog extends Pet{

    private final String makeVoice = "Гав-гав";

    public Dog(String nickName, Date date) {
        super(nickName, date);
    }

    @Override
    public void performAction() {
        System.out.println(makeVoice);
    }
}
