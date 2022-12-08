package controllers;

import java.util.ArrayList;

import models.User;

public class ManagerFacade {
  protected static UserManager userManager;
  protected ParkingLotManager parkingLotManager;
  protected GenerateFiles generateFiles;
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
    generateFiles = new GenerateFiles();
  }

  public void createUser(String type, String name, String password){
    userManager.createUser(type, name, password);
  }

  public User getUser(String name){
    User u = userManager.getUser(name);
    return u;
  }

  public static ArrayList<User> listUsers() {
    return userManager.listUsers();
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
    String owner
  ) {
    parkingLotManager.createParkingLot(name, address, zipcode, totalVacanciesNumber, owner);
  }

  public void getParkingLot() {
    parkingLotManager.getParkingLot();
  }

  public void updateParkingLot(int opcao, String newValue) {
    parkingLotManager.updateParkingLot(opcao, newValue);
  }
  public void updateParkingLot(int opcao, int newValue) {
    parkingLotManager.updateParkingLot(opcao, newValue);
  }

  public void deleteParkingLot() {
    parkingLotManager.deleteParkingLot();
  }

  public void addUser(String name){
    parkingLotManager.addUser(name);
  }

  public void removeUser(String name){
    parkingLotManager.removeUser(name);
  }

  public void listUsersInParkingLot(){
    parkingLotManager.listUsersInParkingLot();
  }

  public void addEmployeeToParkingLot(String name){
    parkingLotManager.addEmployee(name);
  }

  public void removeEmployeeFromParkingLot(String name){
    parkingLotManager.removeEmployee(name);
  }

  public void listEmployeesInParkingLot(){
    parkingLotManager.listEmployeesInParkingLot();
  }

  public void parkingLotEntry(String controlCode, int vehicleCategory, String furtherServices){
    parkingLotManager.parkingLotEntry(controlCode, vehicleCategory, furtherServices);
  }

  public void parkingLotExit(String controlCode){
    parkingLotManager.parkingLotExit(controlCode);
  }

  public void exportJSON(){
    ArrayList<User> users = ManagerFacade.listUsers();

    generateFiles.exportUsersAsJSON(users);
  }

  public void exportTXT(){
    ArrayList<User> users = ManagerFacade.listUsers();

    generateFiles.exportUsersAsTXT(users);
  }

}
