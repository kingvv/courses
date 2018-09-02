package lesson4;


import lesson4.passenger.Dog;
import lesson4.passenger.Passenger;
import lesson4.route.Bus;
import lesson4.route.BusStation;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        BusStation busStation1 = new BusStation("Start station");
        BusStation busStation2 = new BusStation("station 2");
        BusStation busStation3 = new BusStation("station 3");
        BusStation busStation4 = new BusStation("station 4");
        BusStation busStation5 = new BusStation("End station");


        Passenger passenger1 = new Passenger("1");
        Dog dog = new Dog();
        passenger1.setDog(dog);

        Passenger passenger2 = new Passenger("2");
        Passenger passenger3 = new Passenger("3");
        Passenger passenger4 = new Passenger("4");
        Passenger passenger5 = new Passenger("5");


        Bus bus = new Bus();

        bus.setRoute(busStation1, busStation2, busStation3, busStation4, busStation5);

        ArrayList<BusStation> busStations = bus.getRoute();
        for (int i = 0; i < busStations.size() - 1; i++) {

            int start = i;
            int stopStation = i + 1;


            bus.start(busStations.get(start));
            bus.stop(busStations.get(stopStation));

            if (stopStation == 1) {
                bus.comeInPassenger(passenger1);
            }

            if (stopStation == 3) {

                bus.comeOutPassenger(passenger1);

                bus.comeInPassenger(passenger2);
                bus.comeInPassenger(passenger3);
                bus.comeInPassenger(passenger4);
                bus.comeInPassenger(passenger5);
            }

            if (stopStation == busStations.size() - 1) {

                bus.comeOutPassenger(passenger2);
                bus.comeOutPassenger(passenger3);
                bus.comeOutPassenger(passenger4);
                bus.comeOutPassenger(passenger5);
            }

        }


    }
}
