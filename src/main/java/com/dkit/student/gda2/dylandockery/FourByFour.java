package com.dkit.student.gda2.dylandockery;

public class FourByFour extends Vehicle
{

    public FourByFour(String make, String model, int milesPerKwh, int numberOfSeats, String registrationNumber, String lastServiceDate, int mileage, double latitude, double longitude)
    {
        super(make, model, milesPerKwh, numberOfSeats, registrationNumber, Constants.FOUR_BY_FOUR_COST_PER_MILE, lastServiceDate, mileage, latitude, longitude);
    }
}
