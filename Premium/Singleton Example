import java.util.*;

public final class TravelAgents {

    //CREATE a static instance of a Travel agent object
private static TravelAgents agents;


//CREATE travel agents variables
    private String Agent1 = "1. Sandra Owenby";
    private String Agent2 = "2. Gavin Beeker";
    private String Agent3 = "3. Jessi Cone";
    private String Agent4 = "4. Janet Salsbury";


    // Prevent client from instantiating new agents objects
    private TravelAgents() {
    }

    //Synchronized so its thread safe.
    public static synchronized TravelAgents getInstance() {

        // Load a Travel Agent Object
        if (agents == null) {
            agents = new TravelAgents();
        }

        return agents;
    }
//CREATE GETTER AND SETTER METHODS
public String getAgent1() {
    return Agent1;
}

    public void setAgent1(String Agent1) {
        this.Agent1 = Agent1;
    }

    public String getAgent2() {
        return Agent2;
    }

    public void setAgent2(String Agent2) {
        this.Agent2 = Agent2;
    }

    public String getAgent3() {
        return Agent3;
    }

    public void setAgent3(String Agent3) {
        this.Agent3 = Agent3;
    }


    public String getAgent4() {
        return Agent4;
    }

    public void setAgent4(String Agent4) {
        this.Agent4 = Agent4;
    }


    public static void setTravelAgents(TravelAgents agents) {
        TravelAgents.agents = agents;
    }
}






