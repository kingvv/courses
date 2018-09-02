package lesson2;


/*
     Написать программу игру “Bingo”. Используя IntelliJ IDEA, создайте класс Bingo.
     Программа должна загадать целое число в диапазоне от 0 до 100 и предложить пользователю его отгадать.
     При вводе числа пользователем, программа проверяет на соответствие с загаданным число и если числа совпали вывести сообщение о том что число отгадано.
     Если числа не совпали, тогда следует вывести надпись о том, что задуманное число является больше или меньше вводимого.
     Также программа ведет подсчет попыток, и выводит это количество после того как число угадали.
     Предусмотреть возможность досрочного завершения программы, в случае если пользователь не желает продолжать угадывать число.
*/


import java.util.Random;
import java.util.Scanner;

public class Bingo {

    private static int selectedRandomNumber;
    private static int enteredNumber;
    private static int count = 0;


    public static void main(String[] args) {

        setRandomNumber(101);
        System.out.println("Enter the number between 1 and 100 or click the enter for exit.");

        while (true) {
            getEnteredNumberFromConsole();

            if (selectedRandomNumber == enteredNumber) {
                System.out.println("Bingo! You won! " + "You guessed the number with " + count + " attempt(s).");
                break;
            } else if (selectedRandomNumber > enteredNumber) {
                System.out.println("Try again! My number is bigger.");
                continue;

            } else if (selectedRandomNumber < enteredNumber) {
                System.out.println("Try again! My number is smaller.");
                continue;
            }
        }

    }

    private static void setRandomNumber(int number) {

        System.out.println("I guessed the number.");
        selectedRandomNumber = new Random().nextInt(number);
    }

    private static void getEnteredNumberFromConsole() {

        String input = new Scanner(System.in).nextLine();
        if (input.isEmpty()) System.exit(0);
        enteredNumber = Integer.parseInt(input);
        count++;
    }


}
