package com.dkit.student.gda2.dylandockery;

public class Coordinates
{
    private double longitude;
    private double latitude;

    public Coordinates(double latitude ,double longitude)
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
