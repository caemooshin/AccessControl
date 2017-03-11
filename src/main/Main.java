/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bankaccount.atm.ATM;
import bankaccount.bank.BankAccount;
import bankaccount.bank.BankTeller;

/**
 *
 * @author Y-V-D
 */
public class Main {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        BankAccount a = new BankAccount(1234,100.00);
        BankAccount b = new BankAccount(1274,100.00);
        BankTeller john = new BankTeller();
        john.deposit(a,100.00);
        
        ATM xyz = new ATM(222);
        xyz.withdraw(a,50.00);
          
        System.out.println("balance a : $" + a.getBalance());
        System.out.println("balance b : $" + b.getBalance());
        
        john.transferbank(a,b, 100.00); 
        john.transferbank(a,b, 30.00); 
        
        System.out.println("balance a : $" + a.getBalance());
        System.out.println("balance b : $" + b.getBalance());
    
    }
    } 