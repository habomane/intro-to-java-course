package com.cbfacademy.cars;

public class Car {
    private String make;
    private String model;
    private String colour;
    private int year;

    public Car(String make, String model, String colour, int year)
    {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    public String getMake() { return this.make; }

    public String getModel() { return this.model; }

    public int getYear() { return this.year; }

    public String getColour() { return this.colour; }

    public void setColour(String newColour) { this.colour = newColour; }

    public String getDetails() { return String.format("Car details:\nMake: %s\nModel: %s\nColour: %s\nYear: %s", this.make, this.model, this.colour, this.year); }
}
