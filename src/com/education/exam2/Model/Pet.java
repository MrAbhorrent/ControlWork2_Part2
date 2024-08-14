package com.education.exam2.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Pet extends Animal {

    protected ArrayList<String> commands = new ArrayList<>();

    public Pet(String nickName, Date date) {
        super(nickName, date);
    }

    public void learnCommand(String command) {
        commands.add(command);
    }

    public List<String> getCommandsList() {
        return commands;
    }
}
