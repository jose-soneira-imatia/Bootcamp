package entities;

import java.util.ArrayList;

public class Tournament {
    private String name;
    private ArrayList<Race> races;
    private Car[] results;

    public Tournament() {
    }

    public Tournament(String name, ArrayList<Race> races, Car[] results) {
        this.name = name;
        this.races = races;
        this.results = results;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Race> getRaces() {
        return races;
    }

    public void setRaces(ArrayList<Race> races) {
        this.races = races;
    }

    public Car[] getResults() {
        return results;
    }

    public void setResults(Car[] results) {
        this.results = results;
    }
}
