package controllers;

import java.util.ArrayList;

import models.ParkingLot;

public class ParkingLotManager {
  private ArrayList<ParkingLot> parkingLots = new ArrayList<ParkingLot>();
  
  public ParkingLotManager() {
    
  }

  public void createParkingLot() {
    ParkingLot parkingLot = new ParkingLot();
    
    this.parkingLots.add(parkingLot);
    System.out.println("Cadastro realizado com sucesso!");
  }

  public void getParkingLot() {

  }

  public void updateParkingLot() {

  }

  public void deleteParkingLot() {

  }

}
