import java.util.Scanner;

import frontier.UserManagerUI;

public class Main {
  public static void main(String[] args) throws Exception {
    
    UserManagerUI userUI = new UserManagerUI();
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


      System.out.print("Digite a opção desejada: ");
      opcao = nextInput.nextInt();

      switch (opcao) {
        case 0:
          nextInput.close();
          System.exit(0);
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
}
