package frontier;

import java.util.Scanner;

public class MainUI {
  public static MainUI instance;
  
  boolean isRunning = true;
  int opcao;
  
  UserManagerUI userUI = new UserManagerUI();
  ParkingLotUI parkingLotUI = new ParkingLotUI();

  protected MainUI(){
  }

  public static MainUI getInstance(){
    if(instance == null){
      instance = new MainUI();

      return instance;
    }
    return instance;
  }

  public void getUserUI(Scanner nextInput){
    isRunning = true;

    while(isRunning){
      System.out.println("***************************************");
      System.out.println("                MENU                   ");
      System.out.println("                                       ");
      System.out.println("OPÇÕES: ");
      System.out.println("0 - Voltar");
      System.out.println("1 - Adicionar Usuário");
      System.out.println("2 - Acessar Usuário");
      System.out.println("3 - Listar Usuários");
      System.out.println("4 - Atualizar Usuário");
      System.out.println("5 - Deletar Usuário");

      System.out.print("Digite a opção desejada: ");

      opcao = nextInput.nextInt();

      switch (opcao) {
        case 0:
          isRunning = false;
          break;

        case 1:
          userUI.createUser();
        break;
        
        case 2:
          userUI.getUser();
        break;

        case 3:
          userUI.listUsers();
        break;

        case 4:
          userUI.updateUser();
        break;

        case 5:
          userUI.deleteUser();
        break;

        default:
          break;
      }
    }
  }

  public void getParkingLotUI(Scanner nextInput){
    isRunning = true;

    while(isRunning){
      System.out.println("***************************************");
      System.out.println("                MENU                   ");
      System.out.println("                                       ");
      System.out.println("OPÇÕES: ");
      System.out.println("0 - voltar");
      System.out.println("1 - Criar estacionamento");
      System.out.println("2 - Detalhes do estacionamento");
      System.out.println("3 - Editar estacionamento");
      System.out.println("4 - Deletar estacionamento");
      System.out.println("5 - Dar entrada no estacionamento");
      System.out.println("6 - Saida do estacionamento");
      System.out.println("7 - Listar Veículos");
      System.out.println("8 - Listar Empregados");
      System.out.println("9 - Adicionar empregado no estacionamento");
      System.out.println("10 - Remover empregado do estacionamento");

      System.out.print("Digite a opção desejada: ");

      opcao = nextInput.nextInt();

      switch (opcao) {
        case 0:
          isRunning = false;
          break;

        case 1:
          parkingLotUI.createParkingLot();
        break;
        
        case 2:
          parkingLotUI.getParkingLot();
        break;

        case 3:
          parkingLotUI.updateParkingLot(nextInput);
        break;

        case 4:
          parkingLotUI.deleteParkingLot();
        break;

        case 5:
          // parkingLotUI.addUserToParkingLot();
          parkingLotUI.parkingLotEntry();
        break;
        
        case 6:
          parkingLotUI.parkingLotExit();
        break;

        case 7:
          parkingLotUI.listUsersInParkingLot();
          break;

        case 8:
          parkingLotUI.listEmployeesInParkingLot();
          break;

        case 9:
          parkingLotUI.addEmployeeToParkingLot();
          break;
        
        case 10:
          parkingLotUI.removeEmployeeFromParkingLot();
          break;

        default:
          break;
      }
    }
  }
}
