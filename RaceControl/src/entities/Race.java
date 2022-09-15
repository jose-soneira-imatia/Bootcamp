package entities;

import java.io.Serializable;
import java.util.ArrayList;


public  class Race implements Serializable {
    private String name;
    private ArrayList<Car> participants;
    private TypeRace type;
    private Car[] podium;


    public Race() {
    }

    public Race(String name, ArrayList<Car> participants, TypeRace type) {
        this.name = name;
        this.participants = participants;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Car> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<Car> participants) {
        this.participants = participants;
    }

    public String getType() {
        if (type.equals(TypeRace.ELIMINATION)) {
            return "ELIMINATION";
        } else if (type.equals(TypeRace.STANDARD)) {
            return "STANDARD";
        }

        return null;
    }

    public void standardRace() {
        this.type = type.STANDARD;
    }

    public void eliminationRace() {
        this.type = type.ELIMINATION;
    }

    public Car[] getPodium() {
        return podium;
    }

    public void setPodium(Car[] podium) {
        this.podium = podium;

    }

}