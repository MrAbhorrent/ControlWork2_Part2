package com.education.exam2.Model;

import java.util.Date;

public class Cat extends Pet{
    private final String makeVoice = "Мяу";

    public Cat(String nickName, Date date) {
        super(nickName, date);
    }

    @Override
    public void performAction() {
        System.out.println(makeVoice);
    }


}
