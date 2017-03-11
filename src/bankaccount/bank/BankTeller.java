/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount.bank;

/**
 *
 * @author Y-V-D
 */
public class BankTeller {
     public void deposit(BankAccount account, double amount) {
        boolean result = account.deposit(amount);
        if (result) {
            System.out.println("Successful deposit of $" + amount);
        } else {
            System.out.println("Error!");
        }
    }
    
    public void withdraw(BankAccount account, double amount) {
        boolean result = account.withdraw(amount);
        if (result) {
            System.out.println("Successful withdraw of $" + amount);
        } else {
            System.out.println("Error!");
        }
    }
    
    public void transferbank(BankAccount accountFrom, BankAccount accountTo, double amount) {
         
        if (amount > 0 && amount <= accountFrom.getBalance() *0.5) {
            accountFrom.withdraw(amount);
            accountTo.deposit(amount);
            
            System.out.println("Successful transfer of $" + amount);
        } else {
            System.out.println("Transfer unsuccessful");
        }
    }
}
