package com.dkit.student.gda2.dylandockery;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fleet
{
    private final ArrayList<Vehicle> vehicleDatabase;
    private static ReadFiles readFiles = new ReadFiles();

    public Fleet(String fileName)
    {
        this.vehicleDatabase = new ArrayList<>();
        readFiles.readFromFile(fileName);
    }

    public void printAllVehiclesInFleet()
    {
        for (Vehicle vehicles:vehicleDatabase)
        {
            System.out.println(vehicles.toString());
        }
    }





}


