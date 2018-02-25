package com.sda.Bank;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.junit.Test;

public class BankTest {

    private Bank bank;

    public void init() {
        this.bank = new Bank("test");
    }

    @Test
    public void shouldAddNewUser() {
        //given
        Bank bank = new Bank("test");
        User user = new User("Arek", "Strenk");

        //when
        boolean result = bank.addUser(user);

        //Then
        Assert.assertTrue("method retured false", result);

        Assert.assertEquals("user is not present in bank list", 1, bank.getNumberOfUsers());
    }

    @Test
    public void shouldNotAddNullUser() {
        //given
        User user = null;
        //when
        boolean result = bank.addUser(user);
        //then
        Assert.assertFalse("method ruterned true", result);
        Assert.assertEquals("User is present in bank list", 0, bank.getNumberOfUsers());
    }
}


