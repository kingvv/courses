package lesson2;


/*
        Написать программу сортировку массива методом пузырька. Используя IntelliJ IDEA, создайте класс BubbleSort.
        Программа должна позволить пользователю ввести массив целых чисел размерностью 10 элементов.
        Далее произвести сортировку этого массива от меньшего к большему по алгоритму сортировки пузырьком и вывести на экран отсортированный массив.
        Описание алгоритма:
        https://en.wikipedia.org/wiki/Bubble_sort
*/


import java.util.Arrays;
import java.util.Scanner;


public class BubbleSort {

    private int[] arrayNumber = new int[10];

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.getEnteredNumber();
        System.out.println(Arrays.toString(bubbleSort.sortAscending()));

    }


    public int[] sortAscending() {
        int temp;

        boolean flag = true;
        int lengthArray = arrayNumber.length;

        while (flag) {
            flag = false;
            for (int i = 0; i < lengthArray - 1; i++) {
                if (arrayNumber[i] > arrayNumber[i + 1]) {
                    temp = arrayNumber[i];
                    arrayNumber[i] = arrayNumber[i + 1];
                    arrayNumber[i + 1] = temp;
                    flag = true;
                }
            }
            lengthArray -= 1;
        }
        return arrayNumber;
    }


    private void getEnteredNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 number.");

        for (int i = 1; i <= arrayNumber.length; i++) {
            System.out.println("Enter " + i + " number:");
            arrayNumber[i - 1] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arrayNumber));

    }


}
