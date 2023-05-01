
import java.util.*;

import java.util.ArrayList;
import java.io.*;
import java.io.IOException;
public class Main {

    public static void ThankYouNote(){
        System.out.println("Thank you for using Premium Travel Services, luxury travel made simple");

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

//CREATE a new Array List to store information to be stored later in JSON or XML - agent can enter "later" to save and quit
    ArrayList <Trip> savedInfo = new ArrayList<>();
        for(int i = 0; i< savedInfo.size(); i++){
         savedInfo.add(new Trip());
     }

        System.out.println("Hello Premium Agents. ");
        System.out.println("Please select your agent number to get started:");

        //CREATE the Implement of SingletonTravelAgents
        TravelAgents agents = TravelAgents.getInstance();
        System.out.println(agents.getAgent1());
        System.out.println(agents.getAgent2());
        System.out.println(agents.getAgent3());
        System.out.println(agents.getAgent4());
        //CREATE agent list and READ information
        System.out.println("Agent Number: ");
        int agentNumber = sc.nextInt();
        //CREATE switch statement for proper greeting
        switch (agentNumber){
            case 1: agentNumber = 1;

            System.out.println("Thanks Sandra");
                System.out.println("Please enter later to save work and exit at any time");
            System.out.println();
                break;
            case 2: agentNumber = 2;
                System.out.println("Thanks Gavin");
                System.out.println("Please enter later to save work and exit at any time");
                System.out.println();
                break;
            case 3: agentNumber = 3;
                System.out.println("Thanks Jessi");
                System.out.println("Please enter later to save work and exit at any time");
                System.out.println();
                break;
            case 4: agentNumber = 4;
                System.out.println("Thanks Janet");
                System.out.println("Please enter later to save work and exit at any time");
                System.out.println();
                break;

        }



//CREATE a new trip
        /*USE LOOP to keep adding travelers until "later"*/
        System.out.println("Would you like to create a new trip?" + " Y or N");

        String answer = sc.next();
        if (answer.equals("Y")) {
            //CREATE A random ID for trip
            int randomNumber = new Random().nextInt(9000) + 1000;
            System.out.println("Trip Number: " + randomNumber);
            System.out.println();
            System.out.println("Add Travelers to trip " + randomNumber + ": ");

            //CREATE Implement for Singleton Person
            Person persons = Person.getInstance();

            //CREATE an Array List to store persons from this screen
            ArrayList<String> travelers = new ArrayList<>();

            System.out.println(persons.getPerson1());
            System.out.println(persons.getPerson2());
            System.out.println(persons.getPerson3());
            System.out.println(persons.getPerson4());
            System.out.println(persons.getPerson5());
            System.out.println(persons.getPerson6());
            System.out.println(persons.getPerson7());
            System.out.println(persons.getPerson8());
            System.out.println(persons.getPerson9());
            System.out.println(persons.getPerson10());
            String addTravelers;
          do{
                System.out.println("Please enter the full name of traveler you would like to add");
                String input = sc.nextLine();
                sc.nextLine();
                travelers.add(input);

                System.out.println("Would you like to add more travelers? Please enter Yes or Done");
                 addTravelers = sc.next();
            }
          while (addTravelers.equals("Yes"));
            /*CREATE LATER OPTION*/


            //PACKAGES
            Packages packages = Packages.getInstance();
            //Double check here this works may need to use loop here to print
            Packages.getInstance().getPlacesArray();
            System.out.println("Choose Destination: ");

            //System.out.println(packages.setUpPackage());

            //ADD Payment information to trip

            System.out.println("Does customer need to utilize loan option?");
            String customerInput = sc.next();
            if (customerInput.equals("Yes")){
                //THEN invoke loan methods
            }
            else {
                //implement payments (can I update it to payment or have to do that here and add to itinerary)

            }

        }

 ThankYouNote();


    }

//*****STORE persons for Trip and random number
}