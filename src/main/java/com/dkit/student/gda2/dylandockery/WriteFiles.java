package com.dkit.student.gda2.dylandockery;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class WriteFiles
{
    //Rewrites the edits made to the passenger file
    public void writeToFile(String fileName, ArrayList<Passengers> passingValue)
    {

        try
        {
            File myFile = new File(fileName);

            if(!myFile.exists())
            {
                myFile.createNewFile();
            }

            BufferedWriter writesToFile = new BufferedWriter(new FileWriter(myFile));

            for(int i = 0; i<=passingValue.size()-1; i++)
            {
                writesToFile.write(passingValue.get(i).toString() + "\n");
            }

            writesToFile.close();

        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    //Adds a new record to the end of the passenger file
    public void writeToFileAddToEnd(String fileName, ArrayList<Passengers> passingValue)
    {

        try
        {
            File myFile = new File(fileName);

            if(!myFile.exists())
            {
                myFile.createNewFile();
            }

            BufferedWriter writesToFile = new BufferedWriter(new FileWriter(myFile,true));

            for(int i = 0; i<=passingValue.size()-1; i++)
            {
                writesToFile.write(passingValue.get(i).toString() + "\n");
            }

            writesToFile.close();

        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    public void writeToFileAddToEndVehicleBooking(String fileName, ArrayList<VehicleBooking> passingValue)
    {

        try
        {
            File myFile = new File(fileName);

            if(!myFile.exists())
            {
                myFile.createNewFile();
            }

            BufferedWriter writesToFile = new BufferedWriter(new FileWriter(myFile,true));

            for(int i = 0; i<=passingValue.size()-1; i++)
            {
                writesToFile.write(passingValue.get(i).toString() + "\n");
            }

            writesToFile.close();

        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

}
