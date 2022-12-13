package controllers;

import java.util.ArrayList;
import java.util.Date;

import models.User;

public class UserListConcrete implements UserListMemento{
    private String name;
    private Date date;
    private ArrayList<User> users;

    UserListConcrete(String name, Date date, ArrayList<User> users) {
        this.name = name;
        this.date = date;
        this.users = users;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Date getDate() {
        return this.date;
    }

    @Override
    public ArrayList<User> getList() {
        return this.users;
    }
    
}
