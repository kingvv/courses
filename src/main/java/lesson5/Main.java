package lesson5;

import lesson5.auto.Auto;
import lesson5.auto.Car;
import lesson5.auto.Truck;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Car car = new Car(150, "benzine", "Mazda", "АН3333");
        Car car2 = new Car(150, "benzine", "Mazda", "АН3333");
        Car car3 = new Car(230, "benzine", "Toyota", "АН3333");

        Truck truck = new Truck(60, "GAZ-52", true);
        Truck truck2 = new Truck(60, "GAZ-52", true);

        Class c = Class.forName(Car.class.getName());
        Auto auto = (Auto) c.getConstructors()[0].newInstance(400, "benzine", "Lanos", "АН3333");


        ArrayList<Auto> listAuto = new ArrayList<>();

        listAuto.add(car);
        listAuto.add(car2);
        listAuto.add(car3);

        listAuto.add(truck);
        listAuto.add(truck2);

        listAuto.add(auto);

        System.out.println(String.format("%s equals %s: %s",car.getModel(), car2.getModel(), car.equals(car2)));
        System.out.println(String.format("%s equals %s: %s",car.getModel(), car3.getModel(), car.equals(car3)));
        System.out.println(String.format("%s equals %s: %s",car.getModel(), car2.getModel(), car2.equals(car)));



        for (Auto a : listAuto) {
            System.out.println("________________________");
            a.ride();
            a.switchSpeed();
            a.stop();

            if (auto instanceof Truck) {
                ((Truck) auto).liftTrailer();
            }
        }


    }
}
