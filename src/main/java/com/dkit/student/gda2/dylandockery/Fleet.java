package com.dkit.student.gda2.dylandockery;

import java.util.ArrayList;

public class Fleet
{

    private static ArrayList<Vehicle> theFleet;

    public static void addToFleet(Vehicle addVehicle)
    {
        theFleet.add(addVehicle);
    }

    public static void removeFromFleet(Vehicle removeVehicle)
    {
        theFleet.remove(removeVehicle);
    }

    public static void printFleet()
    {

    }

}
