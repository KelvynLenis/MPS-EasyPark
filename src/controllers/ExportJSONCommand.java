package controllers;
import java.util.ArrayList;

import models.User;

public class ExportJSONCommand extends ExportFileCommand {

    ExportJSONCommand(GenerateFiles generateFiles, ArrayList<User> users, String title) {
        super(generateFiles, users, title);
    }

    @Override
    void execute() {
        this.generateFiles.exportUsersAsJSON(users, title);
    }
    
}
