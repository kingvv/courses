package lesson10;

import lesson10.dateUtil.DateUtil;

import static java.util.Arrays.asList;

public class OperationPhoneBook {

    InputConsoleField inputConsoleField = new InputConsoleField();
    DateUtil dateUtil = new DateUtil();
    PhoneBookStorage phoneBookStorage = new PhoneBookStorage();

    public  void addPerson() {
        Person person = new Person();

        String fio = inputConsoleField.getConsoleFio();
        String phoneNumber = inputConsoleField.getConsolePhoneNumber();
        String birthDate = inputConsoleField.getConsoleBirthDate();
        String address = inputConsoleField.getConsoleAddress();

        person.setFio(fio);
        person.setPhoneNumber(asList(phoneNumber));
        person.setBirthDate(dateUtil.stringToDate(birthDate));
        person.setAddress(address);
        person.setModifyDate(dateUtil.getLocalDateTime());

        phoneBookStorage.addPersonPhoneBook(person);

    }

    public void EditPerson() {

    }

    public void SearchPerson() {

    }

    public void showAllPersonOrderBy() {
       int numberField = inputConsoleField.getConsoleValueOperation();
        phoneBookStorage.showAllPersonPhoneBookOrderBy(numberField);
    }



}
