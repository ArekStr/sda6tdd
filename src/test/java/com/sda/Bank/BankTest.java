package com.sda.Bank;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

public class BankTest {

    private Bank bank;
@Before
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
    @Test
    public void shouldCreateAccountForGivenUser(){
        //given
        UserService mockUserService = Mockito.mock(UserService.class);
        AccountService mockAccountService = Mockito.mock(AccountService.class);

        Mockito.when(mockUserService.addUser(Mockito.any(User.class))).thenReturn(true);
        Mockito.when(mockUserService.getNumberOfUseres()).thenReturn(1);
        Mockito.when(mockUserService.isUserPresent(Mockito.any(Integer.class))).thenReturn(true);

        Mockito.when(mockAccountService.addAccount(Mockito.any(Acount.class))).thenReturn(true);
        Mockito.when(mockAccountService.getNumberOfAccounts()).thenReturn(1);

        bank.setAccountService(mockAccountService);
        bank.setUserService(mockUserService);

        User user = new User("Darek", "Szpak");
        Acount acount = new Acount(0,0);



        //when
        boolean userAddResult= bank.addUser(user);
        boolean accountAddResult= bank.createAccount(0, acount);



        //then
        Assert.assertTrue("User is not present in bank list", userAddResult);
        Assert.assertEquals("User is not present in bank list", bank.getNumberOfUsers());
        Assert.assertTrue("Acount is not present in bank list", accountAddResult);
        Assert.assertEquals("Acount is not present in bank list", 1, bank.getNumberOfAccounts());
    }
    @Test
    public void shouldNotCreateAccountForNotExistingUser(){
        //given
        Acount acount = new Acount(10,0);
        UserService userService = Mockito.mock(UserService.class);
        AccountService mockAccountService = Mockito.mock(AccountService.class);

        Mockito.when(userService.isUserPresent(Mockito.any(Integer.class))) .thenReturn(false);
        Mockito.when(mockAccountService.addAccount(Mockito.any(Acount.class))).thenReturn(false);
        Mockito.when(mockAccountService.getNumberOfAccounts()).thenReturn(0);

        bank.setUserService(userService);
        bank.setAccountService(mockAccountService);

        //when
        boolean result = bank.createAccount(10,acount);


        //then
        Assert.assertFalse("account is created",result);
        Assert.assertEquals("account is present", 0,bank.getNumberOfAccounts());
    }
}


