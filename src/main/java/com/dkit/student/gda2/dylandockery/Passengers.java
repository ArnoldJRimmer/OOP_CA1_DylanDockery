package com.dkit.student.gda2.dylandockery;

public class Passengers
{
    private String name;
    private String idNumber;
    private String email;
    private int telephoneNumber;
    private Coordinates passengersHome;

    public Passengers(String name, String idNumber, String email, int telephoneNumber, double latitude,double longitude)
    {
        this.name = name;
        this.idNumber = idNumber;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.passengersHome = new Coordinates(latitude, longitude);
    }



    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
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

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setPassengersHome(double longitude,double latitude)
    {
        this.passengersHome = new Coordinates(longitude, latitude);
    }

    @Override
    public String toString()
    {
        return""+name+","+idNumber +","+email+","+ telephoneNumber +","+ passengersHome;
    }
}
