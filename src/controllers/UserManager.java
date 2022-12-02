package controllers;

import java.util.ArrayList;

import models.User;

public class UserManager {
  private ArrayList<User> users = new ArrayList<User>();

  Validator validator = new Validator();

  public void createUser(String type, String name, String password){
    validator.validateLogin(name);
    validator.validatePassword(password);

    User user = new User(name, password, type);

    this.users.add(user);

    System.out.println("Cadastro realizado com sucesso!");
  }

  public User getUser(String name){
    for(User u : users){
      if(name.equals(u.getName())){
        System.out.println("Name: " + u.getName());
        System.out.println("Type: " + u.getType());

        return u;
      }

      System.out.println("Failed to find this user!");
    }
    return null;
  }

  public void listUsers() {
    for(User u: users){
      System.out.println("Name: " + u.getName());
      System.out.println("Type: " + u.getType());
    }
  }

  public void updateUser(String name, String newName, String newType, String newPassword){
    for(User user : users){
      if(name.toLowerCase().equals(user.getName().toLowerCase())){
        user.setName((!newName.isEmpty() ? newName : user.getName()));
        user.setType((!newType.isEmpty() ? newType : user.getType()));
        user.setPassword(newPassword);
        return;
      }
    }

    System.out.println("Failed to update this user!");
  }

  public void deleteUser(String name){
    for(User user : users){
      if(!users.remove(user)){
        System.out.println("User not found!");
      }
    }
  }
}
