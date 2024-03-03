public class Car {
   private String code;
  private   int maxOfPassengers;
   private Route route;

    public Car(String code, int maxOfPassengers, Route route) {
        this.code = code;
        this.maxOfPassengers = maxOfPassengers;
        this.route = route;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getMaxOfPassengers() {
        return maxOfPassengers;
    }

    public void setMaxOfPassengers(int maxOfPassengers) {
        this.maxOfPassengers = maxOfPassengers;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
