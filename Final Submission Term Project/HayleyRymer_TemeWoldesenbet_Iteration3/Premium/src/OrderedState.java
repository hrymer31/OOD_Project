public class OrderedState implements TripState {


    @Override
    public void next(Trips trips) {
        trips.setState(new DeliveredState());
    }

    @Override
    public void prev(Trips trips) {
        System.out.println("The package is in its root state.");
    }

    @Override
    public void printStatus() {

    }


}




