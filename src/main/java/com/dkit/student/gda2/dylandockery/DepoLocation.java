package com.dkit.student.gda2.dylandockery;

public class DepoLocation
{
    private double longitude;
    private double latitude;

    public DepoLocation(double longitude, double latitude)
    {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public double getLatitude()
    {
        return latitude;
    }
}
