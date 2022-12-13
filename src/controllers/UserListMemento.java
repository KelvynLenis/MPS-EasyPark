package controllers;

import java.util.ArrayList;
import java.util.Date;

import models.User;

/**
 * UserListMemento
 */
public interface UserListMemento {
    String getName();
    Date getDate();
    ArrayList<User> getList();
    
}