package com.dkit.student.gda2.dylandockery;



import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PassengerDatabase
{
    private final ArrayList<Passengers> passengerDatabase;
    private static ReadFiles readFiles = new ReadFiles();
    private static Scanner userInput = new Scanner(System.in);
    private static WriteFiles writeFiles = new WriteFiles();

    public PassengerDatabase(String fileName)
    {
        this.passengerDatabase = new ArrayList<>();
        readFiles.readFromFilePassengers(fileName,passengerDatabase);
        readFiles.readFromFile("PassengerMenu.txt");
        passengerMenu();

    }
    public List<Passengers> getAllPassengers()
    {
        return this.passengerDatabase;
    }

    private void passengerMenu()
    {
        int menuOptions;
        menuOptions = userInput.nextInt();
        switch (menuOptions)
        {

            case 1:
            {
                addingAPassenger(passengerDatabase);
                break;
            }
            case 2:
            {
                editPassengerDetails(passengerDatabase);
            }
            case 3:
            {
                removePassenger(passengerDatabase);
            }
            case 0:
            {
                App.mainMenu();
            }
        }

    }



    // Need to tidy this up
    private static void addingAPassenger(ArrayList<Passengers>newPassenger)
    {
        userInput = new Scanner(System.in);
        String name;
        String email;
        int phoneNumber;
        String idNumber;
        double longitude;
        double latitude;

        addPassangerMessages("<Name>");
        name = userInput.next();

        addPassangerMessages("<Id_Number>");
        idNumber = userInput.next();

        addPassangerMessages("<Email>");
        email = userInput.next();
        compareRecords(email,newPassenger);

        addPassangerMessages("<Phone_Num>");
        phoneNumber = userInput.nextInt();
        compareRecords(phoneNumber,newPassenger);


        addPassangerMessages("<Latitude>");
        latitude = userInput.nextDouble();

        addPassangerMessages("<Longitude>");
        longitude = userInput.nextDouble();

        newPassenger.add(new Passengers(name,idNumber,email,phoneNumber,latitude,longitude));

        writeFiles.writeToFile("PassengersData.txt",newPassenger);


    }

    //Removes passengers by allowing the user to search for the passenger using their id number
    private static void removePassenger(ArrayList<Passengers> removePassenger)
    {
        String idNumber = "";

        System.out.printf("Please enter the <Id number> of the passenger you would like to remove: ");
        idNumber = userInput.next();

        loopsThroughArraylist(removePassenger,idNumber);

    }

    private static void editPassengerDetails(ArrayList<Passengers> editPassenger)
    {
        String idNumber;

        System.out.printf("Please enter the <Id number> of the passenger you would like to edit: ");
        idNumber = userInput.next();

        editAttriubtesOfPassengers(editPassenger,idNumber);

        writeFiles.writeToFile("PassengersData.txt",editPassenger);

    }

    //Edit the different items such as name,email etc of a passenger in the arraylist
    private static void editAttriubtesOfPassengers(ArrayList<Passengers> editingAttributes,String idNumber)
    {
        for(int i = 0; i<= editingAttributes.size();i++)
        {
            if(idNumber.equals(editingAttributes.get(i).getIdNumber()))
            {
                System.out.printf("What attribute of the passenger would you like to edit:> ");
                int menuOptions = userInput.nextInt();

                switch(menuOptions)
                {
                    case 1:
                    {
                        editPassengerMessage("<Name>");
                        String name = userInput.next();
                        editingAttributes.get(i).setName(name);
                        break;
                    }

                    case 2:
                    {
                        editPassengerMessage("<Email>");
                        String newEmail = userInput.next();
                        editingAttributes.get(i).setEmail(newEmail);
                        break;
                    }

                    case 3:
                    {
                        editPassengerMessage("<Phone.No>");
                        int newPhoneNo = userInput.nextInt();
                        editingAttributes.get(i).setTelephoneNumber(newPhoneNo);
                        break;
                    }

                    case 4:
                    {
                        editPassengerMessage("<Latitude>");
                        double newLatitude = userInput.nextDouble();

                        editPassengerMessage("<Longitude>");
                        double newLongitude = userInput.nextDouble();

                        editingAttributes.get(i).setPassengersHome(newLatitude,newLongitude);
                    }

                    case 5:
                    {
                        System.out.println("Exiting programme....");
                        i = 100;
                    }

                }//End of switch

            }//End if statement

        }//End of for loop
    }


    private static void compareRecords(String passingValue,ArrayList<Passengers> checkForDuplicates)
    {
        boolean exit = false;
        int i = Constants.INCREMENTFROM_0;
        while(!exit)
        {
            if(passingValue.equals(checkForDuplicates.get(i).getEmail()))
            {
                System.out.printf("The email you are trying to enter already exists,Please try again:> ");
                i++;
            }
            else
            {
                exit = true;

            }
        }
    }

    private static void compareRecords(int passingValue,ArrayList<Passengers> checkForDuplicates)
    {
        boolean exit = false;
        int i = Constants.INCREMENTFROM_0;
        while(!exit)
        {
            if(passingValue == (checkForDuplicates.get(i).getTelephoneNumber()))
            {
                System.out.printf("The phone number you are trying to enter already exists,Please try again:> ");
                i++;
            }
            else
            {
                exit = true;

            }
        }
    }



    private static void loopsThroughArraylist(ArrayList<Passengers> removePassenger, String idNumber)
    {
        boolean exit = false;
        int i = Constants.INCREMENTFROM_0;
        while(!exit)
        {
            if(idNumber.equals(removePassenger.get(i).getIdNumber()))
            {
                removePassenger.remove(removePassenger.get(i));
                writeFiles.writeToFile("PassengersData.txt",removePassenger);
                exit = true;
            }
            else
            {
                i++;
            }
        }
    }

    private static PrintStream editPassengerMessage(String message)
    {
        return System.out.printf("Please enter the passengers new :" + message + ":");
    }

    private static PrintStream addPassangerMessages(String message)
    {
        return System.out.printf("Please enter the passengers" + message + "you would like to add:>");
    }


}
