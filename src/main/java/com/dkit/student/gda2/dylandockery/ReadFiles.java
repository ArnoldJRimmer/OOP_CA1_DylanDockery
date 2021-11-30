package com.dkit.student.gda2.dylandockery;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFiles
{
    public void readFromFile(String fileName)
    {
        try
        {
            Scanner reader = new Scanner(new File(fileName));
            reader.useDelimiter(",");

            while(reader.hasNext())
            {
                System.out.println(reader.next().trim());
            }
            reader.close();
        }
        catch(FileNotFoundException fnfe)
        {
            fnfe.printStackTrace();
        }
    }
}
