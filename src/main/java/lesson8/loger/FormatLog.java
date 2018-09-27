package lesson8.loger;


import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class FormatLog extends Formatter {


    @Override
    public String format(LogRecord logRecord) {
        return String.format("%s: %s - %s \n", logRecord.getLevel(), logRecord.getLoggerName(), logRecord.getMessage());
    }
}
