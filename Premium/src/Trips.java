public class Trips {

//CREATE properties of Trips Class

    private TripState state = new OrderedState();

    public TripState getState() {
        return state;
    }

    public void setState(TripState state) {
        this.state = state;
    }


    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();

    }
}

    //Can be stopped at any point in process and resumed later
    //Create a new Trip and auto-assign a unique ID

    // List all trips owned by the Agent by status.
    // Include the ID in each trip for use with UI flow #3.
// Awaiting Travelers
// Awaiting Packages
// Awaiting Payment
// Awaiting Thank You Note
// Itinerary Read

