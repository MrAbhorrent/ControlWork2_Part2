package com.education.exam2.Controller;

public class CounterResource implements AutoCloseable {

    private int count;

    public CounterResource() {
        count = 0;
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public void close() throws Exception {
        String message = "Счетчик не использовался или уже был закрыт";
        if (count == 0) {
            throw new Exception(message);
        }
    }
}
