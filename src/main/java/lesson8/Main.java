package lesson8;


import lesson8.cargo.Box;
import lesson8.exception.QueueOverflowException;
import lesson8.loger.Logging;
import lesson8.transporter.Truck;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
 Logging logging = new Logging();


    public static void main(String[] args) {
            new Main().test();
    }

    public void test() {
        Truck truck = new Truck();

        for (int i = 1; i < 10; i++) {

            try {
                truck.putInATruck(new Box(i));
            } catch (QueueOverflowException e) {
                logging.LOGGER.log(Level.SEVERE,e.getMessage());
                truck.sendСargo();
                truck.cleanBoxTruck();
            }
        }

    }


}
