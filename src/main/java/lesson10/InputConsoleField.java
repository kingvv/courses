package lesson10;

import lesson10.validation.IValidateValue;
import lesson10.validation.ValdateValue;
import lesson10.validation.ValidateDateValue;

import java.util.Scanner;


public class InputConsoleField {

    public static String readAndValidValue(String pattern, String massageForWriteConsole, IValidateValue iValidateValue) {
        Scanner scanner = new Scanner(System.in);
        String inputFromConsole;
        System.out.print(massageForWriteConsole);

        while (true) {
            inputFromConsole = scanner.nextLine();
            if (!iValidateValue.isValidValue(pattern, inputFromConsole)) {
                System.out.println("Недопустимые символы, повторите ввод:");
                System.out.print(massageForWriteConsole);

                continue;
            } else {
                System.out.println();
                break;
            }

        }
        return inputFromConsole;
    }


    public String getConsoleFio() {
        return readAndValidValue("[a-zA-Zа-яёА-ЯЁ\\s]{2,}", "Введите ФИО: ", new ValdateValue());
    }


    public String getConsolePhoneNumber() {
        return readAndValidValue("[0-9\\s;]{5,}", "Введите номер телефона: ", new ValdateValue());
    }


    public String getConsoleBirthDate() {
        return readAndValidValue("[0-9]{2}+[-]{1}+[0-9]{2}+[-]{1}+[0-9]{4}", "Введите дату рождения в формате dd-mm-yyyy: ", new ValidateDateValue());
    }


    public String getConsoleAddress() {
        return readAndValidValue(".+{5,}", "Введите адресс: ", new ValdateValue());
    }

    public int getConsoleValueOperation() {
        return Integer.parseInt(readAndValidValue("[0-9]+", "", new ValdateValue()));
    }

    public int getConsoleValueContactId() {
        return Integer.parseInt(readAndValidValue("[0-9]+", "Введите id контакта: ", new ValdateValue()));
    }


    public String getConsoleValue() {
        return readAndValidValue("[0-9a-zA-Zа-яёА-ЯЁ\\s]{5,}", "Введите фио или номер телефона для поиска: ", new ValdateValue());
    }


}
