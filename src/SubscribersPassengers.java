public class SubscribersPassengers extends Passenger{
    public SubscribersPassengers(String name, String ID) {
        super(name, ID);
    }

    @Override
    public void ReserveCarToPassenger(Car car) {
      setCar(car);
      setTripCost(getCar().getRoute().getTripPrice()*0.5);
        System.out.println("Trip price after discount: "+getTripCost());
    }

    @Override
    public void displayInformation() {

        System.out.println("Name: "+getName());
        System.out.println("ID: "+getID());
        System.out.println("Code: "+getCar().getCode());





    }
}
