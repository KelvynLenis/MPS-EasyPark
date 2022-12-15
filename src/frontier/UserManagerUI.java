package frontier;

import java.util.Scanner;
import controllers.ManagerFacade;

public class UserManagerUI {
  private Scanner userManagerUiInput = new Scanner(System.in);
  private ManagerFacade managerFacade = ManagerFacade.getInstance();

  private String name;
  private String type;
  private String password;

  public void createUser(){
    System.out.print("Informe o tipo de usuário do sistema: ");
    type = userManagerInformet.nextLine();
    System.out.print("Informe o nome do usuário: ");
    name = userManagerUiInput.nextLine();
    System.out.print("Informe a sua senha: ");
    password = userManagerUiInput.nextLine();


    this.managerFacade.createUser(type, name, password);
  }

  public void getUser() {
    System.out.print("Informe o nome do usuário: ");
    name = userManagerUiInput.nextLine();

    managerFacade.getUser(name);
  }

  public void listUsers(){
    ManagerFacade.listUsers();
  }

  public void updateUser(){
    System.out.print("Informe o nome do usuário: ");
    name = userManagerUiInput.nextLine();
    System.out.print("Informe o novo nome do usuário: ");
    String newName = userManagerUiInput.nextLine();
    System.out.print("Informe o tipo de usuário do sistema: ");
    type = userManagerUiInput.nextLine();
    System.out.print("Informe a sua senha: ");
    password = userManagerUiInput.nextLine();
    
    managerFacade.updateUser(name, newName, type, password);
  }

  public void deleteUser(){
    System.out.print("Informe o nome do usuário: ");
    name = userManagerUiInput.nextLine();
  
    managerFacade.deleteUser(name);
  }
}