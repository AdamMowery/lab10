

/**
 * Created by adamm on 2/9/2017.
 */
public class NewCar {
    private String make;                    //Setting variables
    private String model;
    private int year;
    private double price;


    NewCar(String make, String model, int year, double price) {      //Constructor for the new cars in the array
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;

    }


    @Override
    public String toString() {                                               //Override method to format to string

        return String.format("%1$10s %2$10s %3$7d %4$10.2f", make, model, year, price);
    }
}
