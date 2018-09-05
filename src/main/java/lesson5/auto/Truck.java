package lesson5.auto;

import java.util.Objects;

public class Truck extends Auto {

    private boolean trailer;


    public Truck(int speed, String model, boolean trailer) {
        super.speed = speed;
        super.model = model;
        super.typeAuto = TypeAuto.TRUCK.name();

        this.trailer = trailer;
    }


    public void liftTrailer() {
        System.out.println(String.format("lift trailer %s", typeAuto));
    }


    @Override
    public void switchSpeed() {
        System.out.println(String.format("speed was switched manually on %s", model));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return trailer == truck.trailer;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), trailer);
    }
}
