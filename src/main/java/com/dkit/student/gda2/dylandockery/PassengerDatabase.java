package com.dkit.student.gda2.dylandockery;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PassengerDatabase
{
    private final ArrayList<Passengers> passengerDatabase;

    public PassengerDatabase(String fileName)
    {
        this.passengerDatabase = new ArrayList<>();
        readPassengersFromFile(fileName);
    }

    public List<Passengers> getAllPassengers()
    {
        return this.passengerDatabase;
    }

    private void readPassengersFromFile(String fileName)
    {
        try
        {
            Scanner reader = new Scanner(new File(fileName));
            reader.useDelimiter(",");
            System.out.println("Works");

            while(reader.hasNext())
            {
                String name = reader.next();
                String idNumber = reader.next();
                String email = reader.next();
                int telephoneNumber = reader.nextInt();
                double latitude = reader.nextDouble();
                double longitude = reader.nextDouble();

                passengerDatabase.add(new Passengers(name, idNumber, email, telephoneNumber, latitude, longitude));
            }
            reader.close();
        }
        catch(FileNotFoundException fnfe)
        {
            fnfe.printStackTrace();
        }



    }

    public void addingAPassenger()
    {

    }

}
