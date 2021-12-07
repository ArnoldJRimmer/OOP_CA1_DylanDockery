package com.dkit.student.gda2.dylandockery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class BookingSystem
{
   private final ArrayList<VehicleBooking> bookingDatabase;
   private final PassengerDatabase listOfPassengers = new PassengerDatabase("PassengersData.txt");
   private final Fleet listOfAllVehicles = new Fleet("TheFleet.txt");


    public BookingSystem()
    {
        this.bookingDatabase = new ArrayList<>();
        addingABooking();
    }

    public List<VehicleBooking> getAllBookings()
    {
        return this.bookingDatabase;
    }

    private void addingABooking()
    {

            listOfPassengers.getAllPassengers();
            listOfAllVehicles.getAllVehicles();

        System.out.println(Arrays.toString(Stream.of(listOfAllVehicles.getAllVehicles(),listOfPassengers.getAllPassengers().get(0).getName()).toArray()));
    }



}
