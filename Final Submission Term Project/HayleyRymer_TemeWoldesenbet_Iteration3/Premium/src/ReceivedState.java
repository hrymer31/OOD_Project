public class ReceivedState implements TripState {

    @Override
    public void next(Trips trips) {
        System.out.println("This package is already received by a client.");
    }

    @Override
    public void prev(Trips trips) {
        trips.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {

    }
}