package frontier;

import java.util.Scanner;

import controllers.ManagerFacade;
import models.User;

public class ParkingLotUI {
  private Scanner parkingLotUiInput = new Scanner(System.in);
  private ManagerFacade managerFacade = ManagerFacade.getInstance();

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
    System.out.print("Digite o do dono: ");
    String owner = parkingLotUiInput.next();   

    
    managerFacade.createParkingLot(name, address, zipcode, totalVacanciesNumber, owner);
  }

  public void getParkingLot() {
    managerFacade.getParkingLot();
  }

  public void updateParkingLot(Scanner nextInput) {

    boolean isRunning = true;

    while(isRunning){

      System.out.println("***************************************");
      System.out.println("                MENU                   ");
      System.out.println("                                       ");
      System.out.println("OPÇÕES: ");
      System.out.println("0 - Voltar");
      System.out.println("1 - Alterar nome");
      System.out.println("2 - Alterar endereço");
      System.out.println("3 - Alterar CEP");
      System.out.println("4 - Alterar o número total de vagas");
      System.out.println("5 - Alterar o dono");

      System.out.print("Digite a opção desejada: ");


      int opcao;

      opcao = nextInput.nextInt();

      switch (opcao) {
        case 0:
          isRunning = false;
          break;

        case 1:
          System.out.print("Digite o novo nome do estacionamento: ");
          name = parkingLotUiInput.nextLine();
          if(name.length() <= 0){
            name = parkingLotUiInput.nextLine();
          }
          managerFacade.updateParkingLot(opcao, name);
          break;
        
        case 2:
          System.out.print("Digite o novo endereço: ");
          address = parkingLotUiInput.nextLine();
          managerFacade.updateParkingLot(opcao, address);
          break;
        
        case 3:
          System.out.print("Digite o novo CEP: ");
          zipcode = parkingLotUiInput.nextLine();
          managerFacade.updateParkingLot(opcao, zipcode);
          break;
        
        case 4:
          System.out.print("Digite o novo número de vagas: ");
          totalVacanciesNumber = parkingLotUiInput.nextInt();
          managerFacade.updateParkingLot(opcao, totalVacanciesNumber);
          break;
        
        case 5:
          System.out.print("Digite o novo dono: ");
          String ownerName = parkingLotUiInput.nextLine();
          managerFacade.updateParkingLot(opcao, ownerName);
          break;
  
        default:
        break;
      }
    }
  }

  public void deleteParkingLot() {
    System.out.print("Digite o nome do estacionamento: ");
    name = parkingLotUiInput.nextLine();
  
    managerFacade.deleteParkingLot();
  }

}
