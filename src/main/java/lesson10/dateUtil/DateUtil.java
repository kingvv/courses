package lesson10.dateUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    public LocalDateTime getLocalDateTime() {

        return LocalDateTime.now();


    }


    public LocalDate stringToDate(String date) {

        return LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }


}
