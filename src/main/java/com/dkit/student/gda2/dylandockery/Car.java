package com.dkit.student.gda2.dylandockery;

public class Car extends Vehicle
{


    public Car(String make, String model, int milesPerKwh, int numberOfSeats, String registrationNumber, String lastServiceDate, int mileage, double latitude, double longitude)
    {
        super(make, model, milesPerKwh, numberOfSeats, registrationNumber, Constants.CAR_COST_PER_MILE, lastServiceDate, mileage, latitude, longitude);
    }
}
