package com.dkit.student.gda2.dylandockery;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PassengerDatabase
{
    private final ArrayList<Passengers> passengerDatabase;
    private static ReadFiles readFiles = new ReadFiles();
    private static Scanner userInput;
    private static WriteFiles writeFiles = new WriteFiles();

    public PassengerDatabase(String fileName)
    {
        this.passengerDatabase = new ArrayList<>();
        addingAPassenger(passengerDatabase);
        readFiles.readFromFile(fileName);
    }

    public List<Passengers> getAllPassengers()
    {
        return this.passengerDatabase;
    }

    // Need to tidy this up
    private static void addingAPassenger(ArrayList<Passengers>newPassenger)
    {
        userInput = new Scanner(System.in);
        String name;
        String email;
        int phoneNumber;
        String idNumber;
        double longitude;
        double latitude;
        boolean exit = false;
        while(exit == false)
        {
            System.out.printf("Please enter the <Name> of the passenger you would like to add: > \n");
            name = userInput.next();
            System.out.printf("Please enter the <Id.Number> of the passenger: > \n");
            idNumber = userInput.next();
            System.out.printf("\nPlease enter the <Email> of the passenger: > \n");
            email = userInput.next();
            System.out.printf("\nPlease enter the <Phone.No> of the passenger: > \n");
            phoneNumber = userInput.nextInt();
            System.out.printf("\nPlease enter the <Latitude Position> of the passenger: > \n");
            latitude = userInput.nextDouble();
            System.out.printf("\nPlease enter the <Longitude Position> of the passenger: > \n ");
            longitude = userInput.nextDouble();

            newPassenger.add(new Passengers(name,idNumber,email,phoneNumber,latitude,longitude));

            writeFiles.writeToFile("PassengersData.txt",newPassenger);
            exit = true;
        }



    }

    private static void editPassengerDetails(ArrayList<Passengers> editPassengerDetails)
    {
        //The user types in the name of the field they would like to edit

        boolean exit = false;
        while(exit = false)
        {
            System.out.println("What passenger would you like to edit?:");
        }
    }


}
