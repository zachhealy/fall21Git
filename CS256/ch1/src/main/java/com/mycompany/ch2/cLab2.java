/*  
Author: Zach Healy
Date: 8/29/2021
Purpose: This code will make an account, then allow the account holder to make deposits, 
         withdrawls, and see any needed info about the account.
*/

package com.mycompany.ch2;

import java.util.Date;

public class cLab2{

    public static void main (String[] args) {
        Account account = new Account(1122, 20000.0);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance is "+ account.getBalance());
        System.out.println("Monthly interest is "+account.getMonthlyInterest());
        System.out.println("This account was created at "+account.getDateCreated());
    }


    static class Account {
        private int id;
        private double balance;
        private double annualInterestRate;
        private Date dateCreated = new Date();
    
        public Account(){
            id = 0;
            balance = 0.0;
            annualInterestRate = 0;
    
        }
        public Account(int nID, double nBalance){
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
        public Date getDateCreated(){
            return dateCreated;
    
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
        public void setAnnualInterestRate(double newAIR){
            annualInterestRate = newAIR;
    
        }
    
        public double withdraw(double amount){
            return balance = balance - amount;
    
        }
        public double deposit(double amount){
            return balance = balance + amount;
    
        }
        
    }
    

}