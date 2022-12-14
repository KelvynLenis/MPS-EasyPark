package frontier;

import java.util.Scanner;

import controllers.ManagerFacade;
// import models.User;

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

  public void addUserToParkingLot(){
    System.out.print("Digite o nome do usuário: ");
    String name = parkingLotUiInput.next();
    managerFacade.addUser(name);
  }

  
  public void removeUserFromParkingLot(){
    System.out.print("Digite o nome do usuário: ");
    String name = parkingLotUiInput.next();
    managerFacade.removeUser(name);
  }

  public void listUsersInParkingLot(){
    managerFacade.listVehiclesInParkingLot();
  }

  public void listEmployeesInParkingLot(){
    managerFacade.listEmployeesInParkingLot();
  }

  public void parkingLotEntry(){
    System.out.print("Digite o código de controle: ");
    int controlNumber = parkingLotUiInput.nextInt();
    System.out.println("Selecione a categoria do veículo:\n1 - Pequeno 2 - Grande 3 - Moto");
    // System.out.println("1 - Pequeno 2 - Grande 3 - Moto");
    int vehicleCategory = parkingLotUiInput.nextInt();
    System.out.print("Serviços adicionais(opcional): ");
    String furtherServices = parkingLotUiInput.next();

    managerFacade.parkingLotEntry(controlNumber, vehicleCategory, furtherServices);
  }

  public void parkingLotExit(){
    System.out.print("Digite o código de controle: ");
    int controlNumber = parkingLotUiInput.nextInt();

    managerFacade.parkingLotExit(controlNumber);
  }

  public void addEmployeeToParkingLot(){
    System.out.print("Digite o nome do funcionário: ");
    String name = parkingLotUiInput.next();
    managerFacade.addEmployeeToParkingLot(name);
  }

  public void removeEmployeeFromParkingLot(){
    System.out.print("Digite o nome do funcionário: ");
    String name = parkingLotUiInput.next();
    managerFacade.removeEmployeeFromParkingLot(name);
  }
}
