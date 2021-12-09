package com.dkit.student.gda2.dylandockery;


import java.util.Scanner;

public class App
{
    private static Scanner userInput = new Scanner(System.in);
    private static ReadFiles readFiles = new ReadFiles();

    public static void main( String[] args )
    {
        readFiles.readFromFile("MainMenu.txt");
        mainMenu();
    }

    public static void mainMenu()
    {

        int menuOptions;
        menuOptions = userInput.nextInt();
        switch(menuOptions)
        {
            case 0:
            {
                PassengerDatabase passengerDetails = new PassengerDatabase("PassengersData.txt");
                break;
            }
            case 1:
            {

                break;
            }
        }
    }





}
