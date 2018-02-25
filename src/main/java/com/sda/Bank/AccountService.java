package com.sda.Bank;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private static int counterId = 0;
    private List<Acount> accounts;

    public AccountService() {
        this.accounts = new ArrayList<>();


    }
    public int getNumberOfAccounts(){
        return accounts.size();
    }

    public boolean addAccount(Acount acount) {
        boolean result = false;
        if (acount != null) {
            acount.setId(counterId++);
            accounts.add(acount);
            result = true;
        }
        return result;

    }
}
