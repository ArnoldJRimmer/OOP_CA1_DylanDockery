package com.dkit.student.gda2.dylandockery;

import java.util.ArrayList;
import java.util.List;

public class Fleet
{
    private static List<Vehicle> vehicleList = new ArrayList<Vehicle>();
    private static Car cars;
    private static Van vans;
    private static Truck trucks;
    private static FourByFour fourByFours;
    private static Coordinates test = new Coordinates(37983,4567);

    public void printFleet()
    {
        create50Cars(vehicleList);
        create10Vans(vehicleList);
        printFleet(vehicleList);
    }

    private static void printFleet(List<Vehicle> vehicleList)
    {
        for(Vehicle vehiclesInFleet:vehicleList)
        {
            System.out.println(vehiclesInFleet.toString());
        }
    }

    private static void create50Cars(List vehicleList)
    {
        cars = new Car("Ford","Focus",50,4,"2007-D-8945","08-08-2013",3456,test);
        vehicleList.add(cars);
        cars = new Car("Ford","Focus",50,4,"2007-D-8945","08-08-2013",3456,test);
        vehicleList.add(cars);

    }

    private static void create10Vans(List vehicleList)
    {
        vans = new Van("Ford","pocus",50,4,"2007-D-8945","08-08-2013",3456,test,254);
        vehicleList.add(vans);
    }

    private static void create10Trucks(List vehicleList)
    {

    }

    private static void create10_4x4s()
    {

    }


}


