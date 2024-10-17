package com.dmdev.multithread.account;

public class Account {

    private static int generator = 1;
    private int money;
    private int id;

    public Account(int money) {
        this.money = money;
        this.id = generator++;
    }

    public void add(int money) {
        this.money += money;
    }

    public boolean takeOff(int money) {
        if (this.money >= money) {
            this.money -= money;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                ", id=" + id +
                '}';
    }
}
