package Main;

import java.util.Scanner;
import java.util.HashMap;

public class Vehicles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What car (model) are you looking for?");
        String carModel = scanner.nextLine();

        HashMap<String, String> car = new HashMap<>();

        //Add cars to our inventory
        car.put("Civic", "Honda");
        car.put("Cruze", "Chevrolet");
        car.put("Carolla", "Toyota");
        car.put("F150", "Ford");

        //Filters out cars
        if (car.containsKey(carModel)) {
            System.out.println("Our selection is right over here:");

        } else {
            System.out.println("Unfortunately we don't have that car model:");
        }
    }
}


