
import org.example.LogLevel;
import org.example.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
public class TryTest {
    @Test
   // @Disabled
    void correct_count_error (){
        Logger.getInstance().log_massage(LogLevel.ERROR , "TRY ERROR one times");
        Logger.getInstance().log_massage(LogLevel.ERROR , "TRY ERROR two time");
        int expected = 2;
        int actual = Logger.getInstance().get_level_messages_count(LogLevel.ERROR);
        Assertions.assertEquals(expected, actual);
    }
    @Test

    void correct_count_info (){
        Logger.getInstance().log_massage(LogLevel.INFO , "TRY INFO one times");
        Logger.getInstance().log_massage(LogLevel.INFO , "TRY INFO two time");
        Logger.getInstance().log_massage(LogLevel.INFO , "TRY INFO three time");
        int expected = 3;
        int actual = Logger.getInstance().get_level_messages_count(LogLevel.INFO);
        Assertions.assertEquals(expected, actual);
    }
    @Test

    void correct_count_debug (){
        int expected = 0;
        int actual = Logger.getInstance().get_level_messages_count(LogLevel.DEBUG);
        Assertions.assertEquals(expected, actual);
    }
    @Test

     void try_get_instance(){
        Logger expected  = Logger.getInstance();
        Logger actual = Logger.getInstance();
        Assertions.assertEquals(expected, actual);
    }



}
