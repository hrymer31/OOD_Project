import java.util.*;
public class Main {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Premium Travel Services");

        System.out.println("Please pick an agent");
        //Implement SingletonTravelAgents here

        try {

            // create singleton list
            // using method singletonList() method
            List<String> travelAgents = Collections.singletonList("1.Sandra Owenby, 2.Gavin Beeker, 3.Robert California, 4.Jessi Cone, 5.Janet Salsbury" );

            // print the list
            System.out.println("Travel Agents : " + travelAgents);
        }

        catch (IllegalArgumentException e) {
            System.out.println("Exception thrown : " + e);
        }

        //STORE TRAVEL AGENT
       int travelAgent = sc.nextInt();

//UI FLOW 1
        

//CREATE A random ID for trip
        int randomNumber = new Random().nextInt(9000) + 1000;


    }
}
