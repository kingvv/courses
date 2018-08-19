package lesson1;


/*
Использую IntelliJ IDEA, создайте класс Interval.
Напишите программу определения, попадает ли указанное пользователем число от 0 до 100 в числовой промежуток [0 -14] [15 - 35] [36 - 50] [50 - 100].
Если да, то укажите в какой именно промежуток. Если пользователь указывает число, не входящее ни в один из имеющихся числовых промежутков, то выводится соответствующее сообщение.
*/

public class Interval {

    public static void main(String[] args) {
        Interval interval = new Interval();
        interval.getInterval(50);
    }

    public void getInterval(Integer number) {

        if (number == 50) System.out.println("[36 - 50] and [50 - 100]");
        else if (number >= 0 && number <= 14) System.out.println("[0 -14]");
        else if (number >= 15 && number <= 35) System.out.println("[15 - 35]");
        else if (number >= 36 && number <= 50) System.out.println("[36 - 50]");
        else if (number >= 50 && number <= 100) System.out.println("[50 - 100]");
        else System.out.println("wrong interval");

    }
}
