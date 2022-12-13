package controllers;
import java.util.ArrayList;

import models.User;

public class ExportPDFCommand extends ExportFileCommand {
    ExportPDFCommand(GenerateFiles generateFiles, ArrayList<User> users, String title) {
        super(generateFiles, users, title);
    }
    
    @Override
    void execute() {
        this.generateFiles.exportUsersAsPDF(users, title);   
    }
}
