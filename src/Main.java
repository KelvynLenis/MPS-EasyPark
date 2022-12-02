import java.util.Scanner;

import frontier.ParkingLotUI;
import frontier.UserManagerUI;

public class Main {
  public static void main(String[] args) throws Exception {
    
    UserManagerUI userUI = new UserManagerUI();
    ParkingLotUI parkingLotUI = new ParkingLotUI();
    Scanner nextInput = new Scanner(System.in);
    int opcao;

    while(true){
      System.out.println("***************************************");
      System.out.println("                MENU                   ");
      System.out.println("                                       ");
      System.out.println("OPÇÕES: ");
      System.out.println("0 - Sair do programa");
      System.out.println("1 - Adicionar Usuário");
      System.out.println("2 - Acessar Usuário");
      System.out.println("3 - Listar Usuários");
      System.out.println("4 - Atualizar Usuário");
      System.out.println("5 - Deletar Usuário");
      System.out.println("6 - Exportar Usuários JSON");
      System.out.println("7 - Exportar Usuários TXT");


      System.out.print("Digite a opção desejada: ");
      opcao = nextInput.nextInt();

      switch (opcao) {
        case 0:
          nextInput.close();
          System.exit(0);
        break;

        case 1:
          userUI.createUser();
          // parkingLotUI.createParkingLot();
        break;
        
        case 2:
          // userUI.getUser();
          parkingLotUI.getParkingLot();
        break;

        case 3:
          // userUI.listUsers();
          // parkingLotUI.
        break;

        case 4:
          // userUI.updateUser();
          parkingLotUI.updateParkingLot();
        break;

        case 5:
          // userUI.deleteUser();
          parkingLotUI.deleteParkingLot();
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
