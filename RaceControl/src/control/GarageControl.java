package control;

import entities.Garage;

import java.util.ArrayList;
import java.util.Scanner;

public class GarageControl {

    public static void addGarage (Scanner sc, ArrayList<Garage> garages){
        System.out.println("Name of the garage:\n");
        String name = sc.nextLine();

        if (garages.isEmpty()) {
            garages.add(new Garage(name));
            System.out.println("Garage added");
        } else {
            boolean b = garages.stream().anyMatch(garage -> garage.getName().equals(name));

            if (b) {
                System.out.println("There is already a garage with that name");
            } else {
                garages.add(new Garage(name));
            }
        }

    }

    public static void deleteGarage (Scanner sc, ArrayList<Garage> garages){
        System.out.println("Name of the team you wish to delete");
        String name = sc.nextLine();
        Garage deleteGarage = garages.stream()
                .filter(garage -> garage.getName()
                        .equals(name)).findFirst().orElse(null);
        garages.remove(deleteGarage);
        System.out.println("Successfully deleted");
    }

    public static void showGarages(Scanner sc, ArrayList<Garage> garages){
        for (Garage garage : garages) {
            System.out.println(garage.getName());
        }
    }
}

