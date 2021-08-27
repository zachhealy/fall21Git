package com.mycompany.ch2;


public class cLab2{

    public static void main (String[] args) {
        Account account = newAccount(1122, 20000);
        Account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance is "+ account.getBalance());
        System.out.println("Monthly interest is "+account.getMonthlyInterest());
        System.out.println("This account was created at "+account.getDateCreated());
    }

}