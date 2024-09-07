package com.education.exam2.Controller;

public class CounterResource implements AutoCloseable {

    private int count;
    private boolean isClosed = false;

    public CounterResource() {
        count = 0;
    }

    public void increment() {
        if (isClosed) {
            String strStateException = "Счетчик не инициализирован";
            throw new IllegalStateException(strStateException);
        }
        count++;
    }

    public int getCount() {
        return count;
    }

    public void close() throws Exception {
        String message1 = "Счетчик закрыт";
        String message2 = "Счетчик не использовался или уже был закрыт";
        if (!isClosed) {
            isClosed = true;
            System.out.println(message1);
        } else {
            throw new IllegalStateException(message2);
        }
    }
}
