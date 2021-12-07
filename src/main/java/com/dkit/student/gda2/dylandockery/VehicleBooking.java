package com.dkit.student.gda2.dylandockery;

public class VehicleBooking
{
    private int bookingId;
    private int date;
    private int time;
    private double bookingCost;
    private Coordinates bookingStart;
    private Coordinates bookingEnd;

    public VehicleBooking(int bookingId, int date, int time, double bookingCost,double longitude,double latitude,double latitudeEnd,double longitudeEnd)
    {
        this.bookingId = bookingId;
        this.date = date;
        this.time = time;
        this.bookingCost = bookingCost;
        this.bookingStart = new Coordinates(latitude,longitude);
        this.bookingEnd = new Coordinates(latitudeEnd,longitudeEnd);
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
        return "VehicleBooking{" +
                "bookingId=" + bookingId +
                ", date=" + date +
                ", time=" + time +
                ", bookingCost=" + bookingCost +
                ", bookingStart=" + bookingStart +
                ", bookingEnd=" + bookingEnd +
                '}';
    }
}
