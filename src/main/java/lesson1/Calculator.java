package lesson1;

import java.util.Scanner;

/*
Напишите программу консольный калькулятор. Используя IntelliJ IDEA, создайте класс Calculator.
        Создайте две переменные с именами operand1 и operand2. Задайте переменным некоторые произвольные значения или предложите их ввести пользователю.
        Также предложите пользователю ввести знак арифметической операции и поместите его в строковую переменную sign.
        Для организации выбора алгоритма вычислительного процесса, используйте переключатель switch.
        Выведите на экран результат выполнения арифметической операции.
        В случае использования операции деления, организуйте проверку попытки деления на ноль.
        И если таковая имеется, то отмените выполнение арифметической операции и уведимите об ошибка пользователя.
*/

public class Calculator {

    private Double operand1, operand2;
    private String sign;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.getDateAndCalculate();
    }

    public void getDateAndCalculate() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("input operation1 and press enter: ");
        operand1 = Double.parseDouble(scanner.next());

        System.out.println("input operation2 and press enter: ");
        operand2 = Double.parseDouble(scanner.next());

        System.out.println("input sign end press enter(+/*-): ");
        sign = scanner.next().trim();

        System.out.println(calculate());


    }

    private Double calculate() {

        switch (sign) {
            case "+":
                return add(operand1, operand2);
            case "-":
                return subtract(operand1, operand2);
            case "*":
                return multiply(operand1, operand2);
            case "/":
                return divide(operand1, operand2);

            default:
                throw new RuntimeException("you selected unacceptable operation");
        }

    }

    private Double add(Double operand1, Double operand2) {
        return operand1 + operand2;
    }

    private Double multiply(Double operand1, Double operand2) {
        return operand1 * operand2;
    }

    private Double divide(Double operand1, Double operand2) {
        if (operand2 == 0) {
            System.out.println("don't divide by zero");
            System.exit(2);
        }
        return operand1 / operand2;
    }

    private Double subtract(Double operand1, Double operand2) {
        return operand1 - operand2;
    }


}
