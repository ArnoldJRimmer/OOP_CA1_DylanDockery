package com.dkit.student.gda2.dylandockery;

public class VehicleBooking
{
    private int bookingId;
    private int date;
    private int time;
    private double bookingCost;
    private Coordinates bookingStart;
    private Coordinates bookingEnd;

    public VehicleBooking(int bookingId, int date, int time, double bookingCost, Coordinates bookingStart, Coordinates bookingEnd)
    {
        this.bookingId = bookingId;
        this.date = date;
        this.time = time;
        this.bookingCost = bookingCost;
        this.bookingStart = bookingStart;
        this.bookingEnd = bookingEnd;
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
}
