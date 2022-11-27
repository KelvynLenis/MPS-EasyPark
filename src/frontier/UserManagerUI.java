package frontier;

import java.util.Scanner;

import controllers.UserManager;

public class UserManagerUI {
  private Scanner userManagerUiInput = new Scanner(System.in);
  private String name;
  private String type;
  private String password;
  UserManager userManager = new UserManager();

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

    this.userManager.createUser(type, name, password);
  }

  public void getUser() {
    System.out.println("Digite o nome do usuário: ");
    name = userManagerUiInput.nextLine();
    System.out.println("Chamando Manager...");

    userManager.getUser(name);
  }

  public void listUsers(){
    System.out.println("Chamando Manager...");
    userManager.listUsers();
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
    
    userManager.updateUser(name, newName, type, password);
  }

  public void deleteUser(){
    System.out.println("Digite o nome do usuário: ");
    name = userManagerUiInput.nextLine();
    System.out.println("Chamando Manager...");
  
    userManager.deleteUser(name);
  }
  
}
