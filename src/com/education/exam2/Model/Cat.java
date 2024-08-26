package com.education.exam2.Model;

import java.util.Date;

public class Cat extends Pet{

    public Cat(String nickName, Date date) {
        super(nickName, date);
    }

    public Cat(String nickName) {
        this(nickName, null);
    }

    @Override
    public void performAction() {
        String makeVoice = "Мяу";
        System.out.println(makeVoice);
    }

    @Override
    public String getType() {
        return "Cat";
    }


}
