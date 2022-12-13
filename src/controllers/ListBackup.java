package controllers;

import java.util.ArrayList;

public class ListBackup {
    private UserManager userManager;
    private ArrayList<UserListMemento> mementos;

    ListBackup(UserManager userManager) {
        this.userManager = userManager;
        this.mementos = new ArrayList<UserListMemento>();
    }

    void backup() {
        System.out.println("Backup: save memento");
        this.mementos.add(this.userManager.saveUserList());
    }

    void undo() {
        if (this.mementos.size() == 0) {
            System.out.println("Backup: no mementos");
        }

        UserListMemento memento = this.mementos.remove(this.mementos.size() - 1);
        this.userManager.restoreUserList(memento);
        System.out.println("Backup: memento restored");
    }
}
