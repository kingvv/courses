package lesson8.loger;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class FilterLog  implements Filter{

    @Override
    public boolean isLoggable(LogRecord logRecord) {

        if (logRecord.getLevel().equals(Level.WARNING)) {
            return false;
        }
        return true;
    }
}
