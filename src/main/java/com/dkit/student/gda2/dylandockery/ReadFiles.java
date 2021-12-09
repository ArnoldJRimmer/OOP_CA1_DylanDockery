package com.dkit.student.gda2.dylandockery;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//https://www.daniweb.com/programming/software-development/threads/446764/reading-data-from-file-to-arraylist
public class ReadFiles
{
    public void readFromFilePassengers(String fileName,ArrayList<Passengers> passengers)
    {
        BufferedReader reader = null;
        try
        {
            reader = new BufferedReader(new FileReader(fileName));
            String newLine;
            while((newLine = reader.readLine()) != null)
            {
                String indexer[] = newLine.split(",");
                passengers.add(new Passengers(indexer[0],
                        indexer[1],
                        indexer[2],
                        Integer.parseInt(indexer[3]),
                        Double.parseDouble(indexer[4]),
                        Double.parseDouble(indexer[5])));
            }
            reader.close();
        }
        catch (IOException e)
        {
            //e.printStackTrace();
        }

    }

    public void readFromFileVehicleBooking(String fileName,ArrayList<VehicleBooking> bookings)
    {
        BufferedReader reader = null;
        try
        {
            reader = new BufferedReader(new FileReader(fileName));
            String newLine;
            while((newLine = reader.readLine()) != null)
            {
                String indexer[] = newLine.split(",");
                bookings.add(new VehicleBooking(
                        Integer.parseInt(indexer[0]),
                        indexer[1],
                        indexer[2],
                        Integer.parseInt(indexer[3]),
                        Integer.parseInt(indexer[4]),
                        Double.parseDouble(indexer[5]),
                        Double.parseDouble(indexer[6]),
                        Double.parseDouble(indexer[7]),
                        Double.parseDouble(indexer[8]),
                        Double.parseDouble(indexer[9])));
            }
            reader.close();
        }
        catch (IOException e)
        {
            //e.printStackTrace();
        }

    }

    public void readFromFileVehicles(String fileName, ArrayList<Vehicle>vehicles)
    {
        BufferedReader reader = null;
        try
        {
            reader = new BufferedReader(new FileReader(fileName));
            String newLine;
            while((newLine = reader.readLine()) != null)
            {
                String indexer[] = newLine.split(",");
                vehicles.add(new Vehicle(indexer[0],
                        indexer[1],
                        Integer.parseInt(indexer[2]),
                        Integer.parseInt(indexer[3]),
                        indexer[4],
                        Double.parseDouble(indexer[5]),
                        indexer[6],
                        Integer.parseInt(indexer[7]),
                        Double.parseDouble(indexer[8]),
                        Double.parseDouble(indexer[9])));
            }
            reader.close();
        }
        catch (IOException e)
        {
            //e.printStackTrace();
        }

    }

    public void readFromFile(String fileName)
    {
        BufferedReader reader = null;
        try
        {
            reader = new BufferedReader(new FileReader(fileName));
            while((reader.readLine()) != null)
            {
               reader.readLine();
            }
            reader.close();
        }
        catch (IOException e)
        {

        }
    }


}
