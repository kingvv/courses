package lesson10;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PhoneBookStorage {

    public static HashMap<Integer, Person> phoneBook = new HashMap();

    public void addPersonPhoneBook(Person person) {


            int countRows = phoneBook.size() + 1;
            phoneBook.put(countRows, person);
            System.out.println("Контакт добавлен: ");
            System.out.println(countRows + "." + person);
        }



    public void deletePersonFromMap(Person person) {
        phoneBook.remove(person);
    }


    public boolean checkPhoneInPhoneBook(String phoneNumber) {
       return   phoneBook.entrySet()
                .stream()
                .filter(el->el.getValue().getPhoneNumber().contains(phoneNumber))
                .findFirst()
                .isPresent();
    }

    public void showAllPersonPhoneBookOrderBy(int numberField) {
        Comparator<Map.Entry<Integer, Person>> sort;

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

        phoneBook.entrySet().stream()
                .sorted(sort)
                .forEach(el -> System.out.println(el.getKey() + ":" + el.getValue()));


    }


}
