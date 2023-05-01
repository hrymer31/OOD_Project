//****ADD PSEUDOCODE
import java.util.*;
public class Packages {
    Scanner sc = new Scanner(System.in);
    private static Packages packages;
    private ArrayList <String> Destination;
    private ArrayList <String> DepartingCity;

    private ArrayList <String> Package1;
    private ArrayList <String> Package2;
    private ArrayList <String> Package3;
    private ArrayList <String> Package4;
    private ArrayList <String> Package5;
    private ArrayList <String> Package6;
    private ArrayList <String> Package7;
    private ArrayList <String> Package8;
    private ArrayList <String> Package9;

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
        Package7 = new ArrayList<String>();
        Package8 = new ArrayList<String>();
        Package9 = new ArrayList<String>();
    }
//CREATE public getters to access array lists
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
    //CREATE list of Travel To Places by using add methods
    public void addToDestination(String value){
        Destination.add("Maldives");
        Destination.add("Australia");
        Destination.add("Italy");

    }

    public void addToDepartingCity(){
       DepartingCity.add("Atlanta");
        DepartingCity.add("New York");
        DepartingCity.add("Los Angeles");
    }
    //CREATE packages that contain information for trips
    public void addToPackage1(){
        Package1.add("Departing Atlanta");
        Package1.add("Arriving in the Maldives");
        Package1.add("Travel Time will take around 19 hours");
        Package1.add("Price for Trip is $15,900 per person");
    }

    public void addToPackage2(){
        Package2.add("Departing Los Angeles");
        Package2.add("Arriving in the Maldives");
        Package2.add("Travel Time will take around 24 hours");
        Package2.add("Price for trip is $18,000 per person");
    }

    public void addToPackage3(){
        Package3.add("Departing New York");
        Package3.add("Arriving in the Maldives");
        Package3.add("Travel Time will take around 18 hours");
        Package3.add("Price for trip is $17,000 per person");
    }

    public void addToPackage4(){
        Package4.add("Departing Los Angeles");
        Package4.add("Arriving in Italy");
        Package4.add("Travel Time will take around 12 hours");
        Package4.add("Price for trip is $20,000 per person");
    }

    public void addToPackage5(){
        Package5.add("Departing New York");
        Package5.add("Arriving in Italy");
        Package5.add("Travel Time will take around 8 hours");
        Package5.add("Price for trip is $22,000 per person");
    }

    public void addToPackage6(){
        Package6.add("Departing Atlanta");
        Package6.add("Arriving in Italy");
        Package6.add("Travel Time will take around 9 hours");
        Package6.add("Price for trip is $19,000");
    }

    public void addToPackage7(){
        Package7.add("Departing Atlanta");
        Package7.add("Arriving in Australia");
        Package7.add("Travel Time will take around 22 hours");
        Package7.add("Price for trip is $25,000 per person");
    }

    public void addToPackage8(){
        Package8.add("Departing New York");
        Package8.add("Arriving in Australia");
        Package8.add("Travel Time will take around 22 hours");
        Package8.add("Price for trip is $28,000 per person");
    }

    public void addToPackage9(){
        Package9.add("Departing Los Angeles");
        Package9.add("Arriving in Australia");
        Package9.add("Travel Time will take around ");
        Package9.add("Price for trip is 15 hours $23,000 per person");
    }
//CREATE methods to display information added to array
public ArrayList<String> setUpPackage(){
    for (int i = 0; i < Destination.size();i++)
    {
        System.out.println(Destination.get(i));
    }
    System.out.println("Maldives, Australia, or Italy");
    System.out.println("Please choose the destination from above:");

    String destination = sc.next();

    for (int i = 0; i < DepartingCity.size();i++)
    {
        System.out.println(DepartingCity.get(i));
    }
    System.out.println("Atlanta, New York, Los Angeles");
    System.out.println("Please choose departing city from above");
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






