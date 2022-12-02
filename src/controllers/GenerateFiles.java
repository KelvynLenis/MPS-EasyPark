package controllers;

import java.util.ArrayList;

import models.User;

public class GenerateFiles {

  public GenerateFiles(){
  }

  public void exportUsersAsJSON(ArrayList<User> users) {
    ExportJSON exportObj = new ExportJSON(users, "Output.json");
    exportObj.exportUsers();
  }
  
  public void exportUsersAsTXT(ArrayList<User> users) {
    ExportTXT exportObj = new ExportTXT(users, "Output.txt");
    exportObj.exportUsers();
  }
}
