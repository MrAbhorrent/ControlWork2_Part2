package com.education.exam2.Model;

import java.util.Date;

public class Dog extends Pet{

    public Dog(String nickName, Date date) {
        super(nickName, date);
    }

    public Dog(String nickName) {
        this(nickName, null);
    }

    @Override
    public void performAction() {
        String makeVoice = "Гав-гав";
        System.out.println(makeVoice);
    }

    @Override
    public String getType() {
        return "Dog";
    }
}
