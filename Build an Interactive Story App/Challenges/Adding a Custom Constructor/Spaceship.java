public class Spaceship {
    public String shipType;
  
  public Spaceship()
  {
   shipType="SHUTTLE"; 
  }
  public Spaceship(String type)
  {
   shipType=type; 
  }
    
    public String getShipType() {
      return shipType;
    }
    
    public void setShipType(String shipType) {
      this.shipType = shipType;
    }
}
