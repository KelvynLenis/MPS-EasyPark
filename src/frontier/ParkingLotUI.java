package frontier;

import java.util.Scanner;

import controllers.ParkingLotManager;
import models.ParkingLot;

public class ParkingLotUI {
  private Scanner parkingLotUiInput = new Scanner(System.in);
  private ParkingLotManager parkingLotManager = new ParkingLotManager();

  private String name;
  private String address;
  private String zipcode;
  private int totalVacanciesNumber;

  public void createParkingLot() {
    System.out.println("Digite o nome do estacionamento do sistema: ");
    name = parkingLotUiInput.nextLine();
    System.out.println("Digite o endereço do usuário: ");
    address = parkingLotUiInput.nextLine();
    System.out.println("Digite o CEP: ");
    zipcode = parkingLotUiInput.nextLine();
    System.out.println("Digite o número de vagas: ");
    totalVacanciesNumber = parkingLotUiInput.nextInt();    
  }

  public void getParkingLot() {
    parkingLotManager.getParkingLot();
  }

  public void updateParkingLot() {
    System.out.println("Digite o novo nome do estacionamento: ");
    String newName = parkingLotUiInput.nextLine();
    System.out.println("Digite o novo endereço: ");
    address = parkingLotUiInput.nextLine();
    System.out.println("Digite o novo CEP: ");
    zipcode = parkingLotUiInput.nextLine();
    System.out.println("Digite o novo número de vagas: ");
    totalVacanciesNumber = parkingLotUiInput.nextInt();
    System.out.println("Digite o novo dono: ");
    String ownerName = parkingLotUiInput.nextLine();

    parkingLotManager.updateParkingLot();
  }

  public void deleteParkingLot() {
    System.out.println("Digite o nome do estacionamento: ");
    name = parkingLotUiInput.nextLine();
  
    parkingLotManager.deleteParkingLot();
  }

}
