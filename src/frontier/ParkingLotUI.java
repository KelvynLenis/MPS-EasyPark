package frontier;

import java.util.Scanner;

import controllers.ManagerFacade;

public class ParkingLotUI {
  private Scanner parkingLotUiInput = new Scanner(System.in);
  private ManagerFacade managerFacade = ManagerFacade.getInstance();

  private String name;
  private String address;
  private String zipcode;
  private int totalVacanciesNumber;

  public void createParkingLot() {
    System.out.print("Informe o nome do estacionamento: ");
    name = parkingLotUiInput.nextLine();
    System.out.print("Informe o endereço: ");
    address = parkingLotUiInput.nextLine();
    System.out.print("Informe o CEP: ");
    zipcode = parkingLotUiInput.nextLine();
    System.out.print("Informe o número de vagas: ");
    totalVacanciesNumber = parkingLotUiInput.nextInt();   
    System.out.print("Informe o do dono: ");
    String owner = parkingLotUiInput.next();   

    
    managerFacade.createParkingLot(name, address, zipcode, totalVacanciesNumber, owner);
  }

  public void getParkingLot() {
    managerFacade.getParkingLot();
  }

  public void updateParkingLot(Scanner nextInput) {

    boolean isRunning = true;

    while(isRunning){

      System.out.println("****************************************************");
      System.out.println("                MENU - EasyPark             ");
      System.out.println("                                            ");
      System.out.println("SELECIONE UMA DAS OPÇÕES ABAIXO: ");
      System.out.println("0 - Voltar");
      System.out.println("1 - Alterar nome");
      System.out.println("2 - Alterar endereço");
      System.out.println("3 - Alterar CEP");
      System.out.println("4 - Alterar o número total de vagas");
      System.out.println("5 - Alterar o dono");

      System.out.print("Informe a sua opção desejada: ");


      int opcao;

      opcao = nextInput.nextInt();

      switch (opcao) {
        case 0:
          isRunning = false;
          break;

        case 1:
          System.out.print("Informe o novo nome do estacionamento: ");
          name = parkingLotUiInput.nextLine();
          if(name.length() <= 0){
            name = parkingLotUiInput.nextLine();
          }
          managerFacade.updateParkingLot(opcao, name);
          break;
        
        case 2:
          System.out.print("Informe o novo endereço: ");
          address = parkingLotUiInput.nextLine();
          managerFacade.updateParkingLot(opcao, address);
          break;
        
        case 3:
          System.out.print("Informe o novo CEP: ");
          zipcode = parkingLotUiInput.nextLine();
          managerFacade.updateParkingLot(opcao, zipcode);
          break;
        
        case 4:
          System.out.print("Informe o novo número de vagas: ");
          totalVacanciesNumber = parkingLotUiInput.nextInt();
          managerFacade.updateParkingLot(opcao, totalVacanciesNumber);
          break;
        
        case 5:
          System.out.print("Informe o novo dono: ");
          String ownerName = parkingLotUiInput.nextLine();
          managerFacade.updateParkingLot(opcao, ownerName);
          break;
  
        default:
        break;
      }
    }
  }

  public void deleteParkingLot() {
    System.out.print("Informe o nome do estacionamento: ");
    name = parkingLotUiInput.nextLine();
  
    managerFacade.deleteParkingLot();
  }

  public void addUserToParkingLot(){
    System.out.print("Informe o nome do usuário: ");
    String name = parkingLotUiInput.next();
    managerFacade.addUser(name);
  }

  
  public void removeUserFromParkingLot(){
    System.out.print("Informe o nome do usuário: ");
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
    System.out.print("Informe o código de controle: ");
    int controlNumber = parkingLotUiInput.nextInt();
    System.out.println("Selecione a categoria do veículo:\n1 - Pequeno 2 - Grande 3 - Moto");
    int vehicleCategory = parkingLotUiInput.nextInt();
    System.out.print("Serviços adicionais(sim/nao): ");
    String aditionalServices = parkingLotUiInput.next();
    if ( aditionalServices.equals("sim") ) {
      System.out.print("Informe o serviço adicional: ");
      aditionalServices = parkingLotUiInput.next();
    } else {
      aditionalServices = "";
    }

    managerFacade.parkingLotEntry(controlNumber, vehicleCategory, aditionalServices);
  }

  public void parkingLotExit(){
    System.out.print("Informe o código de controle: ");
    int controlNumber = parkingLotUiInput.nextInt();

    System.out.print("Informe o método de pagamento(pix, credito, debito ou boleto): ");
    String methodPayment = parkingLotUiInput.next();

    managerFacade.parkingLotExit(controlNumber, methodPayment);
  }

  public void addEmployeeToParkingLot(){
    System.out.print("Informe o nome do funcionário: ");
    String name = parkingLotUiInput.next();
    managerFacade.addEmployeeToParkingLot(name);
  }

  public void removeEmployeeFromParkingLot(){
    System.out.print("Informe o nome do funcionário: ");
    String name = parkingLotUiInput.next();
    managerFacade.removeEmployeeFromParkingLot(name);
  }
}
