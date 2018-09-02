package lesson3;

        /*
        Используя IntelliJ IDEA, создайте класс CapitalLetter.
        Напишите программу, которая принимает строку и переводит первую букву слова в верхний регистр.
        Пример работы:
        Истина — это то, что выдерживает проверку опытом. Эйнштейн А.
        Истина — Это То, Что Выдерживает Проверку Опытом. Эйнштейн А.
        */


import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class CapitalLetter {


    public static void main(String[] args) {

        CapitalLetter capitalLetter = new CapitalLetter();

        String var1 = capitalLetter.getToUpperFirstLetter("Истина    — это то,  что выдерживает проверку опытом. Эйнштейн А.");
        String var2 = capitalLetter.getToUpperFirstLetter2("Истина    — это то,  что выдерживает проверку опытом. Эйнштейн А.");

        System.out.println(var1);
        System.out.println(var2);

    }


    public String getToUpperFirstLetter(String string) {

        StringTokenizer stringToken = new StringTokenizer(string);
        StringBuilder stringBuilder = new StringBuilder();

        while (stringToken.hasMoreTokens()) {
            String str = stringToken.nextToken();
            String firsLetter = str.substring(0, 1);

            stringBuilder
                    .append(str.replaceFirst(firsLetter, firsLetter.toUpperCase()))
                    .append(" ");
        }

        return stringBuilder.toString().trim();
    }


    public String getToUpperFirstLetter2(String string) {
        return Arrays.stream(string.split("[\\s]+"))
                .map(el -> el.replaceFirst(el.substring(0, 1), el.substring(0, 1).toUpperCase()))
                .map(el -> el.concat(" "))
                .collect(Collectors.joining()).trim();
    }

}
