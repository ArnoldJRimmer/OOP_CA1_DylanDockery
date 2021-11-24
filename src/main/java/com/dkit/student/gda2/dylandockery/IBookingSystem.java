package com.dkit.student.gda2.dylandockery;

public interface IBookingSystem
{
    boolean addBookingToSystem(VehicleBooking vehicleBooking);
    boolean removeBookingFromSystem(VehicleBooking booking);
    boolean editBookingInSystem(VehicleBooking oldBooking,VehicleBooking newBooking);
    int searchForexistingBooking(VehicleBooking searchForBooking);
    void printSpecificBooking(VehicleBooking printSpecific);
    void showBookingList();

}
