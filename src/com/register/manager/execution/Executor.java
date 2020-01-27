package com.register.manager.execution;

import com.register.manager.model.CurrentThread;
import com.register.manager.model.Login;

public class Executor {

    public void createTreads() {
        Thread[] threads = {new CurrentThread("First Thread", Login.GUFFAW.toString().toLowerCase()),
                new CurrentThread("Second Thread", Login.HITHERTO.toString().toLowerCase()),
                new CurrentThread("Third Thread", Login.LIGATURE.toString().toLowerCase()),
                new CurrentThread("Fourth Thread", Login.GUIDON.toString().toLowerCase()),
                new CurrentThread("Fifth Thread", Login.HOARY.toString().toLowerCase()),
                new CurrentThread("Sixth Thread", Login.LIMNER.toString().toLowerCase()),
                new CurrentThread("Seventh Thread", Login.GUILLOCHE.toString().toLowerCase()),
                new CurrentThread("Eighth Thread", Login.HOBBLEDEHOY.toString().toLowerCase()),
                new CurrentThread("Ninth Thread", Login.TITMOUSE.toString().toLowerCase()),
                new CurrentThread("Tenth Thread", Login.HOLYSTONE.toString().toLowerCase())
        };
        for (var thread : threads) {
            thread.start();
        }
    }
}