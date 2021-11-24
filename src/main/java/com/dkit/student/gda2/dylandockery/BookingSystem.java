package com.dkit.student.gda2.dylandockery;

import java.util.ArrayList;

import static com.dkit.student.gda2.dylandockery.Constants.INDEX_0;

public class BookingSystem implements IBookingSystem
{
    private ArrayList<VehicleBooking> myBookings;

    public BookingSystem()
    {
        this.myBookings = new ArrayList<VehicleBooking>();
    }

    @Override
    public boolean addBookingToSystem(VehicleBooking newBooking)
    {
        if(checkIfBookingExists(newBooking.getBookingId()) >= INDEX_0)
        {
            System.out.println("This booking already exists");
            return false;
        }

        myBookings.add(newBooking);
        return true;

    }

    @Override
    public boolean removeBookingFromSystem(VehicleBooking booking)
    {
        int foundBooking = checkIfBookingExists(booking);
        if(foundBooking < INDEX_0)
        {
            System.out.println(booking.getBookingId() + "does not exist ");
            return false;
        }

        this.myBookings.remove(foundBooking);
        System.out.println(booking.getBookingId() + " was successfully deleted");

        return true;

    }

    @Override
    public boolean editBookingInSystem(VehicleBooking oldBooking, VehicleBooking newBooking)
    {
        int foundBooking = checkIfBookingExists(oldBooking);
        if(foundBooking < INDEX_0)
        {
            System.out.println(oldBooking.getBookingId() + "does not exist");
            return false;
        }

        this.myBookings.set(foundBooking, newBooking);
        return true;

    }

    @Override
    public int searchForexistingBooking(VehicleBooking searchForBooking)
    {
        if(checkIfBookingExists(searchForBooking)>=INDEX_0)
        {
            return searchForBooking.getBookingId();
        }
        return -1;
    }

    @Override
    public void printSpecificBooking(VehicleBooking printSpecific)
    {
        if(checkIfBookingExists(printSpecific) >= INDEX_0)
        {

        }
    }

    @Override
    public void showBookingList()
    {
        System.out.println("All Bookings in the System:");
        for(VehicleBooking currentBookings:this.myBookings)
        {
            System.out.println(myBookings.toString());
        }
    }

    // Code is based on johnloane/GD2MobilePhone22
    private int checkIfBookingExists(VehicleBooking booking)
    {
        return this.myBookings.indexOf(booking);
    }

    private int checkIfBookingExists(int bookingId)
    {
        for(int i = 0;i <this.myBookings.size(); i++)
        {
            VehicleBooking checkBooking = this.myBookings.get(i);
            if (checkBooking.getBookingId() == bookingId)
            {
                return i;
            }
        }
        return -1;
    }
}
