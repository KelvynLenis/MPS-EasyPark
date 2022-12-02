package frontier;

import java.util.Scanner;

public class MainUI {
  public static MainUI instance;
  
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

  public void getUserUI(){
    Scanner input = new Scanner(System.in);
    int opcao;
    boolean isRunning = true;

    while(isRunning){
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

      System.out.print("Digite a opção desejada: ");

      opcao = input.nextInt();

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

  public void getParkingLotUI(){
    System.out.println("***************************************");
    System.out.println("                MENU                   ");
    System.out.println("                                       ");
    System.out.println("OPÇÕES: ");
    System.out.println("0 - voltar");
    System.out.println("1 - Adicionar estacionamento");
    System.out.println("2 - Acessar estacionamento");
    System.out.println("3 - Atualizar estacionamento");
    System.out.println("4 - Deletar estacionamento");

  }



}
