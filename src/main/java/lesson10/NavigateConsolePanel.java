package lesson10;

import java.util.Scanner;

public class NavigateConsolePanel {

    OperationPhoneBook operationPhoneBook = new OperationPhoneBook();

    public void readConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Телефонная книга готовоа к работе");
        while (true) {
            System.out.println();
            System.out.println("Выберите оперцию или нажмите enter для завершения работы с телефонной книгой");
            System.out.println("1 - Добавить контакт");
            System.out.println("2 - Удалить контакт");
            System.out.println("3 - Показать все записи с сортировкой по выбрному полю");
            System.out.println("4 - Найти контакт");
            System.out.println("5 - Редактировать контакт");

            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            } else {
                chooseOperation(Integer.parseInt(input));
            }

        }
    }

    public void chooseOperation(int number) {

        switch (number) {
            case 1:
                System.out.println("Режим добавления контакта.");
                operationPhoneBook.addContact();
                break;
            case 2:
                System.out.println("Режим удаления контакта.");
                operationPhoneBook.deleteContact();
                break;
            case 3:
                System.out.println("Режим отображения всех контактов.");
                System.out.println("Сортировка по:");
                System.out.println("1 - ФИО:");
                System.out.println("2 - Адресс:");
                System.out.println("3 - Дата и время редактирования:");
                System.out.println("4 - Дата рождения:");

                operationPhoneBook.showAllPersonOrderBy();
                break;

            case 4:
                System.out.println("Режим поиска.");
                operationPhoneBook.searchPerson();


                break;
            case 5:
                System.out.println("Режим редактирования контакта");
                operationPhoneBook.editContact();
                break;

            default:
                System.out.println("Нет операции ");
        }

    }
}

