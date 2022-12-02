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
    System.out.print("Digite o tipo de usuário do sistema: ");
    type = userManagerUiInput.nextLine();
    System.out.print("Digite o nome do usuário: ");
    name = userManagerUiInput.nextLine();
    System.out.print("Digite a senha: ");
    password = userManagerUiInput.nextLine();

    System.out.print("Chamando Manager...");

    this.managerFacade.createUser(type, name, password);
  }

  public void getUser() {
    System.out.print("Digite o nome do usuário: ");
    name = userManagerUiInput.nextLine();

    managerFacade.getUser(name);
  }

  public void listUsers(){
    managerFacade.listUsers();
  }

  public void updateUser(){
    System.out.print("Digite o nome do usuário: ");
    name = userManagerUiInput.nextLine();
    System.out.print("Digite o novo nome do usuário: ");
    String newName = userManagerUiInput.nextLine();
    System.out.print("Digite o tipo de usuário do sistema: ");
    type = userManagerUiInput.nextLine();
    System.out.print("Digite a senha: ");
    password = userManagerUiInput.nextLine();
    
    managerFacade.updateUser(name, newName, type, password);
  }

  public void deleteUser(){
    System.out.print("Digite o nome do usuário: ");
    name = userManagerUiInput.nextLine();
  
    managerFacade.deleteUser(name);
  }

  public void exportUsersAsJSON(){
    // userManager.exportUsersAsJSON();
  }

  public void exportUsersAsTXT(){
    // userManager.exportUsersAsTXT();
  }
  
}
