import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
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


      System.out.println("Digite a opção desejada: ");
      opcao = nextInput.nextInt();

      switch (opcao) {
        case 0:
          System.exit(0);
        break;

        case 1:
          
        break;
        
        case 2:
        
        break;

        case 3:
        
        break;

        case 4:
        
        break;

        case 5:
        
        break;

        default:
          break;
      }
    }
  }
}
