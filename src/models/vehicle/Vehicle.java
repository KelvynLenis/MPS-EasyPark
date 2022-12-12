package models.vehicle;

public abstract class Vehicle {
  
  private int controlNumber;
  private int vacantNumber;
  private String aditionalServices;
  public PriceBehaviour priceBehaviour;

  public Vehicle(int controlNumber, int vacantNumber, String aditionalServices, PriceBehaviour priceBehaviour) {
    this.controlNumber = controlNumber;
    this.vacantNumber = vacantNumber;
    this.aditionalServices = aditionalServices;
    this.priceBehaviour = priceBehaviour;
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

  public PriceBehaviour getPriceBehaviour() {
      return this.priceBehaviour;
  }

  public void setPriceBehaviour(PriceBehaviour priceBehaviour) {
      this.priceBehaviour = priceBehaviour;
  }

  public int getPriceValue(int hours) {
      return priceBehaviour.getPrice(hours);
  }
}
