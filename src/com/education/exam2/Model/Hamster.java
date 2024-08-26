package com.education.exam2.Model;

import java.util.Date;

public class Hamster extends Pet {

    public Hamster(String nickName, Date date) {
        super(nickName, date);
    }

    public Hamster(String nickName) {
        this(nickName, null);
    }

    @Override
    public void performAction() {
        String makeVoice = "Фрф-ф";
        System.out.println(makeVoice);
    }

    @Override
    public String getType() {
        return "Hamster";
    }
}
