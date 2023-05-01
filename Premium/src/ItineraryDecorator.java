public abstract class ItineraryDecorator implements interface_Itinerary{
    //CREATE protected variable
    protected interface_Itinerary decoratedItinerary;

    //CREATE abstract class method
    public ItineraryDecorator ( interface_Itinerary decoratedItinerary ){
        this.decoratedItinerary =decoratedItinerary;
    }

    @Override
    public void print() {
        decoratedItinerary.print();
    }
}
