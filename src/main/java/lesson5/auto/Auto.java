package lesson5.auto;

import java.util.Objects;

public class Auto {

    protected int speed;
    protected String fuelType;
    protected String typeAuto;
    protected String model;
    protected String numericAuto;
    public Auto() {
        System.out.println("Auto____Parent constructor implicit was called without param____");
    }


    public Auto(int speed, String fuelType, String model, String numericAuto, String typeAuto) {
        System.out.println("Auto____Parent constructor called  with param____");

        this.speed = speed;
        this.fuelType = fuelType;
        this.model = model;
        this.numericAuto = numericAuto;
        this.typeAuto = typeAuto;
    }

    public String getModel() {
        return model;
    }

    public void ride() {
        System.out.println(String.format("Start %s speed - %s", model, speed));
    }

    public void stop() {
        System.out.println(String.format("%s stoped", model));

    }

    public void switchSpeed() {
        System.out.println("switch speed");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto)) return false;
        Auto auto = (Auto) o;
        return speed == auto.speed &&
                Objects.equals(fuelType, auto.fuelType) &&
                Objects.equals(typeAuto, auto.typeAuto) &&
                Objects.equals(model, auto.model) &&
                Objects.equals(numericAuto, auto.numericAuto);
    }

    @Override
    public int hashCode() {

        return Objects.hash(speed, fuelType, typeAuto, model, numericAuto);
    }
}
