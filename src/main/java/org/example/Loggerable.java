package org.example;

public interface Loggerable {
    public  String log_massage(LogLevel log_level, String message);//שדרגתי לStrint במקום VOID כמו שהיה בתרגיל
    public int get_level_messages_count(LogLevel log_level);
}
