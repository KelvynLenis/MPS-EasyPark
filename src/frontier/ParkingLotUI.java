package frontier;

import java.util.Scanner;

import controllers.ParkingLotManager;

public class ParkingLotUI {
  private Scanner parkingLotUiInput = new Scanner(System.in);
  private ParkingLotManager parkingLotManager = new ParkingLotManager();

  private String name;
  private String address;
  private String zipcode;
  private int totalVacanciesNumber;

  public void createParkingLot() {
    System.out.print("Digite o nome do estacionamento: ");
    name = parkingLotUiInput.nextLine();
    System.out.print("Digite o endereço: ");
    address = parkingLotUiInput.nextLine();
    System.out.print("Digite o CEP: ");
    zipcode = parkingLotUiInput.nextLine();
    System.out.print("Digite o número de vagas: ");
    totalVacanciesNumber = parkingLotUiInput.nextInt();   
    
    parkingLotManager.createParkingLot(name, address, zipcode, totalVacanciesNumber, null);
  }

  public void getParkingLot() {
    parkingLotManager.getParkingLot();
  }

  public void updateParkingLot() {

    System.out.print("Digite o novo nome do estacionamento: ");
    name = parkingLotUiInput.nextLine();
    if(name.length() <= 0){
      name = parkingLotUiInput.nextLine();
    }
    System.out.print("Digite o novo endereço: ");
    address = parkingLotUiInput.nextLine();
    System.out.print("Digite o novo CEP: ");
    zipcode = parkingLotUiInput.nextLine();
    System.out.print("Digite o novo número de vagas: ");
    totalVacanciesNumber = parkingLotUiInput.nextInt();
    System.out.print("Digite o novo dono: ");
    String ownerName = parkingLotUiInput.nextLine();

    parkingLotManager.updateParkingLot(name, address, zipcode, totalVacanciesNumber, ownerName);
  }

  public void deleteParkingLot() {
    System.out.print("Digite o nome do estacionamento: ");
    name = parkingLotUiInput.nextLine();
  
    parkingLotManager.deleteParkingLot();
  }

}
