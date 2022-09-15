package entities;

import java.io.Serializable;

public class Car implements Serializable {
    private int carNumber;
    private String carBrand;
    private String carModel;
    private Garage garage;
    private int points;

    public Car(int carNumber, String carBrand, String carModel, Garage garage) {
        this.carNumber = carNumber;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.garage = garage;
    }

    public Car() {

    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}