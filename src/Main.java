import java.util.Scanner;

import controllers.ManagerFacade;
import frontier.MainUI;
import frontier.ParkingLotUI;
import frontier.UserManagerUI;

public class Main {
  public static void main(String[] args) throws Exception {
    
    // UserManagerUI userUI = new UserManagerUI();
    // ParkingLotUI parkingLotUI = new ParkingLotUI();
    MainUI mainUI = MainUI.getInstance();
    
    ManagerFacade managerFacade = ManagerFacade.getInstance();
    managerFacade.startManagers();
    
    Scanner nextInput = new Scanner(System.in);
    int opcao;

    while(true){
      System.out.println("***************************************");
      System.out.println("                MENU                   ");
      System.out.println("                                       ");
      System.out.println("OPÇÕES: ");
      System.out.println("0 - Sair do programa");
      System.out.println("1 - Gerir Usuário");
      System.out.println("2 - Gerir Estacionamentos");

      System.out.print("Digite a opção desejada: ");
      opcao = nextInput.nextInt();

      switch (opcao) {
        case 0:
          nextInput.close();
          System.exit(0);
        break;

        case 1:
          mainUI.getUserUI();
        break;
        
        case 2:
          mainUI.getParkingLotUI();
        break;

        case 6:
          userUI.exportUsersAsJSON();
        break;
        
        case 7:
          userUI.exportUsersAsTXT();
        break;

        default:
          break;
      }
    }
  }
}
