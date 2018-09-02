package lesson3;


/*
Используя IntelliJ IDEA, создайте класс Anagram.
        Напишите программу, которая определяет, является ли одна строка анаграммой другой строки.
        Анаграмма - это слово или фраза, сделанная путем переноса букв другого слова или фразы. Программа должна игнорировать пробелы и знаки препинания.
        Пример анаграмм:
        Аз есмь строка, живу я, мерой остр.
        За семь морей ростка я вижу рост.
        Я в мире — сирота.
        Я в Риме — Ариост.

*/


import java.util.Arrays;

public class Anagram {


    public static void main(String[] args) {

        String string1 = "Аз есмь строка, живу я, мерой остр.";
        String string2 = "За семь морей ростка я вижу рост.";

        Anagram anagram = new Anagram();

        System.out.println(String.format("String 1: %s \nString 2: %s",string1, string2));
        System.out.println(String.format("Is anagram: %s", anagram.isAnagram(string1, string2)));
    }

    private String removeSpecialCharacters(String string) {

        char[] charList = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : charList) {
            if (Character.isLetter(c)) {
                char charLower = Character.toLowerCase(c);
                stringBuilder.append(charLower);
            }
        }
        return stringBuilder.toString();
    }


    private char[] sortArrayCharacterFromString(String s) {

        char[] charList = s.toCharArray();
        Arrays.sort(charList);

        return charList;

    }


    public boolean isAnagram(String s1, String s2) {

        char[] chars1 = sortArrayCharacterFromString(removeSpecialCharacters(s1));
        char[] chars2 = sortArrayCharacterFromString(removeSpecialCharacters(s2));

        return Arrays.equals(chars1, chars2);
    }


}
