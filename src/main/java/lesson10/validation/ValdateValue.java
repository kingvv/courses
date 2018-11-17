package lesson10.validation;

public class ValdateValue implements IValidateValue{

    @Override
    public boolean isValidValue(String pattern, String inputString) {
        return inputString.trim().matches(pattern);
    }
}
