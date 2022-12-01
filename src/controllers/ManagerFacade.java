package controllers;

public class ManagerFacade {
  protected UserManager userManager;
  protected ParkingLotManager parkingLotManager;

  public void startManagers(){
    userManager = new UserManager();
    parkingLotManager = new ParkingLotManager();
  }
}
