package lesson10.validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ValidateDateValue implements IValidateValue {
    @Override
    public boolean isValidValue(String pattern, String inputString) {

        return isDateValid(inputString) && inputString.matches(pattern);


    }


    public boolean isDateValid(String date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            LocalDate.parse(date, dateTimeFormatter);
        } catch (Exception e) {
//            System.out.println(e.getMessage());
            return false;
        }


        return true;
    }

}
