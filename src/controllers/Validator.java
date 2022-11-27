package controllers;

public class Validator {
  public void validateLogin(String login) {
    if(!(login.length() >= 8 && login.length() <= 20)){
      System.out.println("Login Exception: Login can't be null and must be up 12 char long");
    }
  }

  public void validatePassword(String password) {
    if(!(password.length() >= 8 && password.length() <= 20)){
      System.out.println("Password Exception: Password must be at least 8 char long up to 12 char long");
    }
  }
}
