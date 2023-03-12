package org.example;

import com.sun.tools.javac.Main;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Logger implements Loggerable {
    private static Logger INSTANCE;
     LocalDateTime time_now = LocalDateTime.now();

    int[] counter = {0,0,0,0,0};
    public Logger () {

    }

    public static Logger getInstance() {
        if (INSTANCE == null) {
            synchronized (Logger.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Logger();
                }
            }
        }
        return INSTANCE;
    }

      @Override
    public String log_massage(LogLevel log_level, String message) {
        int x = log_level.ordinal();
        counter[x]++;
        String y  = String.format ("the log level is %s \n" +
                "the massage is %s \n" +
                "the time now is: %s \n" +
                "the log leve is %d \n"  ,log_level, message, time_now, log_level.ordinal());
        System.out.println(y);
        return y;
    }

    public int num_of_log_level(LogLevel log_level) {
        return log_level.ordinal();
    }
    @Override
    public int get_level_messages_count(LogLevel log_level) {
        int x = log_level.ordinal();
        System.out.format("from %s try %d times \n \n",  log_level, counter[x]);
        return counter[x];
    }



}



