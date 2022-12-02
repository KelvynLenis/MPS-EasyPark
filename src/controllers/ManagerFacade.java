package controllers;

import models.User;

public class ManagerFacade {
  protected UserManager userManager;
  protected ParkingLotManager parkingLotManager;
  public static ManagerFacade instance;

  protected ManagerFacade(){
  }

  public static ManagerFacade getInstance(){
    if(instance == null) {
      instance = new ManagerFacade();
      return instance;
    }
    return instance;
  }

  public void startManagers(){
    userManager = new UserManager();
    parkingLotManager = new ParkingLotManager();
  }

  public void createUser(String type, String name, String password){
    userManager.createUser(type, name, password);
  }

  public User getUser(String name){
    User u = userManager.getUser(name);
    return u;
  }

  public void listUsers() {
    userManager.listUsers();
  }

  public void updateUser(String name, String newName, String newType, String newPassword){
    userManager.updateUser(name, newName, newType, newPassword);
  }

  public void deleteUser(String name){
    userManager.deleteUser(name);
  }

  public void createParkingLot(
    String name,
    String address,
    String zipcode,
    int totalVacanciesNumber,
    User owner
  ) {
    parkingLotManager.createParkingLot(name, address, zipcode, totalVacanciesNumber, owner);
  }

  public void getParkingLot() {
    parkingLotManager.getParkingLot();
  }

  public void updateParkingLot(
    String newName, String newAddress,
    String newZipcode, int newVacanciesNumber, String newOwnerName
  ) {
    parkingLotManager.updateParkingLot(newName, newAddress, newZipcode, newVacanciesNumber, newOwnerName, null);
  }

  public void deleteParkingLot() {
    parkingLotManager.deleteParkingLot();
  }

}
