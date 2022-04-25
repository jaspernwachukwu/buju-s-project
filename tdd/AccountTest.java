package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountTest {

    @Test
    public void accountCanBeCreatedTest() {
        //given how i created my account
        Account nepaAccount = new Account();
        //when i check my balance
        int balance = nepaAccount.getbalance();
        //confirm that my balance is zero
        assertEquals(0, balance);
    }

    @Test
    public void DepositMoneyTest() {
        //given i have an account
        Account boyoAccount = new Account();
        //when i deposit money
        boyoAccount.deposit(1_500);
        //check my balance has changed
        assertEquals(1500, boyoAccount.getbalance());
    }

    @Test
    public void depositTwiceTest() {
        Account uselessBank = new Account();
        uselessBank.deposit(1500);
        uselessBank.deposit(3000);
        assertEquals(4500, uselessBank.getbalance());
    }

    @Test
    @DisplayName("Deposit negative amount should not change balance test")
    public void depositNegativeAmountTest() {
        //given that i have an account
        //when i deposit money
        //check my balance has changed
        // given that i have an account
        //    when i deposit negative amount
        //    check my balance has not changed
        Account johneryAccount = new Account();
        johneryAccount.deposit(-1000);
        assertEquals(0, johneryAccount.getbalance());
    }

    @Test
    @DisplayName("amount should change the balance")
    public void WithdrawFactor() {
        Account zenithBank = new Account();
        zenithBank.deposit(30000);
        zenithBank.withdraw(1500);
        assertEquals(28500, zenithBank.getbalance());
    }


    @Test
    @DisplayName("negative amount can not be withdrawn")
    public void WithdrawNegative() {
        Account fidelityBank = new Account();
        fidelityBank.deposit(30000);
        fidelityBank.withdrawnegative(-1500);
        assertEquals(30000,fidelityBank.getbalance());
    }

    @Test
    @DisplayName("amount should change the balance")
    public void WithdrawHigherAmount() {
        Account uba = new Account();
        uba.deposit(30000);
        uba.withdrawhigher(70000);
        assertEquals(30000,uba.getbalance());

    }
    
}



