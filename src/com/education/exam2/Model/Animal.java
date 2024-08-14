package com.education.exam2.Model;

import java.util.Date;

abstract class Animal {
    protected String nickName;
    private Date birthday;


    public Animal(String nickName) {
        this(nickName, null);
    }

    public Animal(String nickName, Date date) {
        this.nickName = nickName;
        this.birthday = date;
    }

    public String getNickName() {
        return nickName;
    }

    public int getAge() {
        if ( this.birthday != null) {
            Date curDate = new Date();
            long diffMsec = curDate.getTime() - this.birthday.getTime();
            return (int) (diffMsec / (365.25 *24 * 60 * 60 * 1000));
        }
        return  -1;
    }

    public abstract void performAction();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [name= " + nickName + ", birthday= " + birthday + "]";
    }
}