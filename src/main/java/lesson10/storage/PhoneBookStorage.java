package lesson10.storage;


import lesson10.entities.Contact;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PhoneBookStorage {

    public static HashMap<Integer, Contact> phoneBook = new HashMap();
    boolean isFoundSearch;

    public void addPersonPhoneBook(Contact contact) {

        boolean flagAddNewClient = true;

        for (String phone : contact.getPhoneNumber()) {
            Contact contactDuplicate = findPhoneInPhoneBookByPhone(phone);


            if (contactDuplicate != null) {
                System.out.println("Клиент с таким номером уже сущусвует в телефонной книге:");
                System.out.println(contactDuplicate);
                flagAddNewClient = false;
                break;
            }
        }

        if (flagAddNewClient) {

            int countRows = phoneBook.size() + 1;
            phoneBook.put(countRows, contact);
            System.out.println("Контакт добавлен: ");
            System.out.println(countRows + "." + contact);


        }
    }


    public void editContactInMap(Contact contact) {
        phoneBook.put(contact.getId(),contact);
    }


    public void deletePersonFromMap(int numberContact) {

        phoneBook.entrySet().removeIf(el -> {
            if (el.getKey() == numberContact) {
                System.out.println("Телефонный контанкт успешно удален");
                return true;
            }
            return false;
        });

    }


    public Contact findPhoneInPhoneBookByPhone(String phoneNumber) {

        try {
            return phoneBook.entrySet()
                    .stream()
                    .filter(el -> el.getValue().getPhoneNumber().contains(phoneNumber))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Клиент существует с таким именем "))
                    .getValue();


        } catch (RuntimeException e) {

        }

        return null;
    }


    public void search(String valueSearch) {

        isEmptyPhoneBook();

        isFoundSearch = false;
        phoneBook.entrySet()
                .stream()
                .forEach(el -> {

                    if (el.getValue().getPhoneNumber().contains(valueSearch) || el.getValue().getFio().contains(valueSearch)) {
                        System.out.println(el.getKey() + "." + el.getValue());
                        isFoundSearch = true;
                    }
                });

        if (!isFoundSearch) {
            System.out.println("!!!!Телефонная книга не содержит данных по заданному критерию!!!!");
        }


    }


    public void showAllPersonPhoneBookOrderBy(int numberField) {
        Comparator<Map.Entry<Integer, Contact>> sort;

        switch (numberField) {
            case 1:
                sort = Comparator.comparing(el -> el.getValue().getFio());
                break;
            case 2:
                sort = Comparator.comparing(el -> el.getValue().getAddress());
                break;
            case 3:
                sort = Comparator.comparing(el -> el.getValue().getModifyDate());
                break;
            case 4:
                sort = Comparator.comparing(el -> el.getValue().getBirthDate());
                break;

            default:
                sort = Comparator.comparing(el -> el.getValue().getModifyDate());
        }

        isEmptyPhoneBook();

        phoneBook.entrySet().stream()
                .sorted(sort)
                .forEach(el -> System.out.println(el.getKey() + ":" + el.getValue()));


    }


    public boolean isEmptyPhoneBook() {
        boolean isEmptyPhoneBook = phoneBook.size() == 0;
        if (isEmptyPhoneBook) System.out.println("---Телефонная книга пуста----");
        return isEmptyPhoneBook;
    }


    public void showAllContact() {
        isEmptyPhoneBook();
        phoneBook.entrySet().stream()
                .forEach(el -> System.out.println(el.getKey() + ":" + el.getValue()));
    }


}
