package models.vehicle;

public abstract class Vehicle {
  
  private int controlNumber;
  private int vacantNumber;
  private String aditionalServices;

  public Vehicle(int controlNumber, int vacantNumber, String aditionalServices) {
    this.controlNumber = controlNumber;
    this.vacantNumber = vacantNumber;
    this.aditionalServices = aditionalServices;
}

  public int getControlNumber() {
    return this.controlNumber;
  }

  public int getVacantNumber() {
      return this.vacantNumber;
  }

  public String getAditionalServices() {
      return this.aditionalServices;
  }

  public abstract int getPrice(int hours);

}
