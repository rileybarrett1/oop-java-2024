package src.main.java.ca.nl.cna.riley.barrett;

import java.io.InputStreamReader;
import java.time.Year;
import java.util.Scanner;

public class FunWithCars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //TODO change these variables to make, model, year, value
        System.out.println("Enter the Make: ");
        String make = input.nextLine();

        System.out.println("Enter the Model: ");
        String model = input.nextLine();

        System.out.println("Enter the Year: ");
        int year = Integer.parseInt(input.nextLine());

        System.out.println("Enter the Value: ");
        int value = input.nextInt();


        //TODO create a car object
        Car car = new Car(make,model,year,value);

        System.out.printf(" %s %s %s %s",car.getMake(),car.getModel(),car.getYear(),car.getValue() );


    }
}
