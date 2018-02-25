package com.sda.Bank;

public class Users {
    private String name;
    private int Id;
    private String firstName;
    private String lastName;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Users( String firstName, String lastName) {


        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Users() {
    }
}
