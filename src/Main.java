import java.util.Scanner;

import controllers.ManagerFacade;
import frontier.MainUI;

public class Main {
  public static void main(String[] args) throws Exception {
    
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
      System.out.println("2 - Gerir Estacionamento");
      System.out.println("3 - Exportar relátorio em JSON");
      System.out.println("4 - Exportar relátorio em TXT");
      System.out.println("5 - Exportar relátorio em PDF");

      System.out.print("Digite a opção desejada: ");
      opcao = nextInput.nextInt();

      switch (opcao) {
        case 0:
          nextInput.close();
          System.exit(0);
        break;

        case 1:
          mainUI.getUserUI(nextInput);
        break;
        
        case 2:
          mainUI.getParkingLotUI(nextInput);
        break;

        case 3:
          managerFacade.exportJSON();
          break;
        
        case 4:
          managerFacade.exportTXT();
        break;

        case 5:
          managerFacade.exportPDF();

        break;

        default:
          break;
      }
    }
  }
}
