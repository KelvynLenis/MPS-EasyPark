package controllers;

import models.ParkingLot;
import models.User;

public class ParkingLotManager {

  private ParkingLot parkingLot;

  protected ParkingLotManager(){
  }

  public void createParkingLot(
    String name,
    String address,
    String zipcode,
    int totalVacanciesNumber,
    String owner
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

  public void updateParkingLot(int opcao, String newValue) {
    switch (opcao) {
      case 0:
        break;

      case 1:
        parkingLot.setName(newValue);  
      break;
      
      case 2:
      parkingLot.setAddress(newValue);
      break;
      
      case 3:
      parkingLot.setZipcode(newValue);
      break;
      
      case 5:
        parkingLot.setOwner(newValue);
      break;

      default:
      break;
    }
    System.out.println("Atualização realizada com sucesso!");
  }

  public void updateParkingLot(int opcao, int newValue){
    parkingLot.setVacanciesNumber(newValue);
  }

  public void deleteParkingLot() {
    this.parkingLot = null;
  }

}
