package controllers;

import java.io.FileWriter;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import models.User;

public class ExportJSON extends ExportTemplate {

    ExportJSON (ArrayList<User> users, String fileName) {
        super(users, fileName);
    }

    @Override
    public void exportUnique(FileWriter writer) throws Exception {
        Gson gson = new GsonBuilder().create();
        gson.toJson(users, writer);
    }
}
