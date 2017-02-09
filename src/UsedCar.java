

/**
 * Created by adamm on 2/9/2017.
 */
public class UsedCar extends NewCar {
    private double mileage;

    UsedCar(String make, String model, int year, double price, double mileage) {     //Constructor for the used cars in the array
        super(make, model, year, price);
        this.mileage = mileage;
    }

    @Override
    public String toString() {                                  //Override method to format to string
        return super.toString() + String.format("%11s", mileage);
    }
}
