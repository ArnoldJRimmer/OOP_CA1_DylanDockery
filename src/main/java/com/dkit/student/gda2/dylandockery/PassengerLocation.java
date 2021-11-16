package com.dkit.student.gda2.dylandockery;

public class PassengerLocation
{
    private double homeLongitude;
    private double homeLatitude;

    public PassengerLocation(double homeLongitude, double homeLatitude)
    {
        this.homeLongitude = homeLongitude;
        this.homeLatitude = homeLatitude;
    }

    public double getHomeLongitude()
    {
        return homeLongitude;
    }

    public double getHomeLatitude()
    {
        return homeLatitude;
    }
}
