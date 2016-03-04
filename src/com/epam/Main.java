package com.epam;

/**
 * Created by m18 on 04.03.2016.
 */
public class Main {

    public static void main(String[] args) {
MyTest myTest = new MyTest();

        try {
            myTest.test();
            throw new MyException("This is Exception");
        }catch(Exception e) {

            System.out.println(e.getMessage());
        }finally {
            System.out.println("i was here!!!");
        }

    }
}
