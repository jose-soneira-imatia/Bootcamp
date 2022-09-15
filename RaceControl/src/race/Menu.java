package race;

import control.CarControl;
import control.GarageControl;
import entities.Car;
import entities.Garage;
import entities.Race;
import entities.Tournament;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    //public static void menu(Scanner sc , ArrayList<Car> cars,  ArrayList<Garage> garages, ArrayList<Race> races,Tournament tournament, ArrayList<Tournament> tournaments) throws IOException {
    public static void menu(Scanner sc , ArrayList<Car> cars,  ArrayList<Garage> garages) throws IOException {
        System.out.println("--------RACE CONTROL-------");
        int opc = 0;
        do {
            System.out.println("1- CAR CONTROL");
            System.out.println("2- GARAGE CONTROL");
            System.out.println("0- EXIT");
            System.out.println("Write the number of the option:");
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc) {
                case 1:
                    menuCars(sc, cars, garages);
                    break;

                case 2:
                    menuGarages(sc, garages);
                    break;
            }
        }while (opc != 0) ;

    }

        public static void menuCars(Scanner sc , ArrayList<Car> cars, ArrayList<Garage> garages){
        System.out.println("CAR CONTROL");
        int opc = 0;
        do {
            System.out.println("1- Add Cars");
            System.out.println("2- Deleted Cars");
            System.out.println("3- Show Cars");
            System.out.println("0- Return to menu");
            System.out.println("Select an option:");

            opc = sc.nextInt();
            sc.nextLine();
            switch(opc){
                case 1:
                    CarControl.addCar(sc, cars, garages);
                    break;
                case 2:
                    CarControl.deleteCar(sc, cars);
                    break;
                case 3:
                    CarControl.showCars(sc, cars);
                    break;
                case 0:
                    break;
            }
        } while (opc != 0);

    }

    public static void menuGarages(Scanner sc ,ArrayList<Garage> garages){
        System.out.println("GARAGE CONTROL");
        int opc = 0;
        do {
            System.out.println("1- Add Garages");
            System.out.println("2- Deleted Garages");
            System.out.println("3- Show Garages");
            System.out.println("0- Return to menu");
            System.out.println("Select an option:");

            opc = sc.nextInt();
            sc.nextLine();
            switch(opc){
                case 1:
                    GarageControl.addGarage(sc,garages);
                    break;
                case 2:
                    GarageControl.deleteGarage(sc, garages);
                    break;
                case 3:
                    GarageControl.showGarages(sc, garages);
                    break;
                case 0:
                    break;
            }
        } while (opc != 0);

    }


}
