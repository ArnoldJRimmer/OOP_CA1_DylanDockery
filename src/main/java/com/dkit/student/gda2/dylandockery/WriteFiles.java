package com.dkit.student.gda2.dylandockery;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class WriteFiles
{
    public void writeToFile(String fileName, ArrayList<Passengers> passingValue)
    {

        try
        {
            File myFile = new File(fileName);

            if(!myFile.exists())
            {
                myFile.createNewFile();
            }

            BufferedWriter writesToFile = new BufferedWriter(new FileWriter(myFile,true));
            writesToFile.write(passingValue.toString());
            writesToFile.close();

        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

}
