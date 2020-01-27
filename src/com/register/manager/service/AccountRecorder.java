package com.register.manager.service;

import com.register.manager.model.Account;;

import java.util.ArrayList;
import java.util.List;

public class AccountRecorder {

    private static AccountRecorder instance;
    private List<Account> accountRepository = new ArrayList<>();

    private AccountRecorder() {
    }

    public static AccountRecorder getInstance() {
        if (instance == null) {
            synchronized (AccountRecorder.class) {
                if (instance == null) {
                    instance = new AccountRecorder();
                }
            }
        }
        return instance;
    }

    public void addAccountToRepo(Account account) {
        this.accountRepository.add(account);
        System.out.println("\nAccount: " + account.hashCode() + " was added to repository");
        printAccountInformIntoConsole(account);
    }

    private void printAccountInformIntoConsole(Account account) {
        System.out.println("Printing information about account: " + account.hashCode() + "\n" + account.toString());
    }
}