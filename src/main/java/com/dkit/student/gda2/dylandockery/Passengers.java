package com.dkit.student.gda2.dylandockery;

public class Passengers
{
    private String name;
    private String idNumber;
    private String email;
    private int telephoneNumber;
    PassengerLocation passengersHome;

    public Passengers(String name, String idNumber, String email, int telephoneNumber, PassengerLocation passengersHome)
    {
        this.name = name;
        this.idNumber = idNumber;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.passengersHome = passengersHome;
    }

    public String getName()
    {
        return name;
    }

    public String getIdNumber()
    {
        return idNumber;
    }

    public String getEmail()
    {
        return email;
    }

    public int getTelephoneNumber()
    {
        return telephoneNumber;
    }

    public PassengerLocation getPassengersHome()
    {
        return passengersHome;
    }
}
