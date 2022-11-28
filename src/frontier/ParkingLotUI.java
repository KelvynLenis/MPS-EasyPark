package frontier;

import java.util.Scanner;

public class ParkingLotUI {
  private Scanner parkingLotUiInput = new Scanner(System.in);

  private String name;
  private String address;
  private String zipcode;
  private int vacancies;

  public void createParkingLot() {
    System.out.println("Digite o nome do estacionamento do sistema: ");
    name = parkingLotUiInput.nextLine();
    System.out.println("Digite o endereço do usuário: ");
    address = parkingLotUiInput.nextLine();
    System.out.println("Digite o CEP: ");
    zipcode = parkingLotUiInput.nextLine();
    System.out.println("Digite o número de vagas: ");
    vacancies = parkingLotUiInput.nextInt();

    System.out.println("Chamando Manager...");

    
  }

  public void getParkingLot() {

  }

  public void listParkingLot() {

  }

  public void updateParkingLot() {

  }

  public void deleteParkingLot() {

  }

}
