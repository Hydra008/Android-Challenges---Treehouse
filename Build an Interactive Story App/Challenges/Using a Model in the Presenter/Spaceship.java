public class Spaceship {
    private String shipType;
    private int numPassengers = 0;
    
    public String getShipType() {
      return shipType;
    }
    
    public void setShipType(String shipType) {
      this.shipType = shipType;
    }
    
    public int getNumPassengers() {
      return numPassengers;
    }
    
    public void setNumPassengers(int numPassengers) {
      this.numPassengers = numPassengers;
    }
    
    public Spaceship() {
      shipType = "SHUTTLE";
    }
    
    public Spaceship(String shipType) {
      this.shipType = shipType;
    }
}
