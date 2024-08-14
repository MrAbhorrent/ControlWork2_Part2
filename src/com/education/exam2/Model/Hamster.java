package com.education.exam2.Model;

import java.util.ArrayList;
import java.util.Date;

public class Hamster extends Pet {

    private final String makeVoice = "Фрф-ф";

    public Hamster(String nickName, Date date) {
        super(nickName, date);
    }

    @Override
    public void performAction() {
        System.out.println(makeVoice);
    }
}
