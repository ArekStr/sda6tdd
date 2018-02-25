package com.sda.Bank;

public class Acount {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
