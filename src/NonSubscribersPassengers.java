public class NonSubscribersPassengers extends Passenger {
    private boolean discountCoupon;

    public NonSubscribersPassengers(String name, String ID, boolean discountCoupon) {
        super(name, ID);
        this.discountCoupon = discountCoupon;
    }

    @Override
    public void ReserveCarToPassenger(Car car) {
       setCar(car);
        if (car.getMaxOfPassengers() == 0){
            throw new IllegalArgumentException();}
            if(discountCoupon){
       setTripCost(getCar().getRoute().getTripPrice()* 0.9);
                System.out.println("Trip price after discount: "+getTripCost());
    }else {setTripCost(getCar().getRoute().getTripPrice());
                System.out.println("Trip price: "+getTripCost());
            }
}
    @Override
    public void displayInformation() {

        System.out.println("Name: "+getName());
        System.out.println("ID: "+getID());
        System.out.println("Code: "+getCar().getCode());




    }
}
