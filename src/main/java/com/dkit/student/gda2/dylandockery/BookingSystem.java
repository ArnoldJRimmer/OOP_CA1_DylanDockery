package com.dkit.student.gda2.dylandockery;

import org.w3c.dom.ls.LSOutput;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class BookingSystem
{
   private final ArrayList<VehicleBooking> bookingDatabase;
   private final PassengerDatabase passengerDatabase = new PassengerDatabase("PassengersData.txt");
   private Fleet fleet = new Fleet("TheFleet.txt");
   private static Scanner userInput = new Scanner(System.in);

   private static WriteFiles wrtieToVehicleBooking = new WriteFiles();
   ReadFiles readFileBookingData = new ReadFiles();

    public BookingSystem(String filename)
    {
        this.bookingDatabase = new ArrayList<>();
        readFileBookingData.readFromFileVehicleBooking(filename,bookingDatabase);
        //addingABooking();
        //removeBooking();
        checkAvailability(bookingDatabase);
    }

    public List<VehicleBooking> getAllBookings()
    {
        return this.bookingDatabase;
    }

    private void addingABooking(ArrayList<VehicleBooking> addABooking)
    {
        int bookingId;
        String passengerId;
        String vehicleId;
        int date;
        int time;
        double bookingCost;
        double startLongitude;
        double startLatitude;
        double endLongitude;
        double endLatitude;

        addBookingMessage("<Booking_Id>");
        bookingId = userInput.nextInt();

        addBookingMessage("<Passenger_Id>");
        passengerId = userInput.next();

        addBookingMessage("<Vehicle_Id>");
        vehicleId = userInput.next();

        addBookingMessage("<Date>");
        date = userInput.nextInt();

        addBookingMessage("<Time>");
        time = userInput.nextInt();

        addBookingMessage("<BookingCost>");
        bookingCost =userInput.nextDouble();

        addBookingMessage("<Start_Longitude>");
        startLongitude = userInput.nextDouble();

        addBookingMessage("<Start_Longitude>");
        startLatitude = userInput.nextDouble();

        addBookingMessage("<Start_Longitude>");
        endLongitude = userInput.nextDouble();

        addBookingMessage("<Start_Longitude>");
        endLatitude = userInput.nextDouble();

        bookingDatabase.add(new VehicleBooking(bookingId,passengerDatabase.getAllPassengers().get(0).getIdNumber(),
                fleet.getAllVehicles().get(0).getRegistrationNumber(),
                date,time,bookingCost,startLatitude,startLongitude,endLatitude,endLongitude));

        wrtieToVehicleBooking.writeToFileAddToEndVehicleBooking("BookingData.txt",bookingDatabase);

    }

    private void checkAvailability(ArrayList<VehicleBooking> bookingDatabase)
    {
        Scanner userInput = new Scanner(System.in);
        String regNo = "";
        int date = 0;

        //Loop to check through the bookingSystem
        boolean exit = false;
        int i = 0;
        while(!exit)
        {
            System.out.println("Please enter the <Reg.No> of the vehicle you would like to check");
            regNo = userInput.next();

            System.out.println("Please enter the <Date> of the vehicle you would like to check");
            date = userInput.nextInt();

            if(regNo.equals(bookingDatabase.get(i).getVehicleId()) && date == (bookingDatabase.get(i).getDate()))
            {
                System.out.println("This vehicle " + regNo + "has already been booked for the date" + date);
                exit = true;
            }
            else
            {
                i++;
            }
        }
    }

    private ArrayList bookingDatabaseSortedByDate(ArrayList<VehicleBooking> bookingDatabase)
    {
        ArrayList<VehicleBooking> sortedByDate = new ArrayList<>();
        return sortedByDate;
    }

    private static PrintStream addBookingMessage(String message)
    {
        return System.out.printf("Please enter a " + message + "to the booking system");
    }

    private static void removeBooking(ArrayList<VehicleBooking> removeBooking)
    {
        int bookingId;

        System.out.printf("Please enter the <Id number> of the passenger you would like to remove: ");
        bookingId = userInput.nextInt();
        loopsThroughArraylist(removeBooking,bookingId);

    }

    private static void loopsThroughArraylist(ArrayList<VehicleBooking> removeBooking, int bookingId)
    {
        boolean exit = false;
        int i = Constants.INCREMENTFROM_0;
        while(!exit)
        {
            if(bookingId == (removeBooking.get(i).getBookingId()))
            {
                removeBooking.remove(removeBooking.get(i));
                wrtieToVehicleBooking.writeToFileAddToEndVehicleBooking("BookingData",removeBooking);
                exit = true;
            }
            else
            {
                i++;
            }
        }
    }






}
