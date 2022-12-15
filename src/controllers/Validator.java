package controllers;

import models.ParkingLot;

public class Validator {
  public boolean validateLogin(String login) {
    if(!(login.length() > 0 && login.length() <= 20)){
      System.out.println("Login Exception: Login can't be null and must be up 12 char long");
      return false;
    }

    return true;
  }

  public boolean validatePassword(String password) {
    if(!(password.length() >= 8 && password.length() <= 20)){
      System.out.println("Password Exception: Password must be at least 8 char long up to 12 char long");
      return false;
    }

    return true;
  }

  public boolean validateUserExists(String name) {
    ManagerFacade managerFacade = ManagerFacade.getInstance();

    if(managerFacade.getUser(name) != null){
      System.out.println("User Exception: User already exists");
      return true;
    }

    return false;
  }

  public boolean validateControlNumberAlreadyExists(int controlNumber) {
    ParkingLot parkingLot = ParkingLot.getInstance();


    if(parkingLot.listVehicles().contains(controlNumber)){
      System.out.println("Vehicle Exception: Vehicle already exists");
      return true;
    }

    return false;
  }
}
