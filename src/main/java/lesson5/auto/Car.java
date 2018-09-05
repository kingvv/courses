package lesson5.auto;


public class Car extends Auto {

    public Car(int speed, String fuelType, String model, String numericAuto) {
        super(speed, fuelType, model, numericAuto, TypeAuto.CAR.name());
    }


    @Override
    public void switchSpeed() {
        System.out.println(String.format("speed was switched automated on %s", model));
    }

}
