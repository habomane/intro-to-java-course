package com.cbfacademy.cars;



public class App {
    
    public void main()
    {
        Showroom showroom = new com.cbfacademy.cars.Showroom();

        for(com.cbfacademy.cars.Car car : showroom.cars )
        {
            System.out.println(car.getDetails());
        }
    }
}
