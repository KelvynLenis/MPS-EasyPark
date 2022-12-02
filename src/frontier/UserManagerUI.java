package frontier;

import java.util.Scanner;

import controllers.ManagerFacade;

public class UserManagerUI {
  private Scanner userManagerUiInput = new Scanner(System.in);
  private ManagerFacade managerFacade = ManagerFacade.getInstance();

  private String name;
  private String type;
  private String password;

  public UserManagerUI(){
  }

  public void createUser(){
    System.out.println("Digite o tipo de usuário do sistema: ");
    type = userManagerUiInput.nextLine();
    System.out.println("Digite o nome do usuário: ");
    name = userManagerUiInput.nextLine();
    System.out.println("Digite a senha: ");
    password = userManagerUiInput.nextLine();

    System.out.println("Chamando Manager...");

    this.managerFacade.createUser(type, name, password);
  }

  public void getUser() {
    System.out.println("Digite o nome do usuário: ");
    name = userManagerUiInput.nextLine();
    System.out.println("Chamando Manager...");

    managerFacade.getUser(name);
  }

  public void listUsers(){
    System.out.println("Chamando Manager...");
    managerFacade.listUsers();
  }

  public void updateUser(){
    System.out.println("Digite o nome do usuário: ");
    name = userManagerUiInput.nextLine();
    System.out.println("Digite o novo nome do usuário: ");
    String newName = userManagerUiInput.nextLine();
    System.out.println("Digite o tipo de usuário do sistema: ");
    type = userManagerUiInput.nextLine();
    System.out.println("Digite a senha: ");
    password = userManagerUiInput.nextLine();

    System.out.println("Chamando Manager...");
    
    managerFacade.updateUser(name, newName, type, password);
  }

  public void deleteUser(){
    System.out.println("Digite o nome do usuário: ");
    name = userManagerUiInput.nextLine();
    System.out.println("Chamando Manager...");
  
    managerFacade.deleteUser(name);
  }
  
}
