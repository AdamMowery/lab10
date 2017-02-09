import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<NewCar> carSet = new ArrayList<>();
    private static Scanner scnr = new Scanner(System.in);
    private static Validation valid = new Validation();

    public static void main(String[] args) {
        int input = 0;                                                                                           //initializing the while variable
        carSet.add(new NewCar("Dodge", "Ram 2500", 2017, 60000));
        carSet.add(new NewCar("Ford", "F150", 2017, 50000));
        carSet.add(new NewCar("Chevrolet", "Silverado", 2017, 50000));                      //Setting the array car set up
        carSet.add(new UsedCar("Dodge", "Ram 2500", 2006, 16000, 50000));
        carSet.add(new UsedCar("Ford", "F150", 2006, 6000, 150000));
        carSet.add(new UsedCar("Chevrolet", "Silverado", 2004, 5000, 160000));
        listVehicles();                                                                                         //List of cars on the lot
        while (input != 4) {
            buyVehicle();
            listVehicles();
            System.out.println("Would you like to buy another vehicle? 1. yes / 2. no");
            input = scnr.nextInt();                                                                             //Getting input from the user to determine to exit or not
            scnr.nextLine();

        }
    }

    private static void buyVehicle() {
        int carnumber;
        int input;
        System.out.println("");
        System.out.print("Enter the number of the car you would like to buy: ");
        carnumber = valid.getValidInteger(1,6);                                                                        //Getting the users choice of cars they would like to buy
        carnumber = carnumber - 1;                                                                              //Aligning the user input with the array index
        carSet.get(carnumber);
        System.out.println("Are you sure you want to buy the - ");                                              //Verifying the purchase
        System.out.println(carSet.get(carnumber).toString());
        System.out.println("1. Yes / 2. No");
        input = valid.getValidInteger(1,2);
        if (input == 1) {
            carSet.remove(carnumber);                                                                          //Removal of the vehicle from the list
        }

    }

    private static void listVehicles() {
        System.out.format("%11s%11s%8s%11s%11s", "Make", "Model", "Year", "Price", "Mileage");
        System.out.println("");
        for (int i = 0; i < carSet.size(); i++) {                                               //Printing the array list for the user to see what they have
            System.out.println((i + 1) + carSet.get(i).toString());

        }
    }


}
