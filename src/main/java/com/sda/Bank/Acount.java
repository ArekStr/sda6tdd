package com.sda.Bank;

public class Acount {
    private int userId;
    private long amount;

    public Acount() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Acount(int userId, long amount) {
        this.userId = userId;
        this.amount = amount;

    }
}
