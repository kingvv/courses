package lesson8;


import lesson8.cargo.Box;
import lesson8.exception.NotEmptyException;
import lesson8.exception.QueueOverflowException;
import lesson8.transporter.Truck;

import java.util.logging.Level;

import static lesson8.loger.Logging.LOGGER;


public class Main {

    public static void main(String[] args) {

        Truck truck = new Truck();

        for (int i = 1; i < 10; i++) {

            try {

                truck.putInATruck(new Box(i));
                truck.putInATruck(null);

            } catch (QueueOverflowException e) {

                LOGGER.log(Level.SEVERE, "Переполенение грузовика", e);

                truck.sendСargo();

                try {

                    truck.cleanBoxTruck();

                } catch (NotEmptyException el) {
                    LOGGER.severe("Был загружен пустоя ящик");
                }

            }
        }

    }

}

