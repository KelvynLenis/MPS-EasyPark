package controllers;
import java.util.ArrayList;

import models.User;

public class ExportTXTCommand extends ExportFileCommand {

    ExportTXTCommand(GenerateFiles generateFiles, ArrayList<User> users, String title) {
        super(generateFiles, users, title);
    }

    @Override
    void execute() {
        this.generateFiles.exportUsersAsTXT(users, title);
    }
}
