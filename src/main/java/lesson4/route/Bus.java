package lesson4.route;

import lesson4.passenger.Passenger;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class use for work with object Bus
 */

public class Bus {

    private ArrayList<Passenger> passengerList = new ArrayList();
    private boolean busInMotion = false;
    private ArrayList<BusStation> route = new ArrayList<>();

    /**
     * Use this method when bus need to motion
     *
     * @param busStation user object BusStation
     */
    public void start(BusStation busStation) {

        busInMotion = true;
        System.out.println(String.format("The bus is riding - from %s", busStation.getNameStation()));
    }


    /**
     * Use this method when bus need to stop
     *
     * @param busStation user object BusStation
     */

    public void stop(BusStation busStation) {

        busInMotion = false;
        System.out.println(String.format("The bus is stopped by %s", busStation.getNameStation()));
    }


    /**
     * Use this method when the passenger must exit. Use this method after method Bus.stop
     *
     * @param passenger user object Passenger
     */

    public void comeInPassenger(Passenger passenger) {

        isBusInMotion();

        passengerList.add(passenger);
        System.out.println(String.format("Passenger come in - %s ", passenger));
    }


    /**
     * Use this method when the passenger must exit. Use this method after method Bus.stop
     *
     * @param passenger user object Passenger
     */
    public void comeOutPassenger(Passenger passenger) {

        isBusInMotion();
        System.out.println(String.format("Passenger come out - %s ", passenger));
        passengerList.remove(passenger);
    }


    private void isBusInMotion() {

        if (busInMotion) {
            throw new RuntimeException("The bus must stop!");

        }
    }


    public ArrayList<BusStation> getRoute() {
        return route;
    }

    /**
     * Use this method to build a bus route
     *
     * @param busStation array BusStation or single value
     */

    public void setRoute(BusStation... busStation) {

        for (BusStation station : busStation) {
            route.add(station);
        }
    }


    /**
     * Use this method when the all passenger must exit. Use this method after method Bus.stop
     */
    public void comeOutAllPassengers() {
        isBusInMotion();
//
//        Iterator iterator = passengerList.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(String.format("Passenger come out - %s ", iterator.next()));
//            iterator.remove();
//        }

        passengerList.removeIf(el->{
            System.out.println(String.format("Passenger come out - %s ", el.toString()));
            return true;
        }
        );

    }
}
