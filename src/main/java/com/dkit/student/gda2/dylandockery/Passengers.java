package com.dkit.student.gda2.dylandockery;

public class Passengers
{
    private String name;
    private String idNumber;
    private String email;
    private int telephoneNumber;
    private Coordinates passengersHome;

    public Passengers(String name, String idNumber, String email, int telephoneNumber, Coordinates passengersHome)
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

    public Coordinates getPassengersHome()
    {
        return passengersHome;
    }
}
