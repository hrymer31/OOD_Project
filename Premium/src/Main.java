import java.util.*;

public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("Welcome to Premium Travel Services");
                System.out.println("Hello Premium Agents. " );
                        System.out.println("Please select your ID number to get started:");
                //Implement SingletonTravelAgents here
            TravelAgents agents = TravelAgents.getInstance();
                System.out.println(agents.getAgent1());
                System.out.println(agents.getAgent2());
                System.out.println(agents.getAgent3());
                System.out.println(agents.getAgent4());

                //*****CHOOSE agent


//CREATE a new trip
        System.out.println("Would you like to create a new trip?" + " Y or N");
        String answer = sc.next();
        if (answer.equals("Y")){
            //CREATE A random ID for trip
            int randomNumber = new Random().nextInt(9000) + 1000;
            System.out.println("Trip Number: "+ randomNumber);
            System.out.println();
            System.out.println("Add Travelers to trip " +randomNumber+": ");
            //Implement Singleton Person here

            Person persons = Person.getInstance();

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
        }

//*****STORE persons for Trip and random number


            }
        }
