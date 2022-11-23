package com.sparta;

public class Car {
    private int numberOfWheels = 4;
    private String colour = "pink";

    public void honk() {
        System.out.println("Very loud horn!");
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
