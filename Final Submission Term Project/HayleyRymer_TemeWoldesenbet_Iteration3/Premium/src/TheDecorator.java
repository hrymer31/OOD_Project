public class TheDecorator extends ItineraryDecorator{

    public TheDecorator(interface_Itinerary decoratedItinerary) {
        super(decoratedItinerary);
    }

    @Override
    public void print() {
        decoratedItinerary.print();

    }

    //CREATE method like:
    /*private void setRedBorder(Shape decoratedShape)
    {
        // Display message whenever function is called
        System.out.println("Border Color: Red");
    }*/
}
