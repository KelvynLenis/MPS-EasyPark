package controllers;

import models.ParkingLot;
import models.User;

public class ParkingLotManager {

  private ParkingLot parkingLot;

  public ParkingLotManager(){
  }

  public void createParkingLot(
    String name,
    String address,
    String zipcode,
    int totalVacanciesNumber,
    User owner
  ) {

    parkingLot = ParkingLot.getInstance();
    parkingLot.setAll(name, address, zipcode, totalVacanciesNumber, owner);
        
    System.out.println("Cadastro realizado com sucesso!");
  }

  public void getParkingLot() {
    System.out.println(this.parkingLot.getName());
    System.out.println(this.parkingLot.getAddress());
    System.out.println(this.parkingLot.getZipcode());
    System.out.println(this.parkingLot.getVacanciesNumber());
    System.out.println((parkingLot.getOwner() != null) ? parkingLot.getOwner() : "");
  }

  public void updateParkingLot(
    String newName, String newAddress,
    String newZipcode, int newVacanciesNumber, String newOwnerName
  ) {    
    parkingLot.setName(newName);
    parkingLot.setAddress(newAddress);
    parkingLot.setZipcode(newZipcode);
    parkingLot.setVacanciesNumber(newVacanciesNumber);
    System.out.println("Atualização realizada com sucesso!");
  }

  public void deleteParkingLot() {
    this.parkingLot = null;
  }

}
