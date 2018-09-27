package lesson8.transporter;

import lesson8.cargo.Box;
import lesson8.exception.QueueOverflowException;

import java.util.ArrayList;
import java.util.List;

public class Truck {


    List<Box> trailer = new ArrayList<>();

    public void putInATruck(Box box) throws QueueOverflowException {


        if (trailer.size() < 3) {
            trailer.add(box);
            System.out.println("Погрузить ящик в грузовик");
        } else {
            throw new QueueOverflowException("В грузок больше не может быть загружено. Грузовик уже заполнен");
        }
    }

    public void cleanBoxTruck() {
        System.out.println("Выгрузить груз");
        trailer.removeIf(el->el!=null);
    }


    public void sendСargo() {
        System.out.println("Отправить груз");
    }
}
