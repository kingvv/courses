package lesson8.transporter;

import lesson8.cargo.Box;
import lesson8.exception.NotEmptyException;
import lesson8.exception.QueueOverflowException;

import java.util.ArrayList;
import java.util.List;

import static lesson8.loger.Logging.LOGGER;

public class Truck {


    List<Box> trailer = new ArrayList<>();

    public void putInATruck(Box box) throws QueueOverflowException {


        if (trailer.size() < 3) {
            trailer.add(box);
            LOGGER.info("Погрузить ящик в грузовик");
        } else {
            throw new QueueOverflowException("В грузок больше не может быть загружено. Грузовик уже заполнен");
        }
    }

    public void cleanBoxTruck() {


        trailer.removeIf(el->el!=null);

        if (trailer.size() > 0) {
            trailer.clear();
            throw new NotEmptyException("Пустоя ящик");
        }


        LOGGER.info("Выгрузить груз");

    }


    public void sendСargo() {
        LOGGER.info( "Отправить груз");
    }
}
