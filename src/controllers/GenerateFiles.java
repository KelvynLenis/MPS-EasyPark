package controllers;

import java.util.ArrayList;

import models.User;

public class GenerateFiles {

  public GenerateFiles(){
  }

  public void exportUsersAsJSON(ArrayList<User> users, String title) {
    ExportJSON exportObj = new ExportJSON(users, title);
    exportObj.exportUsers();
  }
  
  public void exportUsersAsTXT(ArrayList<User> users, String title) {
    ExportTXT exportObj = new ExportTXT(users, title);
    exportObj.exportUsers();
  }

  public void exportUsersAsPDF(ArrayList<User> users, String title) {
    ExportJSON exportObj = new ExportJSON(users, title);
    AdapterGenerator adapterGenerator = new AdapterGenerator(exportObj, title);
    adapterGenerator.getReportInPdf();
  }
}
