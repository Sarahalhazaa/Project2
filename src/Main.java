public class Main {
    public static void main(String[] args) {

      Route route1= new Route("A1","A2",100);
        Route route2= new Route("A12","A23",150);

        Car car1 = new Car("CAR1",4,route1);
        Car car2 = new Car("CAR2",1,route2);

        Passenger[] passengers = new Passenger[2];
      passengers[0]= new NonSubscribersPassengers("NonSubscriber","1",true);
        passengers[1]= new SubscribersPassengers("Subscriber","2");
try {
    System.out.println();
    passengers[0].ReserveCarToPassenger(car2);
    passengers[0].displayInformation();

}catch (IllegalArgumentException e){
 System.out.println("Car capacity is zero");
}
      System.out.println();
      passengers[1].ReserveCarToPassenger(car1);
      passengers[1].displayInformation();
    }
}