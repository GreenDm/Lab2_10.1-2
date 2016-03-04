package com.epam;

/**
 * Created by m18 on 04.03.2016.
 */
public class MyException extends Exception {

    private String message;

    public MyException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}


