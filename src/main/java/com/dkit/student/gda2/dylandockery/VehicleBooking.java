package com.dkit.student.gda2.dylandockery;

public class VehicleBooking
{
    private int bookingId;
    private String passengerId;
    private String vehicleId;
    private int date;
    private int time;
    private double bookingCost;
    private Coordinates bookingStart;
    private Coordinates bookingEnd;

    public VehicleBooking(int bookingId, String passengerId, String vehicleId, int date, int time, double bookingCost, double startLatitude,double startLongitude,double endLatitude, double endLongitude)
    {
        this.bookingId = bookingId;
        this.passengerId = passengerId;
        this.vehicleId = vehicleId;
        this.date = date;
        this.time = time;
        this.bookingCost = bookingCost;
        this.bookingStart = new Coordinates(startLatitude,startLongitude);
        this.bookingEnd = new Coordinates(endLatitude,endLongitude);
    }

    public String getPassengerId()
    {
        return passengerId;
    }

    public String getVehicleId()
    {
        return vehicleId;
    }

    public int getBookingId()
    {
        return bookingId;
    }

    public int getDate()
    {
        return date;
    }

    public int getTime()
    {
        return time;
    }

    public double getBookingCost()
    {
        return bookingCost;
    }

    public Coordinates getBookingStart()
    {
        return bookingStart;
    }

    public Coordinates getBookingEnd()
    {
        return bookingEnd;
    }

    private double workOutCost(double bookingCost)
    {
        //To do work out the cost of travel based on vehicle, and distance, and passenger distance
        return 0;
    }

    @Override
    public String toString()
    {
        return bookingId +","+passengerId+","+vehicleId+","+date+","+time+","+bookingCost+","+bookingStart+","+bookingEnd ;

    }
}
