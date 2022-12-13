package controllers;
import java.util.ArrayList;

import models.User;

public abstract class ExportFileCommand {
    public GenerateFiles generateFiles;
    public ArrayList<User> users;
    public String title;

    ExportFileCommand(GenerateFiles generateFiles, ArrayList<User> users, String title) {
        this.generateFiles = generateFiles;
        this.users = users;
        this.title = title;
    }

    abstract void execute();
}