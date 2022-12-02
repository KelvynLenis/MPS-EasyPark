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
    String newZipcode, int newVacanciesNumber, String newOwnerName, User newOwner
  ) {    
    parkingLot.setName((newName != null || newName.length() >= 0) ? newName : parkingLot.getName());
    parkingLot.setAddress((newAddress != null || newAddress.length() >= 0) ? newAddress : parkingLot.getAddress() );
    parkingLot.setZipcode((newZipcode != null || newZipcode.length() >= 0) ? newZipcode : parkingLot.getZipcode() );
    parkingLot.setVacanciesNumber((newVacanciesNumber >= 0) ? newVacanciesNumber : parkingLot.getVacanciesNumber() );
    ManagerFacade managerFacade = ManagerFacade.getInstance();
    parkingLot.setOwner((newOwnerName != null || newOwnerName.length() >= 0) ? managerFacade.getUser(newOwnerName) : parkingLot.getOwner());
    System.out.println("Atualização realizada com sucesso!");
  }

  public void deleteParkingLot() {
    this.parkingLot = null;
  }

}
