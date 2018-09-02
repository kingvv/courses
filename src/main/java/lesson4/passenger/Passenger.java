package lesson4.passenger;


/**
 * This class for work with object Passenger
 */

public class Passenger {

    private String ticket;
    private Dog dog;

    /**
     * This constructor take type String
     *
     * @param ticket some String value
     */
    public Passenger(String ticket) {
        this.ticket = ticket;
    }

    /**
     * Use this method if passenger have dog
     *
     * @param dog Dog user type in this package
     */

    public void setDog(Dog dog) {
        this.dog = dog;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("with ticket ").append(ticket);
        if (dog != null) sb.append(", with ").append(dog);
        return sb.toString();
    }
}
