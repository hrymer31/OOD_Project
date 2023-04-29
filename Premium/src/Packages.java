//****ADD PSEUDOCODE
import java.util.*;
public class Packages {
    Scanner sc = new Scanner(System.in);
    private static Packages packages;
    private ArrayList <String> Destination = null;
    private ArrayList <String> DepartingCity = null;

    private ArrayList <String> Package1 = null;
    private ArrayList <String> Package2 = null;
    private ArrayList <String> Package3 = null;
    private ArrayList <String> Package4 = null;
    private ArrayList <String> Package5 = null;
    private ArrayList <String> Package6 = null;
    private ArrayList <String> Package7 = null;
    private ArrayList <String> Package8 = null;
    private ArrayList <String> Package9 = null;

    public static Packages getInstance() {
        if (packages == null)
            packages = new Packages();
        return packages;
    }
    private Packages(){
        DepartingCity = new ArrayList<String>();
        Destination= new ArrayList<String>();
        Package1 = new ArrayList<String>();
        Package2 = new ArrayList<String>();
        Package3 = new ArrayList<String>();
        Package4 = new ArrayList<String>();
        Package5 = new ArrayList<String>();
        Package6 = new ArrayList<String>();
    }

    public ArrayList<String> getPlacesArray(){
        return this.Destination;
    }

    public ArrayList<String> getPackage1(){
        return this.Package1;
    }
    public ArrayList<String> getPackage2(){
        return this.Package2;
    }

    public ArrayList<String> getPackage3(){
        return this.Package3;
    }
    public ArrayList<String> getPackage4(){
        return this.Package4;
    }
    public ArrayList<String> getPackage5(){
        return this.Package5;
    }
    public ArrayList<String> getPackage6(){
        return this.Package6;
    }
    public ArrayList<String> getPackage7(){
        return this.Package7;
    }
    public ArrayList<String> getPackage8(){
        return this.Package8;
    }
    public ArrayList<String> getPackage9(){
        return this.Package9;
    }
    //CREATE list of Travel To Places
    public void addToDestination(String value){
        Destination.add("Maldives");
        Destination.add("Australia");
        Destination.add("Italy");

    }

    public void addToDepartingCity(String value){
        Destination.add("Atlanta");
        Destination.add("New York");
        Destination.add("Los Angeles");
    }
    public void addToPackage1(String value){
        Package1.add("Departing Atlanta");
        Package1.add("Arriving in the Maldives");
        Package1.add("Travel Time will take around 19 hours");
        Package1.add("Price for Trip is $15,900 per person");
    }
public ArrayList<String> setUpPackage(){

   System.out.println("Please choose the destination:");
    for (int i = 0; i < Destination.size();i++)
    {
        System.out.println(Destination.get(i));
    }
    String destination = sc.next();
   System.out.println("Please choose departing city");
    for (int i = 0; i < DepartingCity.size();i++)
    {
        System.out.println(DepartingCity.get(i));
    }
    String departingCity = sc.next();

    if (destination.equals("Maldives") && departingCity.equals("Atlanta")){
        return getPackage1();
    }
    if (destination.equals("Maldives") && departingCity.equals("Los Angeles")) {
        return getPackage2();
    }
    if (destination.equals("Maldives") && departingCity.equals("New York")) {
        return getPackage3();
    }
    if (destination.equals("Italy") && departingCity.equals("Los Angeles")) {
        return getPackage4();
    }
    if (destination.equals("Italy") && departingCity.equals("New York")) {
        return getPackage5();
    }
    if (destination.equals("Italy") && departingCity.equals("Atlanta")) {
        return getPackage6();
    }
    if (destination.equals("Australia") && departingCity.equals("Atlanta")) {
        return getPackage7();
    }
    if (destination.equals("Australia") && departingCity.equals("New York")) {
        return getPackage8();
    }
    if (destination.equals("Australia") && departingCity.equals("Los Angeles")) {
        return getPackage9();
    }
    return null;
}

}








/*


    //CREATE Hours of Travel
public void addTravelHoursArray(String value){
   TravelHours.add("Atlanta to Italy is 9 hours");
   TravelHours.add("Atlanta to Australia is 22 hours");
    TravelHours.add("Atlanta to France is 8 hours");

    TravelHours.add("New York to Maldives is 18 hours");
    TravelHours.add("New York to Los Angeles is 6 hour");
    TravelHours.add("New York to Australia is 22 hours");
    TravelHours.add("New York to Italy is 8 hours");
    TravelHours.add("New York to France is 7 Hours");
    TravelHours.add("Los Angeles to Australia is 15 hours");
    TravelHours.add("Los Angeles to Italy is 12 hours");
    TravelHours.add("Los Angeles to France is 11 hours");
    TravelHours.add("Los Angeles to the Maldives is 24 hours");
    TravelHours.add("Los Angeles to New York is 5 hours");


}

//Price


        //private constructor.





    }

*/