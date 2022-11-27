package models;

public class Vehicle {

  private int controlNumber;
  private int vacantNumber;
  private String category;
  private String aditionalServices;

  public Vehicle(int controlNumber, int vacantNumber, String category, String aditionalServices){
    this.controlNumber = controlNumber;
    this.vacantNumber = vacantNumber;
    this.category = category;
    this.aditionalServices = aditionalServices;
  }
}
