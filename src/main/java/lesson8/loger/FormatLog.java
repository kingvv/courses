package lesson8.loger;


import java.sql.Timestamp;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class FormatLog extends Formatter {


    @Override
    public String format(LogRecord logRecord) {
        return String.format("%s %s: %s - %s \n", new Timestamp(logRecord.getMillis()), logRecord.getLevel(), logRecord.getSourceClassName(), logRecord.getMessage());
    }
}
