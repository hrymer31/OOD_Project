import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

//THIS is the XML Concrete class
public class Trip {
    private String trip;
    //CREATE properties of Trips Class
    public String  packages, payments;
    public int assignedID;
public static ArrayList<String> travelers = new ArrayList<>();


    //CREATE default constructor
    Trip(){

    }

    //CREATE parameterized constructor
    Trip(int assignedID,  ArrayList travelers, String packages, String payments){
    this.assignedID = assignedID;
    this.travelers = travelers;
    this.packages = packages;
    this.payments = payments;


    }
    //ADD getters and setters
    public String getTrip(){
            return trip;
}

    public void setTrip(String trip) {
        this.trip = trip;
    }

    public int getAssignedID() {
        return assignedID;
    }

    public void setAssignedID(int assignedID) {
        this.assignedID = assignedID;
    }

    public ArrayList<String> getTravelers() {
        return travelers;
    }

    public void setTravelers(ArrayList travelers) {
        this.travelers = travelers;
    }

    public String getPackages() {
        return packages;
    }

    public void setPackages(String packages) {
        this.packages = packages;
    }

    public String getPayments() {
        return payments;
    }

    public void setPayments(String payments) {
        this.payments = payments;
    }
    private String writeValueAsString(String trip) {
        return trip;

    }
    public static void JsonProcessingException() {
        try {
            Trip xmlMapper = new Trip();

            // serialize our Object into XML string
            String xmlString = xmlMapper.writeValueAsString(String.valueOf(new Trip()));

            // write to the console
            System.out.println(xmlString);

            // write XML string to file
            File xmlOutput = new File("serialized.xml");
            FileWriter fileWriter = new FileWriter(xmlOutput);
            fileWriter.write(xmlString);
            fileWriter.close();

            // handle exception
        } catch (IOException e) {
            // handle exception
        }
    }
    private String readValue(String readContent, Class<Trip> tripClass) {
        return readContent;
    }

    public static void deserializeFromXML() {
        try {
            Trip xmlMapper = new Trip();

            // read file and put info in string
            String readContent = new String(Files.readAllBytes(Paths.get("to_deserialize.xml")));

            // deserialize from the XML into a trip
            Trip deserializedData = xmlMapper;

            // Print Trip details
            System.out.println("Trip: ");
            System.out.println("ID #: " + deserializedData.getAssignedID());
            System.out.println("Travelers: " + deserializedData.getTravelers());
            System.out.println("Package: " + deserializedData.getPackages());
            System.out.println("Payments: " + deserializedData.getPayments());
        } catch (IOException e) {

        }
    }



}
