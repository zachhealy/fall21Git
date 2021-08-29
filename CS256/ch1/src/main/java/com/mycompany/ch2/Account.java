package com.mycompany.ch2;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
        id = 0;
        balance = 0.0;
        annualInterestRate = 0;

    }
    public void newAccount(int nID, double nBalance, int newAIR){
        id = nID;
        balance = nBalance;
        annualInterestRate = newAIR;

    }
    public int getID(){
        return id;
        
    }
    public double getBalance(){
        return balance;

    }
    public double getAIR(){
        return annualInterestRate;

    }
    public void getDateCreated(Date newDateCreated){
        dateCreated = newDateCreated;

    }
    public double getMonthlyInterest(){
        return annualInterestRate/12;

    }

    public void setBalance(double newBal){
        balance = newBal;

    }
    public void setID(int newID){
        id = newID;

    }
    public void setAnnualInterestRate(int newAIR){
        id = newAIR;

    }

    public double withdrawl(double amount){
        return balance = balance - amount;

    }
    public double deposit(double amount){
        return balance = balance - amount;

    }
    
}
