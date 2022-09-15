package race;

import control.CarControl;
import entities.Car;
import entities.Garage;
import entities.Tournament;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Race {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Garage> garages = new ArrayList<>();
        ArrayList<Race> races;
        ArrayList<Tournament> tournaments;

        garages.add(new Garage("Mercedes"));
        garages.add(new Garage("Ferrari"));
        garages.add(new Garage("Renault"));
        garages.add(new Garage("Aston Martin"));
        garages.add(new Garage("Alfa Romeo"));


        Menu.menu(sc , cars,  garages);
    }
}