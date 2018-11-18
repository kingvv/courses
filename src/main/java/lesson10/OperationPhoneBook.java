package lesson10;

import lesson10.dateUtil.DateUtil;
import lesson10.entities.Contact;
import lesson10.storage.PhoneBookStorage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;


public class OperationPhoneBook {

    InputConsoleField inputConsoleField = new InputConsoleField();
    DateUtil dateUtil = new DateUtil();
    PhoneBookStorage phoneBookStorage = new PhoneBookStorage();



    public void addContact() {

        Contact contact = new Contact();

        String fio = inputConsoleField.getConsoleFio();
        String phoneNumber = inputConsoleField.getConsolePhoneNumber();
        String birthDate = inputConsoleField.getConsoleBirthDate();
        String address = inputConsoleField.getConsoleAddress();

        contact.setFio(fio);
        contact.setPhoneNumber(splitPhone(phoneNumber));
        contact.setBirthDate(dateUtil.stringToDate(birthDate));
        contact.setAddress(address);
        contact.setModifyDate(dateUtil.getLocalDateTime());

        phoneBookStorage.addPersonPhoneBook(contact);

    }

    public void editContact() {

        Contact contact = new Contact();


        phoneBookStorage.showAllContact();

        if (!phoneBookStorage.isEmptyPhoneBook()) {

            int fieldForEditContact = inputConsoleField.getConsoleValueContactId();
            String fio = inputConsoleField.getConsoleFio();
            String phoneNumber = inputConsoleField.getConsolePhoneNumber();
            String birthDate = inputConsoleField.getConsoleBirthDate();
            String address = inputConsoleField.getConsoleAddress();

            contact.setFio(fio);
            contact.setPhoneNumber(asList(phoneNumber));
            contact.setBirthDate(dateUtil.stringToDate(birthDate));
            contact.setAddress(address);
            contact.setModifyDate(dateUtil.getLocalDateTime());
            contact.setId(fieldForEditContact);

            phoneBookStorage.editContactInMap(contact);

        }

    }


    public void deleteContact() {
        phoneBookStorage.showAllContact();

        if (!phoneBookStorage.isEmptyPhoneBook()) {
            int fieldForDelete = inputConsoleField.getConsoleValueContactId();
            phoneBookStorage.deletePersonFromMap(fieldForDelete);
        }
    }

    public void searchPerson() {
        String fieldSearch = inputConsoleField.getConsoleValue();
        phoneBookStorage.search(fieldSearch);

    }

    public void showAllPersonOrderBy() {
        int numberField = inputConsoleField.getConsoleValueOperation();
        phoneBookStorage.showAllPersonPhoneBookOrderBy(numberField);
    }


    private List<String> splitPhone(String phones) {

        return new ArrayList<>(asList(phones.split(";")));
    }

}
