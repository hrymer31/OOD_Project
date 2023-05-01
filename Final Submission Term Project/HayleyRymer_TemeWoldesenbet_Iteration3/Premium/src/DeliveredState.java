public class DeliveredState implements TripState {

    @Override
    public void next(Trips trips) {
        trips.setState(new ReceivedState());
    }

    @Override
    public void prev(Trips trips) {
        trips.setState(new OrderedState());
    }

    @Override
    public void printStatus() {

    }


}