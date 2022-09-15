package entities;

import java.io.Serializable;

public class Garage implements Serializable {
    private String name;

    public Garage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
