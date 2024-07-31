package com.cbfacademy.cars;

import java.util.ArrayList;
import java.util.List;

public class Showroom {
    public List<com.cbfacademy.cars.Car> cars;

    public Showroom()
    {
        this.cars = new ArrayList<com.cbfacademy.cars.Car>();
        this.cars.add(new Car("Volvo", "V40", "blue", 2012));
        this.cars.add(new Car("Porsche", "Panamera", "red", 2009 ));
        this.cars.add(new Car("Audi", "A3", "grey", 2018));
    }

    public List<com.cbfacademy.cars.Car> getCars() { return this.cars; }


}
