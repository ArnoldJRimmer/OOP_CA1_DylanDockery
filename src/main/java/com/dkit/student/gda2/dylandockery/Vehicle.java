package com.dkit.student.gda2.dylandockery;



public class Vehicle
{
    private String make;
    private String model;
    private int milesPerKwh;
    private int numberOfSeats;
    private String registrationNumber;
    private double costPerMile;
    private String lastServiceDate;
    private int mileage;
    private Coordinates currentLocation;



    public Vehicle(String make, String model, int milesPerKwh, int numberOfSeats, String registrationNumber, double costPerMile, String lastServiceDate, int mileage, double latitude,double longitude)
    {
        this.make = make;
        this.model = model;
        this.milesPerKwh = milesPerKwh;
        this.numberOfSeats = numberOfSeats;
        this.registrationNumber = registrationNumber;
        this.costPerMile = costPerMile;
        this.lastServiceDate = lastServiceDate;
        this.mileage = mileage;
        this.currentLocation = new Coordinates(latitude,longitude);
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public int getMilesPerKwh()
    {
        return milesPerKwh;
    }

    public int getNumberOfSeats()
    {
        return numberOfSeats;
    }

    public String getRegistrationNumber()
    {
        return registrationNumber;
    }

    public double getCostPerMile()
    {
        return costPerMile;
    }

    public String getLastServiceDate()
    {
        return lastServiceDate;
    }

    public int getMileage()
    {
        return mileage;
    }

    public Coordinates getCurrentLocation()
    {
        return currentLocation;
    }


    public double workOutCostPerMile(double costPerMile)
    {
        return 0;
    }

    @Override
    public String toString()
    {
        //For loop here
        return
                "Make:\t" + make +
                "Model:\t" + model +
                "MilesPerKwh:\t" + milesPerKwh +
                "NumberOfSeats:\t" + numberOfSeats +
                "RegistrationNumber:\t" + registrationNumber +
                "CostPerMile:\t" + costPerMile +
                "LastServiceDate:\t" + lastServiceDate +
                "Mileage:\t" + mileage +
                "CurrentLocation:\t" + currentLocation;
    }
}
