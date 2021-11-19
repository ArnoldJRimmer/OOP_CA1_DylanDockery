package com.dkit.student.gda2.dylandockery;

import java.util.ArrayList;

public class App
{
    public static void main( String[] args )
    {
        Coordinates testValues = new Coordinates(23000,6700);
        Car test = new Car("BMW","M-series",20,4,"2013-D-8786","23-09-2015",50000,testValues);
        System.out.println(test);

        ArrayList<Vehicle> fleet = new ArrayList<>();
        fleet.add(test);





    }
}
