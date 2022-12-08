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
    parkingLot.setAllAtributes(name, address, zipcode, totalVacanciesNumber, owner);
        
    System.out.println("Cadastro realizado com sucesso!");
  }

  public void getParkingLot() {
    System.out.println(this.parkingLot.getName());
    System.out.println(this.parkingLot.getAddress());
    System.out.println(this.parkingLot.getZipcode());
    System.out.println("Total vacancies: " + this.parkingLot.getVacanciesNumber());
    System.out.println("Available vacancies: " + this.parkingLot.getAvailableVacanciesNumber());
    System.out.println((parkingLot.getOwner() != null) ? parkingLot.getOwner() : "");
    System.out.println("Veículos atualmente no estacionamento: " + (this.parkingLot.getVacanciesNumber() - this.parkingLot.getAvailableVacanciesNumber()));
    System.out.println("Empregados do estacionamento: " + this.parkingLot.getEmployeesNumber());
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

  public void addUser(String name){
    ManagerFacade managerFacade = ManagerFacade.getInstance();
    User user = managerFacade.getUser(name);
    parkingLot.addUser(user);
  }

  public void removeUser(String name){
    ManagerFacade managerFacade = ManagerFacade.getInstance();
    User user = managerFacade.getUser(name);
    parkingLot.removeUser(user);
  }

  public void listUsersInParkingLot(){
    if(this.parkingLot.listUsers() == null){
      System.out.println("Estacionamento está vazio...");
      return;
    }
    System.out.println("Usuários atualmente no estacionamento: " + this.parkingLot.listUsers());
  }

  public void addEmployee(String name){
    ManagerFacade managerFacade = ManagerFacade.getInstance();
    User employee = managerFacade.getUser(name);
    parkingLot.addEmployee(employee);
  }
  public void removeEmployee(String name){
    ManagerFacade managerFacade = ManagerFacade.getInstance();
    User employee = managerFacade.getUser(name);
    parkingLot.removeEmployee(employee);
  }

  public void listEmployeesInParkingLot(){
    if(this.parkingLot.listEmployees() == null){
      System.out.println("Nenhum funcionário cadastrado no estacionamento...");
      return;
    }
    System.out.println("Empregados do estacionamento: " + this.parkingLot.listEmployees());
  }

  public void parkingLotEntry(String controlCode, int vehicleCategory, String furtherServices){
    parkingLot.parkingLotEntry(controlCode, vehicleCategory, furtherServices);
  }

  public void parkingLotExit(String controlCode){
    parkingLot.parkingLotExit(controlCode);
  }

}
