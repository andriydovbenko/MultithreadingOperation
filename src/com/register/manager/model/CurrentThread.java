package com.register.manager.model;

import com.register.manager.service.AccountRecorder;

public class CurrentThread extends Thread {
    private String threadName;
    private String userLoginName;

    public CurrentThread(String threadName, String loginName) {
        this.threadName = threadName;
        this.userLoginName = loginName;
        Thread.currentThread().setName(threadName);
    }

    @Override
    public void run() {
        System.out.println("Thread " + this.threadName + " has started to work");
        Account account = new Account(this.userLoginName);
        AccountRecorder accountRecorder = AccountRecorder.getInstance();
        accountRecorder.addAccountToRepo(account);
        System.out.println("Thread " + this.threadName + " died\n");
    }
}