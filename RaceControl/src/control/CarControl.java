package control;

import entities.Car;
import entities.Garage;

import java.util.ArrayList;
import java.util.Scanner;

public class CarControl {
    public static void addCar(Scanner sc, ArrayList<Car> cars, ArrayList<Garage> garages){
        Garage garage = null;
        boolean correct = true;
        int num = 0;
        do {
            correct = true;
            System.out.println("Vehicle number:");
            num = sc.nextInt();
            sc.nextLine();

            for (Car car : cars) {
                if (car.getCarNumber()==num) {
                    correct = true;
                    break;
                }
            }
            if (correct == false) {
                System.out.println("There is already a car with that number");
            }
        } while (correct == false && num > 0);


        if (num != 0) {
            System.out.println("Vehicle brand");
            String carBrand = sc.nextLine();
            System.out.println("Vehicle model");
            String carModel = sc.nextLine();
            System.out.println("Write the name of the garage to which the vehicle belongs");
            if (garages == null) {
                System.out.println("No registered garages");
            }else{
                for (Garage arrayGaraje : garages) {
                    System.out.println(arrayGaraje.getName());
                }

                String garageName = sc.nextLine();
                for (Garage value : garages) {
                    if (value.getName().equalsIgnoreCase(garageName)) {
                        garage = value;
                    }
                }
                cars.add(new Car(num, carBrand, carModel, garage));
            }
        }else{
            System.out.println("Error on registration");
        }

    }

    public static void deleteCar (Scanner sc, ArrayList<Car> cars){
        System.out.println("Number of the vehicle you wish to delete:\n");
        int num = sc.nextInt();
        Car deleteCar = cars.stream().filter(car -> car.getCarNumber()==num).findAny().orElse(null);
        cars.remove(deleteCar);
        System.out.println("Deleted correctly");
    }


    public static void showCars(Scanner sc, ArrayList<Car> cars){
        System.out.println("Number Brand ----  Model");
        for (Car car : cars) {
            System.out.println(car.getCarNumber() + "    " + car.getCarBrand() + "  " + car.getCarModel());
        }
    }
}