package controllers;

import java.io.FileWriter;
import java.util.ArrayList;

import models.User;

public class ExportTXT extends ExportTemplate {

    ExportTXT (ArrayList<User> users, String fileName) {
        super(users, fileName);
    }

    @Override
    public void exportUnique(FileWriter writer) throws Exception {
        String acc = "";
        int counter = 0;
        for(User user : users) {
            String idString = String.format("User %s: ", counter) + System.lineSeparator();
            String nameString = "name: " + user.getName() + System.lineSeparator();
            String typeString = "type: " + user.getType() + System.lineSeparator() + System.lineSeparator();
            acc = acc + idString + nameString + typeString;
            counter++;
        }
        writer.write(acc);
    }
}
