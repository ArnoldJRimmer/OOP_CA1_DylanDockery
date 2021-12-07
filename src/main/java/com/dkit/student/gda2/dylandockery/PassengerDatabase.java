package com.dkit.student.gda2.dylandockery;



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
        //addingAPassenger(passengerDatabase);
        readFiles.readFromFilePassengers(fileName,passengerDatabase);
        //editPassengerDetails(passengerDatabase);
        //removePassenger(passengerDatabase);

    }

    public List<Passengers> getAllPassengers()
    {
        return this.passengerDatabase;
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
        boolean exit = false;
        while(exit == false)
        {
            System.out.printf("Please enter the <Name> of the passenger you would like to add: > \n");
            name = userInput.next();

            System.out.printf("Please enter the <Id.Number> of the passenger: > \n");
            idNumber = userInput.next();

            System.out.printf("\nPlease enter the <Email> of the passenger: > \n");
            email = userInput.next();

            System.out.printf("\nPlease enter the <Phone.No> of the passenger: > \n");
            phoneNumber = userInput.nextInt();

            System.out.printf("\nPlease enter the <Latitude Position> of the passenger: > \n");
            latitude = userInput.nextDouble();

            System.out.printf("\nPlease enter the <Longitude Position> of the passenger: > \n");
            longitude = userInput.nextDouble();

            newPassenger.add(new Passengers(name,idNumber,email,phoneNumber,latitude,longitude));

            writeFiles.writeToFileAddToEnd("PassengersData.txt",newPassenger);
            exit = true;
        }


    }

    //Removes passengers by allowing the user to search for the passenger using there id number
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
        //Tidy this up
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
                        System.out.println("Please enter the passengers new name: >");
                        String name = userInput.next();
                        editingAttributes.get(i).setName(name);
                        break;
                    }

                    case 2:
                    {
                        System.out.println("Please enter the passengers new email: >");
                        String newEmail = userInput.next();
                        editingAttributes.get(i).setEmail(newEmail);
                        break;
                    }

                    case 3:
                    {
                        System.out.println("Please enter the passengers new phone number: >");
                        int newPhoneNo = userInput.nextInt();
                        editingAttributes.get(i).setTelephoneNumber(newPhoneNo);
                        break;
                    }

                    case 4:
                    {
                        System.out.println("Please enter the passengers new Latitude value");
                        double newLatitude = userInput.nextDouble();

                        System.out.println("Please enter the passengers new Longitude value");
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


    private static void compareRecords(String email, int telephoneNo,ArrayList<Passengers> checkForDuplicates)
    {
        boolean exit = false;
        int i = Constants.INCREMENTFROM_0;
        while(!exit)
        {
            if(email.equals(checkForDuplicates.get(i).getEmail()) ||
                    telephoneNo == (checkForDuplicates.get(i).getTelephoneNumber()))
            {
                System.out.println("The record you are trying to enter already exists");
                exit = true;
            }
            else
            {
                i++;
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

    @Override
    public String toString()
    {
        return "" + passengerDatabase +"\n";

    }
}
