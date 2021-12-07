package com.dkit.student.gda2.dylandockery;

public class Van extends Vehicle
{
    private int loadingCapacity;


    public Van(String make, String model, int milesPerKwh, int numberOfSeats, String registrationNumber,String lastServiceDate, int mileage, double latitude, double longitude, int loadingCapacity){
        super(make, model, milesPerKwh, numberOfSeats, registrationNumber, Constants.VAN_COST_PER_MILE, lastServiceDate, mileage, latitude, longitude);
        this.loadingCapacity = loadingCapacity;
    }

    public int getLoadingCapacity()
    {
        return loadingCapacity;
    }


}
