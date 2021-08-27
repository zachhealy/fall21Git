package com.mycompany.ch2;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(){
        id = 0;
        balance = 0.0;
        annualInterestRate = 0;

    }
    public newAccount(int nID, double nBalance){
        id = nID;
        balance = nBalance;

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
    public double getMonthlyInterest(){
        return balance * annualInterestRate;

    }

    public void setBalance(double newBal){
        balance = newBal;

    }
}
