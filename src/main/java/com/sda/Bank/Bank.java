package com.sda.Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static int idCounter =0;
    private String name;
    private UserService userService;
    private List<Acount> accounts;

    public Bank(String name) {
        this.name = name;
        this.userService = new UserService();
        this.accounts = new ArrayList<>();
    }
    public int getNumberOfUsers(){
        return userService.getNumberOfUseres();
    }

    public boolean addUser(User user) {
        return userService.addUser(user);
    }

    public String getName() {
        return name;
    }

    public UserService getUserService() {
        return userService;
    }

    public List<Acount> getAccounts() {
        return accounts;
    }

    public Bank() {

    }
}

