package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Main {
    @Test
    @Disabled
    public static void main(String[] args) {

    Thread thread1 = new Thread(() -> {
        System.out.println(Thread.currentThread().getName());
        int expected = 0;
        int actual = Logger.getInstance().num_of_log_level(LogLevel.ERROR);
        Assertions.assertEquals(expected, actual);
        Logger.getInstance().log_massage(LogLevel.ERROR , "The test checks that an error is in the 0 position \n");
    });

        Thread thread2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            int expected = 3;
            int actual = Logger.getInstance().num_of_log_level(LogLevel.VERBOSE);
            Assertions.assertEquals(expected, actual);
            Logger.getInstance().log_massage(LogLevel.VERBOSE , "The test checks that there is an VERBOSE in the 3th place \n");
        });

        Thread thread3 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            int expected = 4;
            int actual = Logger.getInstance().num_of_log_level(LogLevel.DEBUG);
            Assertions.assertEquals(expected, actual);
            Logger.getInstance().log_massage(LogLevel.DEBUG , "The test checks that there is an Debug in the 4th place \n");
        });

        Thread thread4 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            int expected = 0;
            int actual = Logger.getInstance().num_of_log_level(LogLevel.ERROR);
            Assertions.assertEquals(expected, actual);
            Logger.getInstance().log_massage(LogLevel.ERROR , "The test checks that an Error is in the 0 position \n");
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();




    }



}