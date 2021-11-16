package com.dkit.student.gda2.dylandockery;

public class Truck extends Vehicle
{
    private int loadingCapacity;

    public Truck(String make, String model, int milesPerKwh, int numberOfSeats, String registrationNumber, double costPerMile, String lastServiceDate, int mileage, DepoLocation currentLocation, int loadingCapacity)
    {
        super(make, model, milesPerKwh, numberOfSeats, registrationNumber, costPerMile, lastServiceDate, mileage, currentLocation);
        this.loadingCapacity = loadingCapacity;
    }

    public int getLoadingCapacity()
    {
        return loadingCapacity;
    }
}