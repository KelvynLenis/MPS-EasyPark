package controllers;

import java.io.FileWriter;
import java.util.ArrayList;

import models.User;

public abstract class ExportTemplate {
    public ArrayList<User> users;
    public String fileName;

    public ExportTemplate(ArrayList<User> usersArg, String fileNameArg) {
        users = usersArg;
        fileName = fileNameArg;
    }

    public void setUsers(ArrayList<User> usersArg) {
        users = usersArg;
    }
    
    public ArrayList<User> getUsers() {
        return users;
    }

    public void exportUsers() {
        try (FileWriter writer = new FileWriter(fileName)) {
            exportUnique(writer);
        } catch (Exception e) {
            System.out.println("Erro ao escrever arquivo");
        }
    }

    public void exportUnique(FileWriter writer) throws Exception {}
}
