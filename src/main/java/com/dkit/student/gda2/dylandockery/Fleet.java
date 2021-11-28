package com.dkit.student.gda2.dylandockery;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Fleet
{
    private final ArrayList<Vehicle> vehicleDatabase;

    public Fleet(String fileName)
    {
        this.vehicleDatabase = new ArrayList<>();
        readVehiclesFromFile(fileName);
    }

    public void printAllVehiclesInFleet()
    {
        for (Vehicle vehicles:vehicleDatabase)
        {
            System.out.println(vehicles.toString());
        }
    }

    private void readVehiclesFromFile(String fileName)
    {
            BufferedReader myReader = null;
            try
            {
                String readCurrentLine;
                myReader = new BufferedReader(new FileReader(fileName));

                while((readCurrentLine = myReader.readLine()) != null)
                {
                    String[] data = readCurrentLine.split(",");
                    System.out.println(readCurrentLine);
                }
            }
            catch(IOException ioe )
            {
                ioe.printStackTrace();
            }
    }



    //Add a vehicle
    //Edit the details of a vehicle
    //Remove a vehicle

}


